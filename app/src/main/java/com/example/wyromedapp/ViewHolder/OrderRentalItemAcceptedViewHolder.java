package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class OrderRentalItemAcceptedViewHolder extends RecyclerView.ViewHolder{

    public TextView tvNamaBarangRental;
    public TextView tvTitleStatus;
    public TextView tvStatusAccepted;

    public OrderRentalItemAcceptedViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarangRental = itemView.findViewById(R.id.tv_nama_barang_rental_order);
        tvTitleStatus = itemView.findViewById(R.id.tv_title_status_rental_order);
        tvStatusAccepted = itemView.findViewById(R.id.tv_status_rental_order);
    }
}
