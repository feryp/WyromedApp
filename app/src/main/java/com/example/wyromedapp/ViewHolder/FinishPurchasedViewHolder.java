package com.example.wyromedapp.ViewHolder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;

public class FinishPurchasedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvNamaBarangPurchased;
    public TextView tvJumlahBarang;
    public ImageButton minus;
    public ImageButton plus;

    SharedPreferences sharedPref;

    int jumlah = 0;

    private ItemClickListener itemClickListener;

    public FinishPurchasedViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangPurchased = itemView.findViewById(R.id.tv_nama_barang_purchased_order_finish);
        tvJumlahBarang = itemView.findViewById(R.id.tv_jumlah_barang_finish);

        tvJumlahBarang.setText("0");

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        int value = jumlah;
        Context context = itemView.getContext();
        SharedPreferences.Editor editor = sharedPref.edit();

        switch (v.getId()){
            case R.id.btn_plus_amount:
                if (jumlah < 100)
                    jumlah = jumlah + 1;
                tvJumlahBarang.setText(String.valueOf(jumlah));

                value = Integer.parseInt(tvJumlahBarang.getText().toString());
                editor.putInt(tvNamaBarangPurchased.getText().toString(), value);
                editor.apply();
                break;

            case R.id.btn_minus_amount:
                if (jumlah > 100)
                    jumlah = jumlah - 1;
                tvJumlahBarang.setText(String.valueOf(jumlah));
                break;
        }

        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener i){
        this.itemClickListener = i;
    }
}
