package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Adapter.StockAdapter;
import com.example.wyromedapp.Model.Stock;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;

public class StockActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvStock;
    ImageButton back;
    public StockAdapter adapter;
    List<Stock> stockList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        //INIT VIEW
        rvStock = findViewById(R.id.rv_stock);
        back = findViewById(R.id.ic_back);

        //SET LISTENER
        back.setOnClickListener(this);

        //List Stock
        stockList = new ArrayList<>();
        stockList.add(new Stock("Pinset Anatomis",100,"pcs",0));
        stockList.add(new Stock("Pinset Chirurgys",100,"pcs",0));
        stockList.add(new Stock("Klem Lurus",100,"pcs",0));
        stockList.add(new Stock("DJ Stent",100,"pcs",0));
        stockList.add(new Stock("Pig Tail Spent",100,"pcs",0));
        stockList.add(new Stock("Uterescopy Pipe",100,"pcs",0));
        stockList.add(new Stock("Cytosscope Stent",100,"pcs",0));
        stockList.add(new Stock("Pinset Anatomis",100,"pcs",0));
        stockList.add(new Stock("Pinset Chirurgys",100,"pcs",0));
        stockList.add(new Stock("Klem Lurus",100,"pcs",0));
        stockList.add(new Stock("DJ Stent",100,"pcs",0));
        stockList.add(new Stock("Pig Tail Spent",100,"pcs",0));
        stockList.add(new Stock("Uterescopy Pipe",100,"pcs",0));
        stockList.add(new Stock("Cytosscope Stent",100,"pcs",0));

        //Set up Adapter
        adapter = new StockAdapter(this,stockList);
        rvStock.setLayoutManager(new LinearLayoutManager(this));
        rvStock.setAdapter(adapter);
        rvStock.setHasFixedSize(false);
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
