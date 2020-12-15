package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wyromedapp.Adapter.DetailTablePesananAdapter;
import com.example.wyromedapp.Model.DetailTablePesanan;

import java.util.ArrayList;
import java.util.List;

public class DetailMessageActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvTableMessage;
    DetailTablePesananAdapter adapter;
    Toolbar toolbar;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_message);

        //INIT VIEW
        rvTableMessage = findViewById(R.id.rv_table_detail_message);
        toolbar = findViewById(R.id.toolbar_detail_message);
        btnConfirm = findViewById(R.id.btn_confirm_message);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_back_white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        setRecyclerView();

        //SET LISTENER
        btnConfirm.setOnClickListener(this);
    }

    private void setRecyclerView() {
        rvTableMessage.setHasFixedSize(true);
        rvTableMessage.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DetailTablePesananAdapter(this,getList());
        rvTableMessage.setAdapter(adapter);
    }

    private List<DetailTablePesanan> getList(){
        List<DetailTablePesanan> detailTablePesananList = new ArrayList<>();
        detailTablePesananList.add(new DetailTablePesanan("Phillips VT-1208LL",1));
        detailTablePesananList.add(new DetailTablePesanan("Siemens TH-45TR",1));
        detailTablePesananList.add(new DetailTablePesanan("Panasonic AR-1202RL",1));
        detailTablePesananList.add(new DetailTablePesanan("LG DF-2401PO",1));
        detailTablePesananList.add(new DetailTablePesanan("Pinset Anatomis",6));
        detailTablePesananList.add(new DetailTablePesanan("Klem Lurus",3));
        detailTablePesananList.add(new DetailTablePesanan("DJ Stent",4));
        detailTablePesananList.add(new DetailTablePesanan("Pig Tail Spent",3));
        detailTablePesananList.add(new DetailTablePesanan("Uterescopy Pipe",2));



        return detailTablePesananList;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_confirm_message:
                Intent confim = new Intent(DetailMessageActivity.this, HandoverActivity.class);
                startActivity(confim);
                break;
        }
    }
}
