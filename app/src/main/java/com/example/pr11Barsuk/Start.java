package com.example.pr11Barsuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity implements View.OnClickListener {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = findViewById(R.id.start);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
}