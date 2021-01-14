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

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;
import com.example.wyromedapp.Adapter.OrderPurchasedItemAdapter;
import com.example.wyromedapp.Adapter.OrderRentalItemAdapter;
import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.Model.OrderRentalItem;

import java.util.ArrayList;
import java.util.List;

public class HandoverActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvOrderRental, rvOrderPurchased;
    ImageButton back;
    Button btnAccept, btnStart;
    NeomorphFrameLayout layoutBtnAccept, layoutBtnStart;
    OrderRentalItemAdapter rentalItemAdapter;
    OrderPurchasedItemAdapter purchasedItemAdapter;
    List<OrderRentalItem> orderRentalItemList;
    List<OrderPurchasedItem> orderPurchasedItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handover);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvOrderRental = findViewById(R.id.rv_order_rental_item);
        rvOrderPurchased = findViewById(R.id.rv_order_purchased_item);
        btnAccept = findViewById(R.id.btn_accept_order);
        btnStart = findViewById(R.id.btn_start_operation);
        layoutBtnAccept = findViewById(R.id.layout_btn_accept);
        layoutBtnStart = findViewById(R.id.layout_btn_start);

        //SET LISTENER
        back.setOnClickListener(this);
        btnAccept.setOnClickListener(this);
        btnStart.setOnClickListener(this);

        //Visibity Button
        layoutBtnAccept.setVisibility(View.VISIBLE);
        layoutBtnStart.setVisibility(View.INVISIBLE);

        //List Rental Item
        orderRentalItemList = new ArrayList<>();
        orderRentalItemList.add(new OrderRentalItem("Phillips VT-1208LL",1));
        orderRentalItemList.add(new OrderRentalItem("Siemens TH-45TR",1));
        orderRentalItemList.add(new OrderRentalItem("Panasonic AR-1202RL",1));
        orderRentalItemList.add(new OrderRentalItem("LG DF-2401PO",1));

        //List Purchased Item
        orderPurchasedItemList = new ArrayList<>();
        orderPurchasedItemList.add(new OrderPurchasedItem("Pinset Anatomis",6));
        orderPurchasedItemList.add(new OrderPurchasedItem("Klem Lurus",3));
        orderPurchasedItemList.add(new OrderPurchasedItem("DJ Stent",4));
        orderPurchasedItemList.add(new OrderPurchasedItem("Pig Tail Spent",3));
        orderPurchasedItemList.add(new OrderPurchasedItem("Uterescopy Pipe",2));


        //Set up adapter Rental
        rentalItemAdapter = new OrderRentalItemAdapter(this, orderRentalItemList);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(rentalItemAdapter);
        rvOrderRental.setHasFixedSize(false);

        //Set up adapter Purchased
        purchasedItemAdapter = new OrderPurchasedItemAdapter(this, orderPurchasedItemList);
        rvOrderPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvOrderPurchased.setAdapter(purchasedItemAdapter);
        rvOrderPurchased.setHasFixedSize(false);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_accept_order:

                //ini cuman buat trigger sementara buat masuk ke tampilan selanjutnya,
                // karena gua males bikin fungsi nya jadi fungsinya biar ke konek langsung aja sama api
                Intent intent = new Intent(HandoverActivity.this, InUseActivity.class);
                startActivity(intent);
                break;

                //Intent yg bener yg dibawah ini
//                Intent accept = new Intent(HandoverActivity.this, ConfirmSignatureActivity.class);
//                startActivity(accept);
//                break;
        }
    }
}
