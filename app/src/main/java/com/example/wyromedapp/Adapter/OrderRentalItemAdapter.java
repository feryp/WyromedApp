package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderRentalItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OrderRentalItemViewHolder;

import java.util.List;

public class OrderRentalItemAdapter extends RecyclerView.Adapter<OrderRentalItemViewHolder> {

    private Context context;
    private List<OrderRentalItem> orderRentalItemList;

    public OrderRentalItemAdapter(Context context, List<OrderRentalItem> orderRentalItemList) {
        this.context = context;
        this.orderRentalItemList = orderRentalItemList;
    }

    @NonNull
    @Override
    public OrderRentalItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item,parent,false);
        return new OrderRentalItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderRentalItemViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(orderRentalItemList.get(position).getNamaBarang());
    }

    @Override
    public int getItemCount() {
        return orderRentalItemList.size();
    }
}
