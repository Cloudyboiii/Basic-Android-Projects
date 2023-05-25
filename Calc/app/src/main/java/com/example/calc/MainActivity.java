package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText p1,p2,p3;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=findViewById(R.id.n1);
        p2=findViewById(R.id.n2);
        p3=findViewById(R.id.n3);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
    }
    public void addition(View obj){
        int n1=Integer.parseInt(p1.getText().toString());
        int n2=Integer.parseInt(p2.getText().toString());
        int n3=n1+n2;
        p3.setText(String.valueOf(n3));
        cln();

    }
    public void subtraction(View obj){
        int n1=Integer.parseInt(p1.getText().toString());
        int n2=Integer.parseInt(p2.getText().toString());
        int n3=n1-n2;
        p3.setText(String.valueOf(n3));
        cln();

    }
    public void multiplication(View obj){
        int n1=Integer.parseInt(p1.getText().toString());
        int n2=Integer.parseInt(p2.getText().toString());

        int n3=n1*n2;
        p3.setText(String.valueOf(n3));
        cln();

    }
    public void cln(){
        p1.setText(null);
        p2.setText(null);
    }
}
