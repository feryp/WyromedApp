package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;

public class DetailTablePesananViewHolder extends RecyclerView.ViewHolder{

    public TextView namaBarang, jumlahBarang;


    public DetailTablePesananViewHolder(@NonNull View itemView) {
        super(itemView);

        namaBarang = itemView.findViewById(R.id.tv_nama_barang_field_pesanan);
        jumlahBarang = itemView.findViewById(R.id.tv_jumlah_barang_field_pesanan);
    }


}
