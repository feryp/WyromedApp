package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    ImageButton back;
    SwitchCompat pushNotif, emailNotif;
    SharedPreferences sharedPreferences;
    String PACKAGE_NAME = "com.example.wyromedapp.";
    private boolean fromNotifikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        pushNotif = findViewById(R.id.toogle_switch_push_notification);

        //SET LISTENER
        back.setOnClickListener(this);

        if (pushNotif != null){
            pushNotif.setOnCheckedChangeListener(this);
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Toast.makeText(NotificationActivity.this, "Notification switch " + (isChecked ? "on" : "off"),Toast.LENGTH_SHORT).show();
        if (isChecked) {
            Toast.makeText(NotificationActivity.this, "Notification On", Toast.LENGTH_SHORT).show();
            pushNotif.setChecked(true);
            saveNotifSetting(true);
        } else {
            Toast.makeText(NotificationActivity.this, "Notification Off", Toast.LENGTH_SHORT).show();
            pushNotif.setChecked(false);
            saveNotifSetting(false);
        }
    }

    private void saveNotifSetting(boolean notification) {
        sharedPreferences = getApplicationContext().getSharedPreferences(PACKAGE_NAME + "SETTING_NOTIF", Context.MODE_PRIVATE);
        sharedPreferences.getBoolean("notif", false);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("notif", notification);
        editor.apply();
    }
}