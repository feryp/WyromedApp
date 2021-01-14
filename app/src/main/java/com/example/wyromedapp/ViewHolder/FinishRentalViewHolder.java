package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class FinishRentalViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNamaBarangRental;
    public TextView tvStatusOperation;
    public TextView tvTotalTimer;

    public FinishRentalViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangRental = itemView.findViewById(R.id.tv_nama_barang_rental_order_finish);
        tvStatusOperation = itemView.findViewById(R.id.tv_status_operation_rental_order_finish);
        tvTotalTimer = itemView.findViewById(R.id.tv_total_timer_rental_order);
    }
}
