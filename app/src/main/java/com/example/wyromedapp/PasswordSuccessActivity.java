package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PasswordSuccessActivity extends AppCompatActivity implements View.OnClickListener {

    Button  btnBacktoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_success);

        //INIT VIEW
        btnBacktoLogin = findViewById(R.id.btn_back_to_login);

        //SET LISTENER
        btnBacktoLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_to_login:
                Intent back = new Intent(PasswordSuccessActivity.this, SignInActivity.class);
                startActivity(back);
                break;
        }
    }
}
