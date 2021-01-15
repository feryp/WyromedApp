package com.example.wyromedapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.InUseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.InUseRentalViewHolder;

import java.util.List;

public class InUseRentalAdapter extends RecyclerView.Adapter<InUseRentalViewHolder> {

    private final Context context;
    private final List<InUseItem> inUseItemList;

    public InUseRentalAdapter(Context context, List<InUseItem> inUseItemList) {
        this.context = context;
        this.inUseItemList = inUseItemList;
    }

    @NonNull
    @Override
    public InUseRentalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item,parent,false);
        return new InUseRentalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InUseRentalViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(inUseItemList.get(position).getNamaBarang());

        holder.tvTitleOperation.setVisibility(View.VISIBLE);
        holder.tvCountTimer.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return inUseItemList.size();
    }
}
