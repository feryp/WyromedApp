package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.wyromedapp.Fragment.FormDetailFragment;
import com.shuhart.stepview.StepView;

import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity implements View.OnClickListener {

    StepView stepView;
    FragmentManager fragmentManager;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        //INIT VIEW
        stepView = findViewById(R.id.step_view);
        back = findViewById(R.id.ic_back);

        fragmentManager = getSupportFragmentManager();
        FormDetailFragment formDetailFragment = new FormDetailFragment();
        fragmentManager.beginTransaction().replace(R.id.fragment_container_booking,formDetailFragment).commit();

        stepView.getState()
                .steps(new ArrayList<String>() {{
                    add("Form Detail");
                    add("Rental Item");
                    add("Purchased Item");
                    add("Status");
                    add("Finish");

                }})
                .commit();
        stepView.setOnStepClickListener(new StepView.OnStepClickListener() {
            @Override
            public void onStepClick(int step) {

            }
        });

        //SET LISTENER
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;
        }
    }
}
