package com.example.wyromedapp.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.DetailMessageActivity;
import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.Model.ListMessage;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.ListMessageViewHolder;

import java.util.List;

public class ListMessageAdapter extends RecyclerView.Adapter<ListMessageViewHolder> {

    private final Context mContext;
    private final List<ListMessage> mListMessage;

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
    public void onBindViewHolder(@NonNull ListMessageViewHolder holder, final int position) {
        holder.tvTitle.setText(mListMessage.get(position).getTitleMessage());
        holder.tvDetail.setText(mListMessage.get(position).getDetailMessage());
        holder.tvTime.setText(mListMessage.get(position).getTimeMessage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Inbox",Toast.LENGTH_SHORT).show();
                Intent detailMessage = new Intent(v.getContext(), DetailMessageActivity.class);
                v.getContext().startActivity(detailMessage);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListMessage.size();
    }

    public void removeItem(int position){
        mListMessage.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(ListMessage item, int position){
        mListMessage.add(position,item);
        notifyItemInserted(position);
    }
}
