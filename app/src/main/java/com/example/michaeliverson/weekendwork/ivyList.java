package com.example.michaeliverson.weekendwork;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class ivyList extends AppCompatActivity {

    private RecyclerView recycle;
    private ListAdaptor adaptor;
    private MyReceiver reciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivy_list);
        this.recycle = (RecyclerView)findViewById(R.id.rvList);
        this.recycle.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        this.recycle.setLayoutManager(layoutManager);
        this.recycle.setItemAnimator(new DefaultItemAnimator());

        IntentFilter filter = new IntentFilter("com.example.michaeliverson.weekendwork");

        this.reciever = new MyReceiver();
        registerReceiver(reciever, filter);


    }

    public class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent)
        {
            // TODO Auto-generated method stub
            adaptor = intent.getExtras("RETURN");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(this.reciever);
    }
}
