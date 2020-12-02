package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class DetailSalesPurchaseItemViewHolder extends RecyclerView.ViewHolder {

    public TextView namaBarang, hargaBarang, kuantitasBarang, totalHarga;

    public DetailSalesPurchaseItemViewHolder(@NonNull View itemView) {
        super(itemView);

        namaBarang = itemView.findViewById(R.id.tv_detail_sales_item_name);
        hargaBarang = itemView.findViewById(R.id.tv_detail_sales_item_price);
        kuantitasBarang = itemView.findViewById(R.id.tv_detail_sales_kuantitas_item);
        totalHarga = itemView.findViewById(R.id.tv_detail_sales_total_price_item);
    }
}
