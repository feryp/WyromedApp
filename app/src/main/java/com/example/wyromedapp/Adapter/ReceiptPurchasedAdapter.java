package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.Model.ReceiptOrderPurchased;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.ReceiptPurchasedViewHolder;

import java.util.List;

public class ReceiptPurchasedAdapter extends RecyclerView.Adapter<ReceiptPurchasedViewHolder> {

    private final Context context;
    private final List<ReceiptOrderPurchased> orderPurchasedList;

    public ReceiptPurchasedAdapter(Context context, List<ReceiptOrderPurchased> orderPurchasedList) {
        this.context = context;
        this.orderPurchasedList = orderPurchasedList;
    }

    @NonNull
    @Override
    public ReceiptPurchasedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new ReceiptPurchasedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReceiptPurchasedViewHolder holder, int position) {
        holder.tvNamaBarangBeli.setText(orderPurchasedList.get(position).getNamaBarang());
        holder.tvJumlahBarangDipakai.setText(String.valueOf(orderPurchasedList.get(position).getJumlahBarangDipakai()));

        holder.tvTitleJumlahBarangDipakai.setVisibility(View.VISIBLE);
        holder.tvJumlahBarangDipakai.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return orderPurchasedList.size();
    }
}
