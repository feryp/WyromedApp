package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderRentalItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.ConfirmRentalItemViewHolder;

import java.util.List;

public class ConfirmRentalItemAdapter extends RecyclerView.Adapter<ConfirmRentalItemViewHolder> {

    private final Context context;
    private final List<OrderRentalItem> orderRentalItemList;

    public ConfirmRentalItemAdapter(Context context, List<OrderRentalItem> orderRentalItemList) {
        this.context = context;
        this.orderRentalItemList = orderRentalItemList;
    }

    @NonNull
    @Override
    public ConfirmRentalItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item,parent,false);
        return new ConfirmRentalItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ConfirmRentalItemViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(orderRentalItemList.get(position).getNamaBarang());
        holder.tvStatusConfirmRental.setText(orderRentalItemList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return orderRentalItemList.size();
    }
}
