package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton r1 = findViewById(R.id.cpp);
        RadioButton r2 = findViewById(R.id.java);
        RadioButton r3 = findViewById(R.id.html);


    }
}