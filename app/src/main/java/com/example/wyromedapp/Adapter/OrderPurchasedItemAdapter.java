package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OrderPurchasedItemViewHolder;

import java.util.List;

public class OrderPurchasedItemAdapter extends RecyclerView.Adapter<OrderPurchasedItemViewHolder> {

    private Context context;
    private List<OrderPurchasedItem> orderPurchasedItemList;

    public OrderPurchasedItemAdapter(Context context, List<OrderPurchasedItem> orderPurchasedItemList) {
        this.context = context;
        this.orderPurchasedItemList = orderPurchasedItemList;
    }

    @NonNull
    @Override
    public OrderPurchasedItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new OrderPurchasedItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderPurchasedItemViewHolder holder, int position) {
        holder.tvNamaBarangBeli.setText(orderPurchasedItemList.get(position).getNamaBarang());
        holder.tvJumlahKuantitas.setText(String.valueOf(orderPurchasedItemList.get(position).getJumlahKuantitas()));
    }

    @Override
    public int getItemCount() {
        return orderPurchasedItemList.size();
    }
}
