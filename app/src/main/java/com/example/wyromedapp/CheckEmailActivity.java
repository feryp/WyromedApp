package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckEmailActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_email);

        //INIT VIEW
        btnOke = findViewById(R.id.btn_oke);

        //SET LISTENER
        btnOke.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_oke:
                Intent check = new Intent(CheckEmailActivity.this, NewPasswordActivity.class);
                startActivity(check);
                break;
        }
    }
}
