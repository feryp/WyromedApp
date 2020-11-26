package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.DetailPesananMessage;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.DetailPesananMessageViewHolder;

import java.util.List;

public class DetailPesananMessageAdapter extends RecyclerView.Adapter<DetailPesananMessageViewHolder> {

    Context context;
    List<DetailPesananMessage> detailPesananMessageList;

    public DetailPesananMessageAdapter(Context context, List<DetailPesananMessage> detailPesananMessageList) {
        this.context = context;
        this.detailPesananMessageList = detailPesananMessageList;
    }

    @NonNull
    @Override
    public DetailPesananMessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_table_pesanan,parent,false);
        return new DetailPesananMessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailPesananMessageViewHolder holder, int position) {
        if (detailPesananMessageList != null && detailPesananMessageList.size() > 0){
            DetailPesananMessage model = detailPesananMessageList.get(position);
            holder.namaBarang.setText(model.getNamaBarang());
            holder.jumlahBarang.setText(model.getJumlah());
            holder.statusBarang.setText(model.getStatus());
        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return detailPesananMessageList.size();
    }
}
