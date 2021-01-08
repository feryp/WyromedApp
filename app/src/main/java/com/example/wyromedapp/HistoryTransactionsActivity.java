package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.PageAdapterHistoryTransactions;
import com.google.android.material.tabs.TabLayout;

public class HistoryTransactionsActivity extends AppCompatActivity implements View.OnClickListener{

    TabLayout tabLayout;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_transactions);

        //INIT VIEW
        tabLayout = findViewById(R.id.tab_history_transactions);
        back = findViewById(R.id.ic_back);
        final ViewPager viewPager = findViewById(R.id.view_pager_history_transactions);

        //Set Listener
        back.setOnClickListener(this);

        //Set Tab Layout
        tabLayout.addTab(tabLayout.newTab().setText("Booking"));
        tabLayout.addTab(tabLayout.newTab().setText("Sales"));
        tabLayout.addTab(tabLayout.newTab().setText("Stock"));

        final PageAdapterHistoryTransactions pageAdapterHistoryTransactions = new PageAdapterHistoryTransactions(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapterHistoryTransactions);
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

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ic_back:
                finish();
                break;
        }
    }
}