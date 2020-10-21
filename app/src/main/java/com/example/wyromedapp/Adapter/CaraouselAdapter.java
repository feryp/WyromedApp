package com.example.wyromedapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.L;
import com.example.wyromedapp.BookingActivity;
import com.example.wyromedapp.Model.CarouselModel;
import com.example.wyromedapp.R;
import com.example.wyromedapp.SalesActivity;

import java.util.List;

public class CaraouselAdapter extends PagerAdapter {

    private List<CarouselModel> models;

    Context context;

    public CaraouselAdapter(List<CarouselModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater inflater= LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.card_item_fitur, container, false);

        ImageView illustration;
        TextView date, title, total;

        illustration = view.findViewById(R.id.iv_illustration_content);
        date = view.findViewById(R.id.tv_date_content);
        title = view.findViewById(R.id.tv_title_content);
        total = view.findViewById(R.id.tv_total_content);

        illustration.setImageResource(models.get(position).getIllustration());
        date.setText(models.get(position).getDate());
        title.setText(models.get(position).getTitle());
        total.setText(models.get(position).getTotal());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent bookingPage = new Intent(context, BookingActivity.class);
                    context.startActivity(bookingPage);
                }
                if (position==1){
                    Intent salesPage = new Intent(context, SalesActivity.class);
                    context.startActivity(salesPage);
                }
                if (position==2){
                    Intent stockPage = new Intent(context, StockActivity.class);
                    context.startActivity(stockPage);
                }

            }
        });

        container.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
