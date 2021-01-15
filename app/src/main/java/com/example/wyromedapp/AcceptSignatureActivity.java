package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AcceptSignatureActivity extends AppCompatActivity{

    LinearLayout doctorSignature, nurseSignature, salesmanSignature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept_signature);

        //INIT VIEW
        doctorSignature = findViewById(R.id.layout_image_doctor_signature);
        nurseSignature = findViewById(R.id.layout_image_nurse_signature);
        salesmanSignature = findViewById(R.id.layout_image_salesman_signature);


        doctorSignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doctorSign = new Intent(AcceptSignatureActivity.this, ConfirmSignatureActivity.class);
                startActivity(doctorSign);
            }
        });

        nurseSignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nurseSign = new Intent(AcceptSignatureActivity.this, ConfirmSignatureActivity.class);
                startActivity(nurseSign);
            }
        });

        salesmanSignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salesmanSign = new Intent(AcceptSignatureActivity.this, ConfirmSignatureActivity.class);
                startActivity(salesmanSign);
            }
        });

    }


}