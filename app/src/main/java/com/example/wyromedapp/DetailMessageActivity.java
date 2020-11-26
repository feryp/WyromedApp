package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.wyromedapp.Adapter.DetailPesananMessageAdapter;
import com.example.wyromedapp.Model.DetailPesananMessage;

import java.util.ArrayList;
import java.util.List;

public class DetailMessageActivity extends AppCompatActivity{

    RecyclerView rvTableMessage;
    DetailPesananMessageAdapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_message);

        //INIT VIEW
        rvTableMessage = findViewById(R.id.rv_table_detail_message);
        toolbar = findViewById(R.id.toolbar_detail_message);

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
    }

    private void setRecyclerView() {
        rvTableMessage.setHasFixedSize(true);
        rvTableMessage.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DetailPesananMessageAdapter(this,getList());
        rvTableMessage.setAdapter(adapter);
    }

    private List<DetailPesananMessage> getList(){
        List<DetailPesananMessage> detailPesananMessageList = new ArrayList<>();
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Siemens TH-45TR","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Pinset Anatomis","6","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Klem Lurus","3","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));
        detailPesananMessageList.add(new DetailPesananMessage("Phillips VT-1208LL","1","Ready"));


        return detailPesananMessageList;
    }

}
