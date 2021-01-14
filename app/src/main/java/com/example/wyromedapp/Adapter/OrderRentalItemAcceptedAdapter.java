package com.example.wyromedapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderRentalItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OrderRentalItemAcceptedViewHolder;

import java.util.List;

public class OrderRentalItemAcceptedAdapter extends RecyclerView.Adapter<OrderRentalItemAcceptedViewHolder> {

    private Context context;
    private List<OrderRentalItem> orderRentalItemList;

    public OrderRentalItemAcceptedAdapter(Context context, List<OrderRentalItem> orderRentalItemList) {
        this.context = context;
        this.orderRentalItemList = orderRentalItemList;
    }

    @NonNull
    @Override
    public OrderRentalItemAcceptedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item,parent,false);
        return new OrderRentalItemAcceptedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderRentalItemAcceptedViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(orderRentalItemList.get(position).getNamaBarang());

        holder.tvTitleStatus.setVisibility(View.VISIBLE);
        holder.tvStatusAccepted.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return orderRentalItemList.size();
    }
}
