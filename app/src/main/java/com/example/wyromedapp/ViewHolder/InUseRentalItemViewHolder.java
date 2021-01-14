package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class InUseRentalItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNamaBarangRental;
    public TextView tvTitleOperation;
    public TextView tvCountTimer;

    public InUseRentalItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaBarangRental = itemView.findViewById(R.id.tv_nama_barang_rental_order);
        tvTitleOperation = itemView.findViewById(R.id.tv_title_operation_rental_order);
        tvCountTimer = itemView.findViewById(R.id.tv_stopwatch_rental_order);
    }
}
