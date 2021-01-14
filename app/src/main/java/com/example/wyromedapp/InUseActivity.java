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

import com.example.wyromedapp.Adapter.InUsePurchasedAdapter;
import com.example.wyromedapp.Adapter.InUseRentalAdapter;
import com.example.wyromedapp.Model.InUseItem;

import java.util.ArrayList;
import java.util.List;

public class InUseActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvOrderRental, rvOrderPurchased;
    ImageButton back;
    Button btnFinish;
    InUseRentalAdapter inUseRentalAdapter;
    InUsePurchasedAdapter inUsePurchasedAdapter;
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
        inUseRentalAdapter = new InUseRentalAdapter(this, inUseItemRental);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(inUseRentalAdapter);
        rvOrderRental.setHasFixedSize(false);

        //Setup adapter purchased
        inUsePurchasedAdapter = new InUsePurchasedAdapter(this, inUseItemPurchased);
        rvOrderPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvOrderPurchased.setAdapter(inUsePurchasedAdapter);
        rvOrderPurchased.setHasFixedSize(false);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_finish_operation:
                Intent finish = new Intent(InUseActivity.this, FinishOperationActivity.class);
                startActivity(finish);
                break;
        }
    }
}