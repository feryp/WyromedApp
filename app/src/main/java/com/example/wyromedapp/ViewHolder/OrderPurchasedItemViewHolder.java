package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class OrderPurchasedItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNamaBarangBeli;
    public TextView tvTitleJumlahBarangBeli;
    public TextView tvJumlahBarangBeli;

    public OrderPurchasedItemViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarangBeli = itemView.findViewById(R.id.tv_nama_barang_purchased_order);
        tvTitleJumlahBarangBeli = itemView.findViewById(R.id.tv_title_amount_qty_purchased_order);
        tvJumlahBarangBeli = itemView.findViewById(R.id.tv_amount_qty_purchased_order);
    }
}
