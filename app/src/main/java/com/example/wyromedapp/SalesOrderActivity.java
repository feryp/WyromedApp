package com.example.wyromedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wyromedapp.Adapter.DetailSalesPurchaseItemAdapter;
import com.example.wyromedapp.Adapter.DetailSalesRentItemAdapter;
import com.example.wyromedapp.Adapter.SalesOrderPurchasedItemAdapter;
import com.example.wyromedapp.Adapter.SalesOrderRentItemAdapter;
import com.example.wyromedapp.Model.SalesOrderPurchaseItem;
import com.example.wyromedapp.Model.SalesOrderRentItem;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class SalesOrderActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnSendSO, btnFinishSO;
    RecyclerView rvRentItem, rvPurchasedItem;
    SalesOrderRentItemAdapter salesOrderRentItemAdapter;
    SalesOrderPurchasedItemAdapter salesOrderPurchasedItemAdapter;
    List<SalesOrderRentItem> salesRentItemList;
    List<SalesOrderPurchaseItem> salesPurchasedItemList;

    TextView tvSelectPaymentMethod;
    TextView tvSelectedDueDate;
    ImageButton btnDueDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_order);

        //INIT VIEW
        back = findViewById(R.id.ic_back);
        btnSendSO = findViewById(R.id.btn_send_so);
        btnFinishSO = findViewById(R.id.btn_finish_so);
        rvRentItem = findViewById(R.id.rv_sales_order_rental_item);
        rvPurchasedItem = findViewById(R.id.rv_sales_order_puchased_item);

        tvSelectPaymentMethod = findViewById(R.id.tv_sales_order_payment_method);
        tvSelectedDueDate = findViewById(R.id.tv_sales_order_due_date);
        btnDueDate = findViewById(R.id.btn_open_calendar_due_date);


        //SET LISTENER
        back.setOnClickListener(this);
        btnSendSO.setOnClickListener(this);
        btnFinishSO.setOnClickListener(this);
        tvSelectPaymentMethod.setOnClickListener(this);
        btnDueDate.setOnClickListener(this);

        //List Sales Rent Item
        salesRentItemList = new ArrayList<>();
        salesRentItemList.add(new SalesOrderRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));
        salesRentItemList.add(new SalesOrderRentItem("Siemens TH-45TR","Rp, 980.000", 1,"Rp, 980.000"));
        salesRentItemList.add(new SalesOrderRentItem("Phillips VT-1208LL","Rp, 2.000.000", 1,"Rp, 2.000.000"));

        //List Sales Purchase Item
        salesPurchasedItemList = new ArrayList<>();
        salesPurchasedItemList.add(new SalesOrderPurchaseItem("Pinset Anatomis","Rp, 450.000", 5,"Rp, 2.250.000"));
        salesPurchasedItemList.add(new SalesOrderPurchaseItem("Klem Lurus","Rp, 200.000", 3,"Rp, 600.000"));

        //Set up Adapter Rent Item
        salesOrderRentItemAdapter = new SalesOrderRentItemAdapter(this, salesRentItemList);
        rvRentItem.setLayoutManager(new LinearLayoutManager(this));
        rvRentItem.setAdapter(salesOrderRentItemAdapter);
        rvRentItem.setHasFixedSize(false);

        //Set up Adapter Purchase Item
        salesOrderPurchasedItemAdapter = new SalesOrderPurchasedItemAdapter(this, salesPurchasedItemList);
        rvPurchasedItem.setLayoutManager(new LinearLayoutManager(this));
        rvPurchasedItem.setAdapter(salesOrderPurchasedItemAdapter);
        rvPurchasedItem.setHasFixedSize(false);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
                finish();
                break;

            case R.id.tv_sales_order_payment_method:
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(SalesOrderActivity.this, R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.layout_bottom_sheet_payment_method,
                        (LinearLayout)findViewById(R.id.bottom_sheet_container_payment_method));

//                RadioGroup radioGroup = findViewById(R.id.radio_group);
//                RadioButton selectPaymentButton;
//
//                int selectedId = radioGroup.getCheckedRadioButtonId();
//                selectPaymentButton = findViewById(selectedId);
//                if (selectedId == 0){
//                    Toast.makeText(SalesOrderActivity.this,"Nothing Selected", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(SalesOrderActivity.this, selectPaymentButton.getText(), Toast.LENGTH_SHORT).show();
//                }

                bottomSheetView.findViewById(R.id.btn_choose_payment_method).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SalesOrderActivity.this, "Payment Method", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
                break;

            case R.id.btn_open_calendar_due_date:

                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.clear();

                long today = MaterialDatePicker.todayInUtcMilliseconds();

                SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
                final String date = format.format(new Date());


                //MaterialDatePicker
                MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
                builder.setTitleText("SELECT A DUE DATE");
                builder.setSelection(today);

                final MaterialDatePicker materialDatePicker = builder.build();

                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");

                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        tvSelectedDueDate.setText(materialDatePicker.getHeaderText());
                        tvSelectedDueDate.setText(date);
                    }
                });
                break;
        }
    }
}