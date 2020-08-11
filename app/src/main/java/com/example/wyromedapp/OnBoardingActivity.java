package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.example.wyromedapp.Adapter.ViewAnimAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class OnBoardingActivity extends AppCompatActivity implements View.OnClickListener{

    ViewPager viewAnim;
    TabLayout indicator;
    Button btnSignup, btnSignIn;

    private Integer [] anim = {R.raw.slider_1, R.raw.slider_2, R.raw.slider_3};
    List<String> textAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        //INIT VIEW
        viewAnim = findViewById(R.id.view_anim);
        indicator = findViewById(R.id.indicator);
        btnSignup = findViewById(R.id.btn_signup_to_layout);
        btnSignIn = findViewById(R.id.btn_signin_to_layout);

        textAnim = new ArrayList<>();
        textAnim.add("Medis");
        textAnim.add("Sewa Alat");
        textAnim.add("Pencatatan Operasi");

        viewAnim.setAdapter(new ViewAnimAdapter(this, anim,textAnim));
        indicator.setupWithViewPager(viewAnim, true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(), 4000, 6000);

        //SET LISTENER
        btnSignIn.setOnClickListener(this);
        btnSignup.setOnClickListener(this);

    }


    private class SliderTimer extends TimerTask {
        @Override
        public void run() {
            OnBoardingActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewAnim.getCurrentItem() < anim.length - 1) {
                        viewAnim.setCurrentItem(viewAnim.getCurrentItem() + 1);
                    } else {
                        viewAnim.setCurrentItem(0);
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_signup_to_layout:
                Intent toLayoutSignUp = new Intent(OnBoardingActivity.this, SignUpActivity.class);
                startActivity(toLayoutSignUp);
                break;
            case R.id.btn_signin_to_layout:
                Intent toLayoutSignIn = new Intent(OnBoardingActivity.this, SignInActivity.class);
                startActivity(toLayoutSignIn);
                break;
        }
    }
}
