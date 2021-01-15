package com.example.wyromedapp.ViewHolder;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wyromedapp.Interface.ItemClickListener;
import com.example.wyromedapp.R;
import com.example.wyromedapp.SalesOrderActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SalesOrderRentItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView namaBarang, hargaBarang, kuantitasBarang, totalHarga;
    Context context;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public SalesOrderRentItemViewHolder(@NonNull View itemView) {
        super(itemView);

        namaBarang = itemView.findViewById(R.id.tv_sales_item_name);
        hargaBarang = itemView.findViewById(R.id.tv_sales_item_price);
        kuantitasBarang = itemView.findViewById(R.id.tv_sales_kuantitas_item);
        totalHarga = itemView.findViewById(R.id.tv_sales_total_price_item);

        itemView.setOnClickListener(this);
        hargaBarang.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_sales_item_price:
                openBottomSheet(v);
                break;
        }
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    private void openBottomSheet(View view){
        Context context=view.getContext();
       LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       view = inflater.inflate(R.layout.layout_bottom_sheet_edit_price, (LinearLayout)view.findViewById(R.id.bottom_sheet_container_edit));

       EditText etPriceItem = view.findViewById(R.id.et_edit_price);
       Button btnSave = view.findViewById(R.id.btn_save_new_price);

       final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context, R.style.BottomSheetDialogTheme);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Edit Price", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });

        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.setCancelable (true);
        bottomSheetDialog.show();
    }
}
