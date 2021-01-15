package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.HistorySales;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.HistorySalesViewHolder;

import java.util.List;

public class HistorySalesAdapter extends RecyclerView.Adapter<HistorySalesViewHolder> {

    private final Context context;
    private final List<HistorySales> historySalesList;

    public HistorySalesAdapter(Context context, List<HistorySales> historySalesList) {
        this.context = context;
        this.historySalesList = historySalesList;
    }

    @NonNull
    @Override
    public HistorySalesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_history_sales,parent,false);
        return new HistorySalesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistorySalesViewHolder holder, int position) {
        holder.tvNoSales.setText(historySalesList.get(position).getNoSales());
        holder.tvHistorySalesDate.setText(historySalesList.get(position).getHistorySalesDate());
    }

    @Override
    public int getItemCount() {
        return historySalesList.size();
    }
}
