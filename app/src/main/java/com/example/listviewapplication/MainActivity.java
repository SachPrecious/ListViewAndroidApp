package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countries =new String[]{"Sri Lanka","New Zealand","England","Australia","USA","Sri Lanka","New Zealand","England","Australia","USA"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this,R.layout.list_item,countries);
        listView=findViewById(R.id.list_view);
        listView.setAdapter(listAdapter);

    }
}