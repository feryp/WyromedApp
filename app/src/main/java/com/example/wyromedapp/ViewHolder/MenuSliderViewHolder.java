package com.example.wyromedapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Fragment.HomeFragment;
import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;

public class MenuSliderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView illustration;
    public TextView tvDate, tvTitle, tvTotal;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public MenuSliderViewHolder(@NonNull View itemView) {
        super(itemView);

        illustration = itemView.findViewById(R.id.iv_illustration_content);
        tvDate = itemView.findViewById(R.id.tv_date_content);
        tvTitle = itemView.findViewById(R.id.tv_title_content);
        tvTotal = itemView.findViewById(R.id.tv_total_content);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            default:
                itemClickListener.onClick(v, getAdapterPosition(), false);
                break;
        }
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
