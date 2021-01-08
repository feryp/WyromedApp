package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class MyBookingViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNoOrder;
    public TextView tvBookingDate;
    public TextView tvStatus;

    public MyBookingViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNoOrder = itemView.findViewById(R.id.tv_order_booking);
        tvBookingDate = itemView.findViewById(R.id.tv_tgl_order_booking);
        tvStatus = itemView.findViewById(R.id.tv_status_booking);
    }
}
