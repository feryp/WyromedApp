package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class OrderRentalItemViewHolder extends RecyclerView.ViewHolder  {

    public TextView tvNamaBarangRental;

    public OrderRentalItemViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarangRental = itemView.findViewById(R.id.tv_nama_barang_rental_order);
    }
}
