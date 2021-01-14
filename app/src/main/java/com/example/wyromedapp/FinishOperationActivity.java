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

import com.example.wyromedapp.Adapter.FinishPurchasedAdapter;
import com.example.wyromedapp.Adapter.FinishRentalAdapter;
import com.example.wyromedapp.Model.FinishPurchaseItem;
import com.example.wyromedapp.Model.FinishRentalItem;

import java.util.ArrayList;
import java.util.List;

public class FinishOperationActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvOrderRental, rvOrderPurchased;
    ImageButton back;
    Button btnSubmit;
    FinishRentalAdapter finishRentalAdapter;
    FinishPurchasedAdapter finishPurchasedAdapter;
    List<FinishRentalItem> finishRentalItemList;
    List<FinishPurchaseItem> finishPurchaseItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_operation);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvOrderRental = findViewById(R.id.rv_order_rental_finish);
        rvOrderPurchased = findViewById(R.id.rv_order_purchased_finish);
        btnSubmit = findViewById(R.id.btn_submit_sales);

        //SET LISTENER
        back.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        //List Rental Item
        finishRentalItemList = new ArrayList<>();
        finishRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        finishRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        finishRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        finishRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));

        //List Purchased Item
        finishPurchaseItemList = new ArrayList<>();
        finishPurchaseItemList.add(new FinishPurchaseItem("Pinset Anatomis",0));
        finishPurchaseItemList.add(new FinishPurchaseItem("Pinset Anatomis",0));
        finishPurchaseItemList.add(new FinishPurchaseItem("Pinset Anatomis",0));
        finishPurchaseItemList.add(new FinishPurchaseItem("Pinset Anatomis",0));

        //Setup adapter rental
        finishRentalAdapter = new FinishRentalAdapter(this,finishRentalItemList);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(finishRentalAdapter);
        rvOrderRental.setHasFixedSize(false);

        //Setup adapter purchased
        finishPurchasedAdapter = new FinishPurchasedAdapter(this,finishPurchaseItemList);
        rvOrderPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvOrderPurchased.setAdapter(finishPurchasedAdapter);
        rvOrderPurchased.setHasFixedSize(false);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_submit_sales:
                Intent submitSales = new Intent(FinishOperationActivity.this, ReceiptActivity.class);
                startActivity(submitSales);
                break;
        }
    }
}