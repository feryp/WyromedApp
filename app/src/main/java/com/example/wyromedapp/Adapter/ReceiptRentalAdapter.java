package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.FinishRentalItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.ReceiptRentalViewHolder;

import java.util.List;

public class ReceiptRentalAdapter extends RecyclerView.Adapter<ReceiptRentalViewHolder> {

    private final Context context;
    private final List<FinishRentalItem> receiptRentalItemList;

    public ReceiptRentalAdapter(Context context, List<FinishRentalItem> receiptRentalItemList) {
        this.context = context;
        this.receiptRentalItemList = receiptRentalItemList;
    }

    @NonNull
    @Override
    public ReceiptRentalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item_finish,parent,false);
        return new ReceiptRentalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ReceiptRentalViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(receiptRentalItemList.get(position).getNamaBarang());
        holder.tvStatusOperation.setText(receiptRentalItemList.get(position).getStatusOperation());
        holder.tvTotalTimer.setText(receiptRentalItemList.get(position).getTotalTimer());
    }

    @Override
    public int getItemCount() {
        return receiptRentalItemList.size();
    }
}
