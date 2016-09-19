//package com.example.android.squash_app;
//
//import android.content.Intent;
//import android.net.sip.SipAudioCall;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.widget.ListAdapter;
//
//import java.io.IOException;
//
///**
// * Created by saba on 2016-09-17.
// */
//public class CourtList extends AppCompatActivity implements IListener{
//    RecyclerView recyclerView;
//    DataBaseHelper dbHelper;
//    MyAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.second_layout);
//
//
//        dbHelper = new DataBaseHelper(getApplicationContext());
//        try {
//            dbHelper.createDataBase();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        recyclerView = (RecyclerView) findViewById(R.id.rv_contactlist);
//        adapter = new MyAdapter(this, dbHelper.getAllCourts());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
//
//    @Override
//    public void nameToChnge(String name) {
//
//
//        adapter = new MyAdapter(this, dbHelper.getAllCourts());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }
//
//}
