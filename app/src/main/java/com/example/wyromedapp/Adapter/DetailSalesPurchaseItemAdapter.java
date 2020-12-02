package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.DetailSalesPurchaseItem;
import com.example.wyromedapp.Model.DetailSalesRentItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.DetailSalesPurchaseItemViewHolder;

import java.util.List;

public class DetailSalesPurchaseItemAdapter extends RecyclerView.Adapter<DetailSalesPurchaseItemViewHolder> {

    private Context context;
    private List<DetailSalesPurchaseItem> salesPurchaseItemList;

    public DetailSalesPurchaseItemAdapter(Context context, List<DetailSalesPurchaseItem> salesPurchaseItemList) {
        this.context = context;
        this.salesPurchaseItemList = salesPurchaseItemList;
    }

    @NonNull
    @Override
    public DetailSalesPurchaseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_detail_sales_item,parent,false);
        return new DetailSalesPurchaseItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailSalesPurchaseItemViewHolder holder, int position) {
        holder.namaBarang.setText(salesPurchaseItemList.get(position).getNamaBarang());
        holder.hargaBarang.setText(salesPurchaseItemList.get(position).getHargaBarang());
        holder.kuantitasBarang.setText(String.valueOf(salesPurchaseItemList.get(position).getKuantitasBarang()));
        holder.totalHarga.setText(salesPurchaseItemList.get(position).getTotalHarga());
    }

    @Override
    public int getItemCount() {
        return salesPurchaseItemList.size();
    }
}
