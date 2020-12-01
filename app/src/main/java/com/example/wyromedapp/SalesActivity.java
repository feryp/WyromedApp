package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.SalesAdapter;
import com.example.wyromedapp.Model.Sales;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SalesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    RecyclerView rvSales;
    public SalesAdapter adapter;
    List<Sales> salesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvSales = findViewById(R.id.rv_sales);

        //Set Listener
        back.setOnClickListener(this);

        //List Sales
        salesList = new ArrayList<>();
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));
        salesList.add(new Sales("A-112","Mon, 29 July 2020","Finish"));


        //Set up Adapter
        adapter = new SalesAdapter(this, salesList);
        rvSales.setLayoutManager(new LinearLayoutManager(this));
        rvSales.setAdapter(adapter);
        rvSales.setHasFixedSize(false);


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
