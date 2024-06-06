package com.example.pr11Barsuk;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class Play extends AppCompatActivity implements View.OnClickListener {
    public boolean Started = false;
    public boolean Finished = false;
    Button start, drive1, drive2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_play);
            start=findViewById(R.id.start2);
            start.setOnClickListener(this);
            drive1=findViewById(R.id.drive1);
            drive1.setOnClickListener(this);
            drive2=findViewById(R.id.drive2);
            drive2.setOnClickListener(this);
            result = findViewById(R.id.tvResult);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start2:
                if (!Finished) {
                    if (!Started) {
                        start.setBackgroundColor(Color.RED);
                        start.setText("Pause");
                        Started = true;
                    } else {
                        start.setBackgroundColor(Color.GREEN); 
                        start.setText("Start");
                        Started = false;}
                }else {
                        Intent intent = new Intent(Play.this, Play.class);
                        startActivity(intent);
                    }
                break;
            case R.id.drive1:
                View Car = findViewById(R.id.Car1);
                if(Started && !Finished){
                    ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams)Car. getLayoutParams();
                    margin. leftMargin += 50;
                    Car.requestLayout();
                    if(margin.leftMargin >= 1000){
                        result.setText("Победа 1 игрока");
                        start.setText("Again");
                        result.setTextColor(0xffe91E63);
                        Finished = true;
                        Started = false;
                    }
                }
                break;
            case R.id.drive2:
                View Car2 = findViewById(R.id.Car2);
                if(Started && !Finished){
                    ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams)Car2.getLayoutParams();
                    margin.leftMargin += 50;
                    Car2. requestLayout();
                    if(margin.leftMargin >= 1000){
	                    result.setText("Победа 2 игрока");
                        start.setText("Заново");
                        result.setTextColor(0xfff00000);
                        Finished = true;
                        Started = false;
                    }
                }
                break;
            }

        }

    }
