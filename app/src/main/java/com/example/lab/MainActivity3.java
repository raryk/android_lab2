package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    String s = "відповідь прийнято";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.btnActThree);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActThree:
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void addPointA(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointB(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointC(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        scoreView.setText(String.valueOf(s));
    }
}