package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.InUseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.InUsePurchasedItemViewHolder;

import java.util.List;

public class InUsePurchasedItemAdapter extends RecyclerView.Adapter<InUsePurchasedItemViewHolder> {

    private Context context;
    private List<InUseItem> inUseItemList;

    public InUsePurchasedItemAdapter(Context context, List<InUseItem> inUseItemList) {
        this.context = context;
        this.inUseItemList = inUseItemList;
    }

    @NonNull
    @Override
    public InUsePurchasedItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item,parent,false);
        return new InUsePurchasedItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InUsePurchasedItemViewHolder holder, int position) {
        holder.tvNamaBarangPurchased.setText(inUseItemList.get(position).getNamaBarang());

        holder.tvTitleOperation.setVisibility(View.VISIBLE);
        holder.tvCountTimer.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return inUseItemList.size();
    }
}
