package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.DetailSalesPurchaseItemAdapter;
import com.example.wyromedapp.Adapter.DetailSalesRentItemAdapter;
import com.example.wyromedapp.Adapter.SalesOrderPurchasedItemAdapter;
import com.example.wyromedapp.Adapter.SalesOrderRentItemAdapter;
import com.example.wyromedapp.Model.SalesOrderPurchaseItem;
import com.example.wyromedapp.Model.SalesOrderRentItem;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnSendSO, btnFinishSO;
    RecyclerView rvRentItem, rvPurchasedItem;
    SalesOrderRentItemAdapter salesOrderRentItemAdapter;
    SalesOrderPurchasedItemAdapter salesOrderPurchasedItemAdapter;
    List<SalesOrderRentItem> salesRentItemList;
    List<SalesOrderPurchaseItem> salesPurchasedItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_order);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        btnSendSO = findViewById(R.id.btn_send_so);
        btnFinishSO = findViewById(R.id.btn_finish_so);
        rvRentItem = findViewById(R.id.rv_sales_order_rental_item);
        rvPurchasedItem = findViewById(R.id.rv_sales_order_puchased_item);

        //SET LISTENER
        back.setOnClickListener(this);
        btnSendSO.setOnClickListener(this);
        btnFinishSO.setOnClickListener(this);

        //List Sales Rent Item
        salesRentItemList = new ArrayList<>();
        salesRentItemList.add(new SalesOrderRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));
        salesRentItemList.add(new SalesOrderRentItem("Siemens TH-45TR","Rp, 980.000", 1,"Rp, 980.000"));
        salesRentItemList.add(new SalesOrderRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));

        //List Sales Purchase Item
        salesPurchasedItemList = new ArrayList<>();
        salesPurchasedItemList.add(new SalesOrderPurchaseItem("Pinset Anatomis","Rp, 450.000", 5,"Rp, 2.250.000"));
        salesPurchasedItemList.add(new SalesOrderPurchaseItem("Klem Lurus","Rp, 200.000", 3,"Rp, 600.000"));

        //Set up Adapter Rent Item
        salesOrderRentItemAdapter = new SalesOrderRentItemAdapter(this, salesRentItemList);
        rvRentItem.setLayoutManager(new LinearLayoutManager(this));
        rvRentItem.setAdapter(salesOrderRentItemAdapter);
        rvRentItem.setHasFixedSize(false);

        //Set up Adapter Purchase Item
        salesOrderPurchasedItemAdapter = new SalesOrderPurchasedItemAdapter(this, salesPurchasedItemList);
        rvPurchasedItem.setLayoutManager(new LinearLayoutManager(this));
        rvPurchasedItem.setAdapter(salesOrderPurchasedItemAdapter);
        rvPurchasedItem.setHasFixedSize(false);
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