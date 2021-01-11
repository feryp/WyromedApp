package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class HistoryBookingViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNoOrder;
    public TextView tvHistoryBookingDate;

    public HistoryBookingViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNoOrder = itemView.findViewById(R.id.tv_no_order_history_booking);
        tvHistoryBookingDate = itemView.findViewById(R.id.tv_date_history_booking);
    }
}
