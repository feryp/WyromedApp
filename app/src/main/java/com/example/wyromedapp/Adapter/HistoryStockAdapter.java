package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.HistoryStock;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.HistoryStockViewHolder;

import java.util.List;

public class HistoryStockAdapter extends RecyclerView.Adapter<HistoryStockViewHolder> {

    private final Context context;
    private final List<HistoryStock> historyStockList;

    public HistoryStockAdapter(Context context, List<HistoryStock> historyStockList) {
        this.context = context;
        this.historyStockList = historyStockList;
    }

    @NonNull
    @Override
    public HistoryStockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_history_stock,parent,false);
        return new HistoryStockViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryStockViewHolder holder, int position) {
        holder.tvNoRequest.setText(historyStockList.get(position).getNoRequest());
        holder.tvHistoryStockDate.setText(historyStockList.get(position).getHistoryRequestDate());
        holder.tvStatusRequestStock.setText(historyStockList.get(position).getStatusRequest());
    }

    @Override
    public int getItemCount() {
        return historyStockList.size();
    }
}
