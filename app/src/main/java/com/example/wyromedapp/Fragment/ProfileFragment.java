package com.example.wyromedapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wyromedapp.EditProfileActivity;
import com.example.wyromedapp.R;
import com.example.wyromedapp.SettingActivity;


public class ProfileFragment extends Fragment implements View.OnClickListener {

    ConstraintLayout menuHistoryTransactions, menuSetting, menuHelp, signOut;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        //INIT VIEW
        menuSetting = v.findViewById(R.id.menu_settings);

        //SET LISTENER
        menuSetting.setOnClickListener(ProfileFragment.this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_settings:
                Intent menuSetting = new Intent(getActivity(), SettingActivity.class);
                startActivity(menuSetting);
                break;
        }
    }
}
