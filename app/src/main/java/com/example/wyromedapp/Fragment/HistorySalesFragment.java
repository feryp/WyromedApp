package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyromedapp.Adapter.HistoryBookingAdapter;
import com.example.wyromedapp.Adapter.HistorySalesAdapter;
import com.example.wyromedapp.Model.HistoryBooking;
import com.example.wyromedapp.Model.HistorySales;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class HistorySalesFragment extends Fragment {

    List<HistorySales> historySalesList;
    RecyclerView rvHistorySales;
    Context context;
    HistorySalesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_sales, container, false);

        //INIT VIEW
        rvHistorySales = view.findViewById(R.id.rv_history_sales);

        //List History
        historySalesList = new ArrayList<>();
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));
        historySalesList.add(new HistorySales("A-112","Mon, 29 July 2020"));

        adapter = new HistorySalesAdapter(context, historySalesList);
        rvHistorySales.setLayoutManager(new LinearLayoutManager(context));
        rvHistorySales.setAdapter(adapter);
        rvHistorySales.setHasFixedSize(false);

        return view;
    }
}