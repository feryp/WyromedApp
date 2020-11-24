package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyromedapp.Adapter.MenuSliderAdapter;
import com.example.wyromedapp.Model.MenuSliderModel;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    MenuSliderAdapter adapter;
    List<MenuSliderModel> menuSliderModels;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        view.getContext();
        //INIT VIEW
        viewPager = view.findViewById(R.id.view_pager_carousel);

        menuSliderModels = new ArrayList<>();

        menuSliderModels.add(new MenuSliderModel(R.drawable.illustration_booking, "20/08/2020","Booking", "26"));
        menuSliderModels.add(new MenuSliderModel(R.drawable.illustration_sales, "20/08/2020","Sales", "30"));
        menuSliderModels.add(new MenuSliderModel(R.drawable.illustration_stock, "20/08/2020","Stock", "19"));

        adapter = new MenuSliderAdapter(menuSliderModels, (Context) getActivity());

        viewPager.setAdapter(adapter);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(3);
//        viewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

//        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
//        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
//        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                float r = 1 - Math.abs(position);
//                page.setScaleY(0.95f + r * 0.05f);
//            }
//        });
//
//        viewPager.setPageTransformer(compositePageTransformer);

        return view;
    }
}
