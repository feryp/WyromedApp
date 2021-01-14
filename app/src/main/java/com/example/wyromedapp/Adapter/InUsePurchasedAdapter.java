package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.InUseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.InUsePurchasedViewHolder;

import java.util.List;

public class InUsePurchasedAdapter extends RecyclerView.Adapter<InUsePurchasedViewHolder> {

    private Context context;
    private List<InUseItem> inUseItemList;

    public InUsePurchasedAdapter(Context context, List<InUseItem> inUseItemList) {
        this.context = context;
        this.inUseItemList = inUseItemList;
    }

    @NonNull
    @Override
    public InUsePurchasedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new InUsePurchasedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InUsePurchasedViewHolder holder, int position) {
        holder.tvNamaBarangPurchased.setText(inUseItemList.get(position).getNamaBarang());

        holder.tvTitleOperation.setVisibility(View.VISIBLE);
        holder.tvCountTimer.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return inUseItemList.size();
    }
}
