package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.InUsePurchasedItemAdapter;
import com.example.wyromedapp.Adapter.InUseRentalItemAdapter;
import com.example.wyromedapp.Model.InUseItem;

import java.util.ArrayList;
import java.util.List;

public class InUseActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvOrderRental, rvOrderPurchased;
    ImageButton back;
    Button btnFinish;
    InUseRentalItemAdapter inUseRentalItemAdapter;
    InUsePurchasedItemAdapter inUsePurchasedItemAdapter;
    List<InUseItem> inUseItemRental, inUseItemPurchased;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_use);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvOrderRental = findViewById(R.id.rv_order_rental_operation);
        rvOrderPurchased = findViewById(R.id.rv_order_purchased_operation);
        btnFinish = findViewById(R.id.btn_finish_operation);

        //SET LISTENER
        back.setOnClickListener(this);
        btnFinish.setOnClickListener(this);

        //List Rental Item
        inUseItemRental = new ArrayList<>();
        inUseItemRental.add(new InUseItem("Phillips VT-1208LL","00:00"));
        inUseItemRental.add(new InUseItem("Phillips VT-1208LL","00:00"));
        inUseItemRental.add(new InUseItem("Phillips VT-1208LL","00:00"));
        inUseItemRental.add(new InUseItem("Phillips VT-1208LL","00:00"));

        //List Purchased Item
        inUseItemPurchased = new ArrayList<>();
        inUseItemPurchased.add(new InUseItem("Pinset Anatomis","00:00"));
        inUseItemPurchased.add(new InUseItem("Pinset Anatomis","00:00"));
        inUseItemPurchased.add(new InUseItem("Pinset Anatomis","00:00"));
        inUseItemPurchased.add(new InUseItem("Pinset Anatomis","00:00"));


        //Setup adapter rental
        inUseRentalItemAdapter = new InUseRentalItemAdapter(this, inUseItemRental);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(inUseRentalItemAdapter);
        rvOrderRental.setHasFixedSize(false);

        //Setup adapter purchased
        inUsePurchasedItemAdapter = new InUsePurchasedItemAdapter(this, inUseItemPurchased);
        rvOrderPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvOrderPurchased.setAdapter(inUsePurchasedItemAdapter);
        rvOrderPurchased.setHasFixedSize(false);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;
        }
    }
}