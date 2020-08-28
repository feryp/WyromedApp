package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Model.ListMessage;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.ListMessageViewHolder;

import java.util.List;

public class ListMessageAdapter extends RecyclerView.Adapter<ListMessageViewHolder> {

    private Context mContext;
    private List<ListMessage> mListMessage;

    public ListMessageAdapter(Context mContext, List<ListMessage> mListMessage) {
        this.mContext = mContext;
        this.mListMessage = mListMessage;
    }

    @NonNull
    @Override
    public ListMessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_message,parent, false);
        final ListMessageViewHolder viewHolder = new ListMessageViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMessageViewHolder holder, int position) {
        holder.tvTitle.setText(mListMessage.get(position).getTitleMessage());
        holder.tvDetail.setText(mListMessage.get(position).getDetailMessage());
        holder.tvTime.setText(mListMessage.get(position).getTimeMessage());
    }

    @Override
    public int getItemCount() {
        return mListMessage.size();
    }
}
