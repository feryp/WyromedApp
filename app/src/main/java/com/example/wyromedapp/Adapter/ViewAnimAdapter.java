package com.example.wyromedapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.wyromedapp.OnBoardingActivity;
import com.example.wyromedapp.R;

import java.util.List;

public class ViewAnimAdapter extends PagerAdapter {

    private final Context context;
    private Integer [] anim = {R.raw.slider_1, R.raw.slider_2, R.raw.slider_3};
    private final List<String> text;

    public ViewAnimAdapter(Context context, Integer[] anim, List<String> text) {
        this.context = context;
        this.anim = anim;
        this.text = text;
    }

    @Override
    public int getCount() {
        return anim.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        @SuppressLint("InflateParams") View view = layoutInflater.inflate(R.layout.anim_slider, null);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.anim_lottie);
        TextView textView = (TextView) view.findViewById(R.id.text_view_anim);
        lottieAnimationView.setAnimation(anim[position]);
        textView.setText(text.get(position));

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
