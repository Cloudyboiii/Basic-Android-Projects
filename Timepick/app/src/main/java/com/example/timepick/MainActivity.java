package com.example.timepick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TimePicker picker;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
        picker = findViewById(R.id.tp);
        bt1 = findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder s1 = new StringBuilder();
                s1.append(Integer.toString(picker.getHour()));
                s1.append(':');
                s1.append(Integer.toString(picker.getMinute()));
                t1.setText(s1);
            }
        });
    }
}