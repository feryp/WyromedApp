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
import com.example.wyromedapp.Adapter.PenambahanRequestAdapter;
import com.example.wyromedapp.Model.HistoryBooking;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class HistoryBookingFragment extends Fragment {

    List<HistoryBooking> historyBookingList;
    RecyclerView rvHistoryBooking;
    Context context;
    HistoryBookingAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_booking, container, false);

        //INIT VIEW
        rvHistoryBooking = view.findViewById(R.id.rv_history_booking);

        //List History
        historyBookingList = new ArrayList<>();
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));
        historyBookingList.add(new HistoryBooking("BK-001","Mon, 30 July 2020"));

        adapter = new HistoryBookingAdapter(context, historyBookingList);
        rvHistoryBooking.setLayoutManager(new LinearLayoutManager(context));
        rvHistoryBooking.setAdapter(adapter);
        rvHistoryBooking.setHasFixedSize(false);


        return view;

    }
}