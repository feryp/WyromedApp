package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        //INIT VIEW
        btnSend = findViewById(R.id.btn_send);

        //SET LISTENER
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_send:
                Intent sendEmail = new Intent(ForgotPasswordActivity.this, CheckEmailActivity.class);
                startActivity(sendEmail);
                break;
        }
    }
}
