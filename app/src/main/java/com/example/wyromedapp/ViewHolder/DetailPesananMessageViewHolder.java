package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;

public class DetailPesananMessageViewHolder extends RecyclerView.ViewHolder{

    public TextView namaBarang, jumlahBarang, statusBarang;


    public DetailPesananMessageViewHolder(@NonNull View itemView) {
        super(itemView);

        namaBarang = itemView.findViewById(R.id.tv_nama_barang_pesanan);
        jumlahBarang = itemView.findViewById(R.id.tv_jumlah_barang_pesanan);
        statusBarang = itemView.findViewById(R.id.tv_status_barang_pesanan);
    }


}
