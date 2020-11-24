package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewPasswordActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etNewPassword, etRepeatPassword;
    Button btnCreatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        //INIT VIEW
        etNewPassword = findViewById(R.id.et_new_password_forgot);
        etRepeatPassword = findViewById(R.id.et_repeat_password_forgot);
        btnCreatePassword = findViewById(R.id.btn_create_password);

        //SET LISTENER
        btnCreatePassword.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_create_password:
                Intent createPassword = new Intent(NewPasswordActivity.this, PasswordSuccessActivity.class);
                startActivity(createPassword);
                break;
        }
    }
}
