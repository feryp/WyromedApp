package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.DetailTablePesanan;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.DetailTablePesananViewHolder;

import java.util.List;

public class DetailTablePesananAdapter extends RecyclerView.Adapter<DetailTablePesananViewHolder> {

    Context context;
    List<DetailTablePesanan> detailTablePesananList;

    public DetailTablePesananAdapter(Context context, List<DetailTablePesanan> detailTablePesananList) {
        this.context = context;
        this.detailTablePesananList = detailTablePesananList;
    }

    @NonNull
    @Override
    public DetailTablePesananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_table_pesanan,parent,false);
        return new DetailTablePesananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailTablePesananViewHolder holder, int position) {
        if (detailTablePesananList != null && detailTablePesananList.size() > 0){
            DetailTablePesanan model = detailTablePesananList.get(position);
            holder.namaBarang.setText(model.getNamaBarang());
            holder.jumlahBarang.setText(String.valueOf(model.getJumlah()));
        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return detailTablePesananList.size();
    }
}
