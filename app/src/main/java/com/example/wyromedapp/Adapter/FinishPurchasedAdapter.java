package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.FinishPurchaseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.FinishPurchasedViewHolder;

import java.util.List;

public class FinishPurchasedAdapter extends RecyclerView.Adapter<FinishPurchasedViewHolder> {

    private final Context context;
    private final List<FinishPurchaseItem> finishPurchaseItemList;

    public FinishPurchasedAdapter(Context context, List<FinishPurchaseItem> finishPurchaseItemList) {
        this.context = context;
        this.finishPurchaseItemList = finishPurchaseItemList;
    }

    @NonNull
    @Override
    public FinishPurchasedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_purchased_item_finish,parent,false);
        return new FinishPurchasedViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FinishPurchasedViewHolder holder, int position) {
        holder.tvNamaBarangPurchased.setText(finishPurchaseItemList.get(position).getNamaBarang());
        try {
            holder.tvJumlahBarang.setText(String.valueOf(finishPurchaseItemList.get(position).getJumlahBarang()));
        } catch (Resources.NotFoundException ex){
            holder.tvJumlahBarang.setText("0");
        }
    }

    @Override
    public int getItemCount() {
        return finishPurchaseItemList.size();
    }
}
