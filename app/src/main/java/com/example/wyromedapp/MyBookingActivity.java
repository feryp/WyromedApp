package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.MyBookingAdapter;
import com.example.wyromedapp.Adapter.SalesAdapter;
import com.example.wyromedapp.Model.MyBooking;
import com.example.wyromedapp.Model.Sales;

import java.util.ArrayList;
import java.util.List;

public class MyBookingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    RecyclerView rvMyBooking;
    public MyBookingAdapter adapter;
    List<MyBooking> myBookingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvMyBooking = findViewById(R.id.rv_my_booking);

        //Set Listener
        back.setOnClickListener(this);

        //List MyBooking
        myBookingList = new ArrayList<>();
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));
        myBookingList.add(new MyBooking("BK-001","Mon, 29 July 2020","Order"));

        //Set up Adapter
        adapter = new MyBookingAdapter(this, myBookingList);
        rvMyBooking.setLayoutManager(new LinearLayoutManager(this));
        rvMyBooking.setAdapter(adapter);
        rvMyBooking.setHasFixedSize(false);
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