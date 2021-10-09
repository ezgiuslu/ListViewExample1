package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button array tuşunu declareledim
        Button btnArrayAdapter = findViewById(R.id.button_arrayadapter);

        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });

        //button coustom tuşu declare
        Button btnCustomAdapter = findViewById(R.id.button_customadapter);

        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(intent);
            }
        });




    }
}