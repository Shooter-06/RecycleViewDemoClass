package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> myList =new ArrayList<>();
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");
        myList.add("lion");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter= new RecyclerViewAdapter(this, myList);
        recyclerView.setAdapter(adapter);


    }
}