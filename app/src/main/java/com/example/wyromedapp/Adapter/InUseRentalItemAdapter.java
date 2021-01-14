package com.example.wyromedapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.InUseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.InUseRentalItemViewHolder;

import java.util.List;

public class InUseRentalItemAdapter extends RecyclerView.Adapter<InUseRentalItemViewHolder> {

    private Context context;
    private List<InUseItem> inUseItemList;

    public InUseRentalItemAdapter(Context context, List<InUseItem> inUseItemList) {
        this.context = context;
        this.inUseItemList = inUseItemList;
    }

    @NonNull
    @Override
    public InUseRentalItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_item,parent,false);
        return new InUseRentalItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InUseRentalItemViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(inUseItemList.get(position).getNamaBarang());

        holder.tvTitleOperation.setVisibility(View.VISIBLE);
        holder.tvCountTimer.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return inUseItemList.size();
    }
}
