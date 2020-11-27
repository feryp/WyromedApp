package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.StockRequest;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.PenguranganRequestViewHolder;

import java.util.List;

public class PenguranganRequestAdapter extends RecyclerView.Adapter<PenguranganRequestViewHolder> {

    private Context context;
    private List<StockRequest> stockRequestList;

    public PenguranganRequestAdapter(Context context, List<StockRequest> stockRequestList) {
        this.context = context;
        this.stockRequestList = stockRequestList;
    }

    @NonNull
    @Override
    public PenguranganRequestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_stock_request,parent,false);
        return new PenguranganRequestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PenguranganRequestViewHolder holder, int position) {
        holder.tvNamaBarang.setText(stockRequestList.get(position).getNamaBarang());
        holder.tvJumlahRequest.setText(String.valueOf(stockRequestList.get(position).getJumlahRequest()));
    }

    @Override
    public int getItemCount() {
        return stockRequestList.size();
    }
}
