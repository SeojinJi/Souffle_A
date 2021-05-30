package com.example.colorprinted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Color_layout extends AppCompatActivity {

    View BgRed, BgOrange, BgYellow, BgGreen, BgBlue, BgIndigo, BgViolet, BgWhite, BgBlack;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_layout);

        BgRed = findViewById(R.id.BgRed);
        BgOrange= findViewById(R.id.BgOrange);
        BgYellow=findViewById(R.id.BgYellow);
        BgGreen=findViewById(R.id.BgGreen);
        BgBlue=findViewById(R.id.BgBlue);
        BgIndigo=findViewById(R.id.BgIndigo);
        BgViolet=findViewById(R.id.BgViolet);
        BgWhite=findViewById(R.id.BgWhite);
        BgBlack=findViewById(R.id.BgBlack);
    }


    public void mOnClick(View v){
        finish();
    }
}
