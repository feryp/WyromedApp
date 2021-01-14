package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class OrderPurchasedItemAcceptedViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNamaBarangBeli;
    public TextView tvTitleStatus;
    public TextView tvStatus;

    public OrderPurchasedItemAcceptedViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangBeli = itemView.findViewById(R.id.tv_nama_barang_purchased_order);
        tvTitleStatus = itemView.findViewById(R.id.tv_title_status_purchased_order);
        tvStatus = itemView.findViewById(R.id.tv_status_purchased_order);
    }
}
