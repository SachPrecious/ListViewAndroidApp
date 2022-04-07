package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String country=String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,country,Toast.LENGTH_SHORT).show();
            }
        });



    }
}