package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.DetailSalesPurchaseItemAdapter;
import com.example.wyromedapp.Adapter.DetailSalesRentItemAdapter;
import com.example.wyromedapp.Adapter.SalesAdapter;
import com.example.wyromedapp.Model.DetailSalesPurchaseItem;
import com.example.wyromedapp.Model.DetailSalesRentItem;

import java.util.ArrayList;
import java.util.List;

public class DetailSalesActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    RecyclerView rvRentItem, rvPurchasedItem;
    public DetailSalesRentItemAdapter rentItemAdapter;
    public DetailSalesPurchaseItemAdapter purchaseItemAdapter;
    List<DetailSalesRentItem> salesRentItemList;
    List<DetailSalesPurchaseItem> salesPurchaseItemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sales);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvRentItem = findViewById(R.id.rv_detail_rental_item);
        rvPurchasedItem = findViewById(R.id.rv_detail_puchased_item);

        //SET LISTENER
        back.setOnClickListener(this);

        //List Sales Rent Item
        salesRentItemList = new ArrayList<>();
        salesRentItemList.add(new DetailSalesRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));
        salesRentItemList.add(new DetailSalesRentItem("Siemens TH-45TR","Rp, 980.000", 1,"Rp, 980.000"));
        salesRentItemList.add(new DetailSalesRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));

        //List Sales Purchase Item
        salesPurchaseItemList = new ArrayList<>();
        salesPurchaseItemList.add(new DetailSalesPurchaseItem("Pinset Anatomis","Rp, 450.000", 5,"Rp, 2.250.000"));
        salesPurchaseItemList.add(new DetailSalesPurchaseItem("Klem Lurus","Rp, 200.000", 3,"Rp, 600.000"));

        //Set up Adapter Rent Item
        rentItemAdapter = new DetailSalesRentItemAdapter(this, salesRentItemList);
        rvRentItem.setLayoutManager(new LinearLayoutManager(this));
        rvRentItem.setAdapter(rentItemAdapter);
        rvRentItem.setHasFixedSize(false);

        //Set up Adapter Purchase Item
        purchaseItemAdapter = new DetailSalesPurchaseItemAdapter(this, salesPurchaseItemList);
        rvPurchasedItem.setLayoutManager(new LinearLayoutManager(this));
        rvPurchasedItem.setAdapter(purchaseItemAdapter);
        rvPurchasedItem.setHasFixedSize(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;
        }
    }
}
