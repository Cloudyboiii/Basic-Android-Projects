package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText pt1,pt2,pt3;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pt1 = findViewById(R.id.p1);
        pt2 = findViewById(R.id.p2);
        pt3 = findViewById(R.id.p3);
        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
    }
    public void add(View obj){
        int n1 = Integer.parseInt(pt1.getText().toString());
        int n2 = Integer.parseInt(pt2.getText().toString());
        int n3 = n1 + n2;
        pt3.setText(String.valueOf(n3));

    }
    public void sub(View obj){
        int n1 = Integer.parseInt(pt1.getText().toString());
        int n2 = Integer.parseInt(pt2.getText().toString());
        int n3 = n1 - n2;
        pt3.setText(String.valueOf(n3));

    }
    public void mul(View obj){
        int n1 = Integer.parseInt(pt1.getText().toString());
        int n2 = Integer.parseInt(pt2.getText().toString());
        int n3 = n1 * n2;
        pt3.setText(String.valueOf(n3));

    }

}