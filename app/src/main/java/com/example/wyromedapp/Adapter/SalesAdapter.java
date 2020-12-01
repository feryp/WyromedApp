package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.Sales;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.SalesViewHolder;

import java.util.List;

public class SalesAdapter extends RecyclerView.Adapter<SalesViewHolder> {

    private Context context;
    private List<Sales> salesList;

    public SalesAdapter(Context context, List<Sales> salesList) {
        this.context = context;
        this.salesList = salesList;
    }

    @NonNull
    @Override
    public SalesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_sales,parent,false);
        return new SalesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SalesViewHolder holder, int position) {
        holder.tvNoOrder.setText(salesList.get(position).getNoOrder());
        holder.tvSalesDate.setText(salesList.get(position).getSalesDate());
        holder.tvStatus.setText(salesList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return salesList.size();
    }
}
