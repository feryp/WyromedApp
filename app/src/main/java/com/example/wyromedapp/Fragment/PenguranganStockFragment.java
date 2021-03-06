package com.example.wyromedapp.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wyromedapp.Adapter.PenguranganRequestAdapter;
import com.example.wyromedapp.Model.StockRequest;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;


public class PenguranganStockFragment extends Fragment implements View.OnClickListener {

    List<StockRequest> stockRequestList;
    RecyclerView rvStockRequest;
    Context context;
    PenguranganRequestAdapter adapter;
    Button btnSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pengurangan_stock, container, false);

        //INIT VIEW
        rvStockRequest = view.findViewById(R.id.rv_pengurangan_stock);
        btnSubmit = view.findViewById(R.id.btn_submit_pengurangan);

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

        //Set Listener
        btnSubmit.setOnClickListener(PenguranganStockFragment.this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_submit_pengurangan:
                Toast.makeText(v.getContext(),"Dialog",Toast.LENGTH_SHORT).show();

                final Dialog openDialog = new Dialog(getActivity());
                openDialog.setContentView(R.layout.item_dialog_request_success);
                TextView tvNoRequest = openDialog.findViewById(R.id.tv_dialog_no_request);
                Button btnOk = openDialog.findViewById(R.id.dialog_btn_oke);

                openDialog.setCanceledOnTouchOutside(true);
                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog.dismiss();
                    }
                });
                openDialog.show();


                break;
        }
    }
}
