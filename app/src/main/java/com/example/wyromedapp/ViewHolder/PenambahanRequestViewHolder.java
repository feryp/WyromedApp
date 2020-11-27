package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class PenambahanRequestViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNamaBarang;
    public TextView tvJumlahRequest;

    public PenambahanRequestViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarang = itemView.findViewById(R.id.tv_nama_barang_stock_request);
        tvJumlahRequest = itemView.findViewById(R.id.tv_jumlah_stock_request);

    }
}
