package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class InUsePurchasedItemViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNamaBarangPurchased;
    public TextView tvTitleOperation;
    public TextView tvCountTimer;

    public InUsePurchasedItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangPurchased = itemView.findViewById(R.id.tv_nama_barang_purchased_order);
        tvTitleOperation = itemView.findViewById(R.id.tv_title_operation_purchased_order);
        tvCountTimer = itemView.findViewById(R.id.tv_stopwatch_purchased_order);
    }
}
