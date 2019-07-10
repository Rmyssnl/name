package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String adSoyad = getIntent().getStringExtra("Name");
        TextView textViewName = findViewById(R.id.textView);
        textViewName.setText("Hoşgeldin " + adSoyad);
    }
}
