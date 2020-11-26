package com.example.wyromedapp.ViewHolder;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;

public class StockViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvNamaBarang;
    public TextView tvJumlahInventory;
    public TextView tvSatuan;
    public TextView tvKuantitas;
    public AppCompatImageButton minus;
    public AppCompatImageButton plus;

    SharedPreferences sharedPref;

    private ItemClickListener itemClickListener;

    int kuantitas = 0;

    public StockViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarang = itemView.findViewById(R.id.tv_nama_barang_stock);
        tvJumlahInventory = itemView.findViewById(R.id.tv_jumlah_inventory_stock);
        tvSatuan = itemView.findViewById(R.id.tv_satuan_inventory_stock);
        tvKuantitas = itemView.findViewById(R.id.tv_kuantitas_stock);
        minus = itemView.findViewById(R.id.btn_minus);
        plus = itemView.findViewById(R.id.btn_plus);

        tvKuantitas.setText("0");
    }

    @Override
    public void onClick(View v) {

        int value = kuantitas;
        Context context = itemView.getContext();

//        SharedPreferences.Editor editor = sharedPref.edit();

        switch (v.getId()){
            case R.id.btn_plus:
                if (kuantitas < 100)
                    kuantitas = kuantitas + 1;
                tvKuantitas.setText(String.valueOf(kuantitas));

//                value = Integer.parseInt(tvKuantitas.getText().toString());
//                editor.putInt(tvNamaBarang.getText().toString(), value);
//                editor.apply();

                break;

            case R.id.btn_minus:
                if (kuantitas > 100)
                    kuantitas = kuantitas - 1;
                tvKuantitas.setText(String.valueOf(kuantitas));

                break;
        }
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener i){
        this.itemClickListener = i;
    }
}
