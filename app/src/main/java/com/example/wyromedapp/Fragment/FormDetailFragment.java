package com.example.wyromedapp.Fragment;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.wyromedapp.Model.Hospital;
import com.example.wyromedapp.R;
import com.skydoves.powerspinner.DefaultSpinnerAdapter;
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener;
import com.skydoves.powerspinner.PowerSpinnerInterface;
import com.skydoves.powerspinner.PowerSpinnerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormDetailFragment extends Fragment {

    PowerSpinnerView powerSpinnerView;
    ArrayList<String> hospital = new ArrayList<>();

    public FormDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_form_detail, container, false);
        //INIT VIEW
        powerSpinnerView = view.findViewById(R.id.spinner_hospital);

        hospital.add("RS. Omni Pulomas");
        hospital.add("RS. Fatmawati");
        hospital.add("RS. Gatot Subroto");
        hospital.add("RS. Sari Asih");

        powerSpinnerView.setSpinnerAdapter(new DefaultSpinnerAdapter(powerSpinnerView));
        powerSpinnerView.setItems(hospital);



        return view;
    }
}
