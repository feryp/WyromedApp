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

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etFullname, etEmail, etNoHandphone, etPassword, etConfirmPassword;
    ImageButton btnBack;
    Button btnSignUp, btnToLoginLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //INIT VIEW
        etFullname = findViewById(R.id.et_fullname_register);
        etEmail = findViewById(R.id.et_email_register);
        etNoHandphone = findViewById(R.id.et_nohp_register);
        etPassword = findViewById(R.id.et_password_register);
        etConfirmPassword = findViewById(R.id.et_confirm_password_register);
        btnBack = findViewById(R.id.btn_back_to_layout);
        btnSignUp = findViewById(R.id.btn_sign_up);
        btnToLoginLayout = findViewById(R.id.btn_login_layout);

        //SET LISTENER
        btnBack.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        btnToLoginLayout.setOnClickListener(this);

    }

    public void ShowHidePass(View view) {
        if (view.getId() == R.id.show_pass_btn){
            if (etPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }

        if (view.getId() == R.id.show_conf_pass_btn){
            if (etConfirmPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etConfirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_to_layout:
                Intent back = new Intent(SignUpActivity.this, OnBoardingActivity.class);
                startActivity(back);
                break;
            case R.id.btn_login_layout:
                Intent toLogin = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(toLogin);
                break;

        }
    }
}
