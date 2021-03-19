package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

import org.w3c.dom.Text;

public class ConfirmRentalItemViewHolder extends RecyclerView.ViewHolder  {

    public TextView tvNamaBarangRental;
    public TextView tvStatusConfirmRental;

    public ConfirmRentalItemViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNamaBarangRental = itemView.findViewById(R.id.tv_nama_barang_rental_order);
        tvStatusConfirmRental = itemView.findViewById(R.id.tv_status_rental_order);

    }
}
