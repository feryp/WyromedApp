package com.example.wyromedapp.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.wyromedapp.Fragment.PenambahanStockFragment;
import com.example.wyromedapp.Fragment.PenguranganStockFragment;
import com.example.wyromedapp.StockRequestActivity;

import java.util.ArrayList;
import java.util.List;

public class PageAdapterStockRequest extends FragmentStatePagerAdapter {

    int counttab;


    public PageAdapterStockRequest(StockRequestActivity stockRequestActivity, FragmentManager fm, int counttab) {
        super(fm);
        this.counttab = counttab;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                PenambahanStockFragment penambahanStock = new PenambahanStockFragment();
                return  penambahanStock;

            case 1:
                PenguranganStockFragment penguranganStock = new PenguranganStockFragment();
                return penguranganStock;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return counttab;
    }

}
