package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class HistorySalesViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNoSales;
    public TextView tvHistorySalesDate;

    public HistorySalesViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNoSales = itemView.findViewById(R.id.tv_no_order_history_sales);
        tvHistorySalesDate = itemView.findViewById(R.id.tv_date_history_sales);
    }
}
