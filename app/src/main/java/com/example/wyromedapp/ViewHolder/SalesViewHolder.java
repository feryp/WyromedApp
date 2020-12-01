package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class SalesViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNoOrder;
    public TextView tvSalesDate;
    public TextView tvStatus;

    public SalesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNoOrder = itemView.findViewById(R.id.tv_order_sales);
        tvSalesDate = itemView.findViewById(R.id.tv_tgl_sales);
        tvStatus = itemView.findViewById(R.id.tv_status_sales);
    }
}
