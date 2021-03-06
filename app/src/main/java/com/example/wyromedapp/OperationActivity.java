package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.deishelon.roundedbottomsheet.RoundedBottomSheetDialog;
import com.example.wyromedapp.Adapter.OperationPurchasedAdapter;
import com.example.wyromedapp.Adapter.OperationRentalAdapter;
import com.example.wyromedapp.Model.Operation;
import com.example.wyromedapp.Model.OrderPurchasedItem;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class OperationActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvOrderRental, rvOrderPurchased;
    ImageButton back;
    Button btnFinish, btnAddItemPurchased;
    OperationRentalAdapter operationRentalAdapter;
    OperationPurchasedAdapter operationPurchasedAdapter;
    List<Operation> operationItemRental;
    List<OrderPurchasedItem> operationItemPurchased;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        rvOrderRental = findViewById(R.id.rv_order_rental_operation);
        rvOrderPurchased = findViewById(R.id.rv_order_purchased_operation);
        btnFinish = findViewById(R.id.btn_finish_operation);
        btnAddItemPurchased = findViewById(R.id.btn_add_item_purchased);

        //SET LISTENER
        back.setOnClickListener(this);
        btnFinish.setOnClickListener(this);
        btnAddItemPurchased.setOnClickListener(this);

        //List Rental Item
        operationItemRental = new ArrayList<>();
        operationItemRental.add(new Operation("Phillips VT-1208LL","00:00"));
        operationItemRental.add(new Operation("Phillips VT-1208LL","00:00"));
        operationItemRental.add(new Operation("Phillips VT-1208LL","00:00"));
        operationItemRental.add(new Operation("Phillips VT-1208LL","00:00"));

        //List Purchased Item
        operationItemPurchased = new ArrayList<>();
        operationItemPurchased.add(new OrderPurchasedItem("Pinset Anatomis",20));
        operationItemPurchased.add(new OrderPurchasedItem("Pinset Anatomis",10));
        operationItemPurchased.add(new OrderPurchasedItem("Pinset Anatomis",8));
        operationItemPurchased.add(new OrderPurchasedItem("Pinset Anatomis",10));


        //Setup adapter rental
        operationRentalAdapter = new OperationRentalAdapter(this, operationItemRental);
        rvOrderRental.setLayoutManager(new LinearLayoutManager(this));
        rvOrderRental.setAdapter(operationRentalAdapter);
        rvOrderRental.setHasFixedSize(false);

        //Setup adapter purchased
        operationPurchasedAdapter = new OperationPurchasedAdapter(this, operationItemPurchased);
        rvOrderPurchased.setLayoutManager(new LinearLayoutManager(this));
        rvOrderPurchased.setAdapter(operationPurchasedAdapter);
        rvOrderPurchased.setHasFixedSize(false);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.btn_finish_operation:
                Intent finish = new Intent(OperationActivity.this, FinishOperationActivity.class);
                startActivity(finish);
                break;

            case R.id.btn_add_item_purchased:
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(OperationActivity.this, R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.layout_bottom_sheet_item_purchased,
                        (LinearLayout)findViewById(R.id.bottom_sheet_container_purchased));

                SmartMaterialSpinner spinnerItem = findViewById(R.id.purchased_item_id);
                EditText etAmount = findViewById(R.id.edt_amount_pitem);


                bottomSheetView.findViewById(R.id.btn_add_purchased).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OperationActivity.this, "Purchased item", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });

                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
                break;
        }
    }
}