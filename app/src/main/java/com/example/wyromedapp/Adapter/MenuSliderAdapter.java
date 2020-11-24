package com.example.wyromedapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wyromedapp.Model.MenuSliderModel;
import com.example.wyromedapp.R;
import com.example.wyromedapp.ViewHolder.MenuSliderViewHolder;

import java.util.List;

public class MenuSliderAdapter extends RecyclerView.Adapter<MenuSliderViewHolder> {

    private List<MenuSliderModel> models;
    private ViewPager2 viewPager2;

    public MenuSliderAdapter(List<MenuSliderModel> models, ViewPager2 viewPager2) {
        this.models = models;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public MenuSliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_fitur,parent, false);
        final MenuSliderViewHolder viewHolder = new MenuSliderViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuSliderViewHolder holder, int position) {
        holder.illustration.setImageResource(models.get(position).getIllustration());
        holder.tvDate.setText(models.get(position).getDate());
        holder.tvTitle.setText(models.get(position).getTitle());
        holder.tvTotal.setText(models.get(position).getTotal());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
