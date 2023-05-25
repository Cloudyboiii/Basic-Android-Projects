package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText p1,p2,p3;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=findViewById(R.id.editTextNumber);
        p2=findViewById(R.id.editTextNumber2);
        p3=findViewById(R.id.editTextNumber3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
    }

    public void addition(View obj){
        int n1=Integer.parseInt(p1.getText().toString());
        int n2=Integer.parseInt(p2.getText().toString());
        int n3=n1+n2;
        p3.setText(String.valueOf(n3));
        cln();

    }

    public void subtraction(View obj) {
        int n1 = Integer.parseInt(p1.getText().toString());
        int n2 = Integer.parseInt(p2.getText().toString());
        int n3 = n1 - n2;
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

    public void division(View obj){
        int n1=Integer.parseInt(p1.getText().toString());
        int n2=Integer.parseInt(p2.getText().toString());

        int n3 = n1/n2;
        p3.setText(String.valueOf(n3));
        cln();
    }

    public void cln(){
        p1.setText(null);
        p2.setText(null);
    }
}