package com.example.wyromedapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.Operation;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.OperationRentalViewHolder;

import java.util.List;

public class OperationRentalAdapter extends RecyclerView.Adapter<OperationRentalViewHolder> {

    private final Context context;
    private final List<Operation> operationList;

    public OperationRentalAdapter(Context context, List<Operation> operationList) {
        this.context = context;
        this.operationList = operationList;
    }

    @NonNull
    @Override
    public OperationRentalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rental_operation,parent,false);
        return new OperationRentalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OperationRentalViewHolder holder, int position) {
        holder.tvNamaBarangRental.setText(operationList.get(position).getNamaBarang());
        holder.tvCountTimer.setText(operationList.get(position).getCountTimer());

    }

    @Override
    public int getItemCount() {
        return operationList.size();
    }
}
