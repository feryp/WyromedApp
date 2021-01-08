package com.example.wyromedapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.wyromedapp.Fragment.HistoryBookingFragment;
import com.example.wyromedapp.Fragment.HistorySalesFragment;
import com.example.wyromedapp.Fragment.HistoryStockFragment;
import com.example.wyromedapp.HistoryTransactionsActivity;

public class PageAdapterHistoryTransactions extends FragmentStatePagerAdapter {

    int counttab;

    public PageAdapterHistoryTransactions(HistoryTransactionsActivity historyTransactionsActivity, FragmentManager fm, int counttab) {
        super(fm);
        this.counttab = counttab;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HistoryBookingFragment();

            case 1:
                return new HistorySalesFragment();

            case 2:
                return new HistoryStockFragment();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return counttab;
    }
}
