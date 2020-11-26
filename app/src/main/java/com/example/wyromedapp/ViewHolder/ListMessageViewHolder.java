package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.Model.ListMessage;
import com.example.wyromedapp.R;

public class ListMessageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvTitle;
    public TextView tvDetail;
    public TextView tvTime;
    public LinearLayout viewBackground, viewForeground;

    private ListMessage listMessage;

    private ItemClickListener itemClickListener;

    private View.OnClickListener onClickListener;

    public ListMessageViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tv_list_title_message);
        tvDetail = itemView.findViewById(R.id.tv_list_detail_message);
        tvTime = itemView.findViewById(R.id.tv_list_time_message);
        viewBackground = itemView.findViewById(R.id.view_background);
        viewForeground = itemView.findViewById(R.id.view_foreground);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
