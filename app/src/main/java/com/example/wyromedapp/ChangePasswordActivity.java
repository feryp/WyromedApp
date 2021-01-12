package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etNewPassword, etRepeatPassword;
    Button btnSave;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        etNewPassword = findViewById(R.id.et_change_new_password);
        etRepeatPassword = findViewById(R.id.et_change_repeat_password);
        btnSave = findViewById(R.id.btn_save_password);

        //SET LISTENER
        back.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    public void ShowHidePass(View view) {
        if (view.getId() == R.id.show_new_pass_btn){
            if (etNewPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etNewPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }

        if (view.getId() == R.id.show_repeat_pass_btn){
            if (etRepeatPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etRepeatPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etRepeatPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
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
}