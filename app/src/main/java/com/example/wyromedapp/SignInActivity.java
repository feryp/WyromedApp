package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etUsername, etPassword;
    ImageButton btnBack;
    Button btnSignIn, btnToRegisterLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //INIT VIEW
        etUsername = findViewById(R.id.et_username_login);
        etPassword = findViewById(R.id.et_password_login);
        btnBack = findViewById(R.id.btn_back_to_layout);
        btnSignIn = findViewById(R.id.btn_sign_in);
        btnToRegisterLayout = findViewById(R.id.btn_register_layout);

        //SET LISTENER
        btnBack.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
        btnToRegisterLayout.setOnClickListener(this);

    }


    public void ShowHidePass(View view) {
        if (view.getId() == R.id.show_pass_btn){
            if (etPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Show Password
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Hide Password
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_to_layout:
                Intent back = new Intent(SignInActivity.this, OnBoardingActivity.class);
                startActivity(back);
                break;
            case R.id.btn_register_layout:
                Intent toRegister = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(toRegister);
                break;
        }
    }
}
