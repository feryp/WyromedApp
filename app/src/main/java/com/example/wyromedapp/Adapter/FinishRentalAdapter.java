package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.FinishRentalItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.FinishRentalViewHolder;

import java.util.List;

public class FinishRentalAdapter extends RecyclerView.Adapter<FinishRentalViewHolder> {

    private final Context context;
    private final List<FinishRentalItem> finishRentalItemList;

    public FinishRentalAdapter(Context context, List<FinishRentalItem> finishRentalItemList) {
        this.context = context;
        this.finishRentalItemList = finishRentalItemList;
    }

    @NonNull
    @Override
    public FinishRentalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item_finish,parent,false);
        return new FinishRentalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FinishRentalViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(finishRentalItemList.get(position).getNamaBarang());
        holder.tvStatusOperation.setText(finishRentalItemList.get(position).getStatusOperation());
        holder.tvTotalTimer.setText(finishRentalItemList.get(position).getTotalTimer());
    }

    @Override
    public int getItemCount() {
        return finishRentalItemList.size();
    }
}
