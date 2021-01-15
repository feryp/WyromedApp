package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.SalesOrderPurchaseItem;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.SalesOrderPurchasedViewHolder;

import java.util.List;

public class SalesOrderPurchasedItemAdapter  extends RecyclerView.Adapter<SalesOrderPurchasedViewHolder> {

    private final Context context;
    private final List<SalesOrderPurchaseItem> salesPurchaseItemList;

    public SalesOrderPurchasedItemAdapter(Context context, List<SalesOrderPurchaseItem> salesPurchaseItemList) {
        this.context = context;
        this.salesPurchaseItemList = salesPurchaseItemList;
    }

    @NonNull
    @Override
    public SalesOrderPurchasedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_detail_sales_item,parent,false);
        return new SalesOrderPurchasedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SalesOrderPurchasedViewHolder holder, int position) {
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
