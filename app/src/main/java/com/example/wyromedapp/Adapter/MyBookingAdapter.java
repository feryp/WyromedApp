package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.MyBooking;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.MyBookingViewHolder;

import java.util.List;

public class MyBookingAdapter extends RecyclerView.Adapter<MyBookingViewHolder> {

    private final Context context;
    private final List<MyBooking> myBookingList;

    public MyBookingAdapter(Context context, List<MyBooking> myBookingList) {
        this.context = context;
        this.myBookingList = myBookingList;
    }

    @NonNull
    @Override
    public MyBookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_booking,parent,false);
        return new MyBookingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBookingViewHolder holder, int position) {
        holder.tvNoOrder.setText(myBookingList.get(position).getNoOrder());
        holder.tvBookingDate.setText(myBookingList.get(position).getBookingDate());
        holder.tvStatus.setText(myBookingList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return myBookingList.size();
    }
}
