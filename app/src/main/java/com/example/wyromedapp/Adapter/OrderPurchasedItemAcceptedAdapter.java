package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OrderPurchasedItemAcceptedViewHolder;

import java.util.List;

class OrderPurchasedItemAcceptedAdapter extends RecyclerView.Adapter<OrderPurchasedItemAcceptedViewHolder> {

    private Context context;
    private List<OrderPurchasedItem> orderPurchasedItemList;

    public OrderPurchasedItemAcceptedAdapter(Context context, List<OrderPurchasedItem> orderPurchasedItemList) {
        this.context = context;
        this.orderPurchasedItemList = orderPurchasedItemList;
    }

    @NonNull
    @Override
    public OrderPurchasedItemAcceptedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new OrderPurchasedItemAcceptedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderPurchasedItemAcceptedViewHolder holder, int position) {
        holder.tvNamaBarangBeli.setText(orderPurchasedItemList.get(position).getNamaBarang());

        holder.tvTitleStatus.setVisibility(View.VISIBLE);
        holder.tvStatus.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return orderPurchasedItemList.size();
    }
}
