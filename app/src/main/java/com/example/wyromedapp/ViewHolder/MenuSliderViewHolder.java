package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.R;

public class MenuSliderViewHolder extends RecyclerView.ViewHolder {

    public ImageView illustration;
    public TextView tvDate, tvTitle, tvTotal;

    public MenuSliderViewHolder(@NonNull View itemView) {
        super(itemView);

        illustration = itemView.findViewById(R.id.iv_illustration_content);
        tvDate = itemView.findViewById(R.id.tv_date_content);
        tvTitle = itemView.findViewById(R.id.tv_title_content);
        tvTotal = itemView.findViewById(R.id.tv_total_content);
    }
}
