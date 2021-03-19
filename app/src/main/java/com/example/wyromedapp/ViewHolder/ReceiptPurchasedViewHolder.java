package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class ReceiptPurchasedViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNamaBarangBeli;
    public TextView tvJumlahBarangDipakai;

    public ReceiptPurchasedViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangBeli = itemView.findViewById(R.id.tv_nama_barang_purchased_order);
        tvJumlahBarangDipakai = itemView.findViewById(R.id.tv_amount_qty_purchased_order);
    }
}
