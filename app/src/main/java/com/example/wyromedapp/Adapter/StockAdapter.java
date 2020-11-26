package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.media.ResourceBusyException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.Stock;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.StockViewHolder;

import java.util.List;

public class StockAdapter extends RecyclerView.Adapter<StockViewHolder> {

    private Context context;
    private List<Stock> stockList;

    public StockAdapter(Context context, List<Stock> stockList) {
        this.context = context;
        this.stockList = stockList;
    }

    @NonNull
    @Override
    public StockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_stock,parent,false);
        return new StockViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StockViewHolder holder, int position) {
        holder.tvNamaBarang.setText(stockList.get(position).getNamaBarang());
        holder.tvJumlahInventory.setText(String.valueOf(stockList.get(position).getJumlahInventoryStock()));
        holder.tvSatuan.setText(stockList.get(position).getSatuan());
        try {
            holder.tvKuantitas.setText(String.valueOf(stockList.get(position).getKuantitasStock()));
        } catch (Resources.NotFoundException ex){
            holder.tvKuantitas.setText("0");
        }

    }

    @Override
    public int getItemCount() {
        return stockList.size();
    }
}
