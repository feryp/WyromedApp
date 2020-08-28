package com.example.wyromedapp.Fragment;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.wyromedapp.Adapter.ListMessageAdapter;
import com.example.wyromedapp.Model.ListMessage;
import com.example.wyromedapp.R;

import java.util.ArrayList;
import java.util.List;

import static androidx.constraintlayout.motion.widget.MotionScene.TAG;


public class InboxFragment extends Fragment {

    List<ListMessage> listMessages;
    RecyclerView rvListMessage;
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_inbox, container, false);

        //INIT VIEW
        rvListMessage = v.findViewById(R.id.rv_message);

        //List Message
        listMessages = new ArrayList<>();
        listMessages.add(new ListMessage("Pesanan RS Omni Pulomas","Status pesanan barang ke RS Omni Pulomas","07:30"));
        listMessages.add(new ListMessage("Pengurangan Stok","Permintaan pengurangan stok dengan no permintaan A-0294 telah disetujui","12:30"));
        listMessages.add(new ListMessage("Pesanan RS Omni Pulomas","Status pesanan barang ke RS Omni Pulomas","07:30"));
        listMessages.add(new ListMessage("Pengurangan Stok","Permintaan pengurangan stok dengan no permintaan A-0294 telah disetujui","12:30"));
        listMessages.add(new ListMessage("Pesanan RS Omni Pulomas","Status pesanan barang ke RS Omni Pulomas","07:30"));
        listMessages.add(new ListMessage("Pengurangan Stok","Permintaan pengurangan stok dengan no permintaan A-0294 telah disetujui","12:30"));
        listMessages.add(new ListMessage("Pesanan RS Omni Pulomas","Status pesanan barang ke RS Omni Pulomas","07:30"));
        listMessages.add(new ListMessage("Pengurangan Stok","Permintaan pengurangan stok dengan no permintaan A-0294 telah disetujui","12:30"));

        ListMessageAdapter adapter = new ListMessageAdapter(context, listMessages);
        rvListMessage.setLayoutManager(new LinearLayoutManager(context));
        rvListMessage.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_message, menu);
        super.onCreateOptionsMenu(menu, inflater);

        Drawable drawable = menu.getItem(0).getIcon();
        drawable.mutate();
        drawable.setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_IN);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_edit) {
            return true;
        }
        return super.onOptionsItemSelected(item);


    }
}
