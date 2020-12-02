package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.DetailSalesRentItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.DetailSalesRentItemViewHolder;

import java.util.List;

public class DetailSalesRentItemAdapter extends RecyclerView.Adapter<DetailSalesRentItemViewHolder> {

    private Context context;
    private List<DetailSalesRentItem> salesRentItemList;

    public DetailSalesRentItemAdapter(Context context, List<DetailSalesRentItem> salesRentItemList) {
        this.context = context;
        this.salesRentItemList = salesRentItemList;
    }

    @NonNull
    @Override
    public DetailSalesRentItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_detail_sales_item,parent,false);
        return new DetailSalesRentItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailSalesRentItemViewHolder holder, int position) {
        holder.namaBarang.setText(salesRentItemList.get(position).getNamaBarang());
        holder.hargaBarang.setText(salesRentItemList.get(position).getHargaBarang());
        holder.kuantitasBarang.setText(String.valueOf(salesRentItemList.get(position).getKuantitasBarang()));
        holder.totalHarga.setText(salesRentItemList.get(position).getTotalHarga());
    }

    @Override
    public int getItemCount() {
        return salesRentItemList.size();
    }
}
