package com.example.wyromedapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wyromedapp.EditProfileActivity;
import com.example.wyromedapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener {

    Button btnEditProfile;


    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        //INIT VIEW
        btnEditProfile = v.findViewById(R.id.btn_edit);

        //SET LISTENER
        btnEditProfile.setOnClickListener(ProfileFragment.this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_edit:
                Intent editProfile = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(editProfile);
                break;
        }
    }
}
