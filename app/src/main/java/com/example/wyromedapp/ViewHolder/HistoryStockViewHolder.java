package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class HistoryStockViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNoRequest;
    public TextView tvHistoryStockDate;
    public TextView tvStatusRequestStock;

    public HistoryStockViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNoRequest = itemView.findViewById(R.id.tv_no_request_history_stock);
        tvHistoryStockDate = itemView.findViewById(R.id.tv_date_history_stock);
        tvStatusRequestStock = itemView.findViewById(R.id.tv_status_history_stock);
    }
}
