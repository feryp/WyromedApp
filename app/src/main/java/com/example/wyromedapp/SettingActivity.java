package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    LinearLayout menuProfile, menuNotification, menuChangePassword, menuPrivacyPolicy, menuTermsConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        menuProfile = findViewById(R.id.menu_profile_settings);
        menuNotification = findViewById(R.id.menu_notification_settings);
        menuChangePassword = findViewById(R.id.menu_change_password_settings);
        menuPrivacyPolicy = findViewById(R.id.menu_privacy_policy_settings);
        menuTermsConditions = findViewById(R.id.menu_terms_conditions_settings);

        //SET LISTENER
        back.setOnClickListener(this);
        menuProfile.setOnClickListener(this);
        menuNotification.setOnClickListener(this);
        menuChangePassword.setOnClickListener(this);
        menuPrivacyPolicy.setOnClickListener(this);
        menuTermsConditions.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.menu_profile_settings:
                Intent profile = new Intent(SettingActivity.this, EditProfileActivity.class);
                startActivity(profile);
                break;
        }
    }
}
