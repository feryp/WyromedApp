package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.ConfirmRentalItemAdapter;
import com.example.wyromedapp.Model.OrderRentalItem;

import java.util.ArrayList;
import java.util.List;

public class ConfirmOrderActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvOrderRental;
    ImageButton back;
    Button btnStart;
    ConfirmRentalItemAdapter rentalItemAdapter;
    List<OrderRentalItem> orderRentalItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvOrderRental = findViewById(R.id.rv_order_rental_item);
        btnStart = findViewById(R.id.btn_start_operation);

        //SET LISTENER
        back.setOnClickListener(this);
        btnStart.setOnClickListener(this);


        //List Rental Item
        orderRentalItemList = new ArrayList<>();
        orderRentalItemList.add(new OrderRentalItem("Phillips VT-1208LL","ACCEPTED"));
        orderRentalItemList.add(new OrderRentalItem("Siemens TH-45TR","ACCEPTED"));
        orderRentalItemList.add(new OrderRentalItem("Panasonic AR-1202RL","ACCEPTED"));
        orderRentalItemList.add(new OrderRentalItem("LG DF-2401PO","ACCEPTED"));


        //Set up adapter Rental
        rentalItemAdapter = new ConfirmRentalItemAdapter(this, orderRentalItemList);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(rentalItemAdapter);
        rvOrderRental.setHasFixedSize(false);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_start_operation:
                Intent intent = new Intent(ConfirmOrderActivity.this, OperationActivity.class);
                startActivity(intent);
                break;
        }
    }
}
