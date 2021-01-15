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

import com.example.wyromedapp.Adapter.FinishRentalAdapter;
import com.example.wyromedapp.Adapter.ReceiptPurchasedAdapter;
import com.example.wyromedapp.Adapter.ReceiptRentalAdapter;
import com.example.wyromedapp.Model.FinishRentalItem;
import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.example.wyromedapp.Model.ReceiptOrderPurchased;

import java.util.ArrayList;
import java.util.List;

public class ReceiptActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvReceiptRental, rvReceiptPurchased;
    ImageButton back;
    Button btnCreateSO;
    ReceiptRentalAdapter receiptRentalAdapter;
    ReceiptPurchasedAdapter receiptPurchasedAdapter;
    List<FinishRentalItem> receiptRentalItemList;
    List<ReceiptOrderPurchased> receiptPurchasedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvReceiptRental = findViewById(R.id.rv_order_rental_receipt);
        rvReceiptPurchased = findViewById(R.id.rv_order_purchased_receipt);
        btnCreateSO = findViewById(R.id.btn_create_so);

        //SET LISTENER
        back.setOnClickListener(this);
        btnCreateSO.setOnClickListener(this);

        //List Rental Item
        receiptRentalItemList = new ArrayList<>();
        receiptRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        receiptRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        receiptRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));
        receiptRentalItemList.add(new FinishRentalItem("Phillips VT-1208LL","FINISHED","2 hours; 15 min"));

        //List Purchased Item
        receiptPurchasedList = new ArrayList<>();
        receiptPurchasedList.add(new ReceiptOrderPurchased("Pinset Anatomis",6));
        receiptPurchasedList.add(new ReceiptOrderPurchased("Pinset Anatomis",6));
        receiptPurchasedList.add(new ReceiptOrderPurchased("Pinset Anatomis",6));
        receiptPurchasedList.add(new ReceiptOrderPurchased("Pinset Anatomis",6));


        //Setup adapter rental
        receiptRentalAdapter = new ReceiptRentalAdapter(this,receiptRentalItemList);
        rvReceiptRental.setLayoutManager(new LinearLayoutManager(this));
        rvReceiptRental.setAdapter(receiptRentalAdapter);
        rvReceiptRental.setHasFixedSize(false);

        //Setup adapter purchased
        receiptPurchasedAdapter = new ReceiptPurchasedAdapter(this, receiptPurchasedList);
        rvReceiptPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvReceiptPurchased.setAdapter(receiptPurchasedAdapter);
        rvReceiptPurchased.setHasFixedSize(false);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_create_so:
                Intent createSO = new Intent(ReceiptActivity.this, SalesOrderActivity.class);
                startActivity(createSO);
                break;
        }
    }
}