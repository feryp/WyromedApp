package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyromedapp.Adapter.PenguranganRequestAdapter;
import com.example.wyromedapp.Model.StockRequest;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class PenguranganStockFragment extends Fragment {

    List<StockRequest> stockRequestList;
    RecyclerView rvStockRequest;
    Context context;
    PenguranganRequestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pengurangan_stock, container, false);

        //INIT VIEW
        rvStockRequest = view.findViewById(R.id.rv_pengurangan_stock);

        //List Request
        stockRequestList = new ArrayList<>();
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));
        stockRequestList.add(new StockRequest("Pinset Anatomis", 10));

        adapter = new PenguranganRequestAdapter(context, stockRequestList);
        rvStockRequest.setLayoutManager(new LinearLayoutManager(context));
        rvStockRequest.setAdapter(adapter);
        rvStockRequest.setHasFixedSize(false);


        return view;
    }
}
