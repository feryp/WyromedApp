package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.wyromedapp.Adapter.CaraouselAdapter;
import com.example.wyromedapp.Model.CarouselModel;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    List<CarouselModel> models;
    CaraouselAdapter adapter;

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

        models = new ArrayList<>();
        models.add(new CarouselModel(R.drawable.illustration_booking, "20/08/2020","Booking", "26"));
        models.add(new CarouselModel(R.drawable.illustration_sales, "20/08/2020","Sales", "30"));
        models.add(new CarouselModel(R.drawable.illustration_stock, "20/08/2020","Stock", "19"));

        adapter = new CaraouselAdapter(models, (Context) getActivity());

        viewPager.setAdapter(adapter);
        viewPager.setPadding(50,0,50,0);


        return view;
    }
}
