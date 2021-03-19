package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OperationPurchasedViewHolder;

import java.util.List;

public class OperationPurchasedAdapter extends RecyclerView.Adapter<OperationPurchasedViewHolder> {

    private final Context context;
    private final List<OrderPurchasedItem> operationItemList;

    public OperationPurchasedAdapter(Context context, List<OrderPurchasedItem> operationItemList) {
        this.context = context;
        this.operationItemList = operationItemList;
    }

    @NonNull
    @Override
    public OperationPurchasedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new OperationPurchasedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OperationPurchasedViewHolder holder, int position) {
        holder.tvNamaBarangPurchased.setText(operationItemList.get(position).getNamaBarang());
        holder.tvJumlahKuntitas.setText(String.valueOf(operationItemList.get(position).getJumlahKuantitas()));

    }

    @Override
    public int getItemCount() {
        return operationItemList.size();
    }
}
