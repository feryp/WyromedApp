package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyromedapp.Adapter.PenambahanRequestAdapter;
import com.example.wyromedapp.Model.StockRequest;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class PenambahanStockFragment extends Fragment {

    List<StockRequest> stockRequestList;
    RecyclerView rvStockRequest;
    Context context;
    PenambahanRequestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_penambahan_stock, container, false);

        //INIT VIEW
        rvStockRequest = view.findViewById(R.id.rv_penambahan_stock);

        //List Request
        stockRequestList = new ArrayList<>();
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));
        stockRequestList.add(new StockRequest("DJ Stent", 6));

        adapter = new PenambahanRequestAdapter(context, stockRequestList);
        rvStockRequest.setLayoutManager(new LinearLayoutManager(context));
        rvStockRequest.setAdapter(adapter);
        rvStockRequest.setHasFixedSize(false);


        return view;

    }
}
