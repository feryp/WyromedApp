package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class OperationPurchasedViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNamaBarangPurchased;
    public TextView tvJumlahKuntitas;

    public OperationPurchasedViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangPurchased = itemView.findViewById(R.id.tv_nama_barang_purchased_order);
        tvJumlahKuntitas = itemView.findViewById(R.id.tv_amount_qty_purchased_order);
    }
}
