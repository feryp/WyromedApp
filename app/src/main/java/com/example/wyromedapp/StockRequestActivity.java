package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.PageAdapterStockRequest;
import com.google.android.material.tabs.TabLayout;

public class StockRequestActivity extends AppCompatActivity implements View.OnClickListener {

    TabLayout tabLayout;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_request);

        //INIT VIEW
        tabLayout = findViewById(R.id.tab_stock_request);
        back = findViewById(R.id.ic_back);
        final ViewPager viewPager  = findViewById(R.id.view_pager_stock_request);

        //Set Listener
        back.setOnClickListener(this);

        //Set TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Penambahan"));
        tabLayout.addTab(tabLayout.newTab().setText("Pengurangan"));


        final PageAdapterStockRequest pageAdapterStockRequest = new PageAdapterStockRequest(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapterStockRequest);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ic_back:
                finish();
                break;
        }
    }
}
