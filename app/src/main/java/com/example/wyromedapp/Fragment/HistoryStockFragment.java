package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyromedapp.Adapter.HistorySalesAdapter;
import com.example.wyromedapp.Adapter.HistoryStockAdapter;
import com.example.wyromedapp.Model.HistorySales;
import com.example.wyromedapp.Model.HistoryStock;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class HistoryStockFragment extends Fragment {

    List<HistoryStock> historyStockList;
    RecyclerView rvHistoryStock;
    Context context;
    HistoryStockAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_stock, container, false);

        //INIT VIEW
        rvHistoryStock = view.findViewById(R.id.rv_history_stock);

        //List History
        historyStockList = new ArrayList<>();
        historyStockList.add(new HistoryStock("A-0119","Mon, 29 July 2020","Penambahan"));
        historyStockList.add(new HistoryStock("A-0120","Mon, 29 July 2020","Pengurangan"));
        historyStockList.add(new HistoryStock("A-0119","Mon, 29 July 2020","Penambahan"));
        historyStockList.add(new HistoryStock("A-0120","Mon, 29 July 2020","Pengurangan"));
        historyStockList.add(new HistoryStock("A-0119","Mon, 29 July 2020","Penambahan"));
        historyStockList.add(new HistoryStock("A-0120","Mon, 29 July 2020","Pengurangan"));
        historyStockList.add(new HistoryStock("A-0119","Mon, 29 July 2020","Penambahan"));
        historyStockList.add(new HistoryStock("A-0120","Mon, 29 July 2020","Pengurangan"));
        historyStockList.add(new HistoryStock("A-0119","Mon, 29 July 2020","Penambahan"));
        historyStockList.add(new HistoryStock("A-0120","Mon, 29 July 2020","Pengurangan"));

        adapter = new HistoryStockAdapter(context, historyStockList);
        rvHistoryStock.setLayoutManager(new LinearLayoutManager(context));
        rvHistoryStock.setAdapter(adapter);
        rvHistoryStock.setHasFixedSize(false);

        return view;
    }
}