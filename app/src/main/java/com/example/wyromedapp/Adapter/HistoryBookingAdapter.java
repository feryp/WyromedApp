package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.HistoryBooking;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.HistoryBookingViewHolder;

import java.util.List;

public class HistoryBookingAdapter extends RecyclerView.Adapter<HistoryBookingViewHolder> {

    private final Context context;
    private final List<HistoryBooking> historyBookingList;

    public HistoryBookingAdapter(Context context, List<HistoryBooking> historyBookingList) {
        this.context = context;
        this.historyBookingList = historyBookingList;
    }

    @NonNull
    @Override
    public HistoryBookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_history_booking,parent,false);
        return new HistoryBookingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryBookingViewHolder holder, int position) {
        holder.tvNoOrder.setText(historyBookingList.get(position).getNoOrder());
        holder.tvHistoryBookingDate.setText(historyBookingList.get(position).getHistoryBookingDate());
    }

    @Override
    public int getItemCount() {
        return historyBookingList.size();
    }
}
