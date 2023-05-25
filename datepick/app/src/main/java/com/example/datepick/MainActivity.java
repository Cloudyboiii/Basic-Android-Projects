package com.example.datepick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker picku;
    Button bt1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
        bt1 = findViewById(R.id.button);
        picku = findViewById(R.id.datePicker);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder s1 = new StringBuilder();
                s1.append(Integer.toString(picku.getYear()));
                s1.append('/');
                s1.append(Integer.toString(picku.getMonth() + 1));
                s1.append('/');
                s1.append(Integer.toString(picku.getDayOfMonth()));
                t1.setText(s1);
            }
        });
    }
}
