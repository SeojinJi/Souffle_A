package com.example.colorprinted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View BgRed, BgOrange, BgYellow, BgGreen, BgBlue, BgIndigo, BgViolet, BgWhite, BgBlack;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BgRed = findViewById(R.id.BgRed);
        BgOrange= findViewById(R.id.BgOrange);
        BgYellow=findViewById(R.id.BgYellow);
        BgGreen=findViewById(R.id.BgGreen);
        BgBlue=findViewById(R.id.BgBlue);
        BgIndigo=findViewById(R.id.BgIndigo);
        BgViolet=findViewById(R.id.BgViolet);
        BgWhite=findViewById(R.id.BgWhite);
        BgBlack=findViewById(R.id.BgBlack);
        btn = findViewById(R.id.close);

        findViewById(R.id.red).setOnClickListener(mClickListener);
        findViewById(R.id.orange).setOnClickListener(mClickListener);
        findViewById(R.id.yellow).setOnClickListener(mClickListener);
        findViewById(R.id.green).setOnClickListener(mClickListener);
        findViewById(R.id.blue).setOnClickListener(mClickListener);
        findViewById(R.id.indigo).setOnClickListener(mClickListener);
        findViewById(R.id.violet).setOnClickListener(mClickListener);
        findViewById(R.id.white).setOnClickListener(mClickListener);
        findViewById(R.id.black).setOnClickListener(mClickListener);
        btn.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener(){
        public void onClick(View v){
            switch(v.getId()){
                case R.id.red:
                    BgRed.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.orange:
                    BgOrange.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.yellow:
                    BgYellow.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.green:
                    BgGreen.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.blue:
                    BgBlue.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.indigo:
                    BgIndigo.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.violet:
                    BgViolet.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.white:
                    BgWhite.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.black:
                    BgBlack.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
                case R.id.close:
                    BgRed.setVisibility(View.INVISIBLE);
                    BgOrange.setVisibility(View.INVISIBLE);
                    BgYellow.setVisibility(View.INVISIBLE);
                    BgGreen.setVisibility(View.INVISIBLE);
                    BgBlue.setVisibility(View.INVISIBLE);
                    BgIndigo.setVisibility(View.INVISIBLE);
                    BgViolet.setVisibility(View.INVISIBLE);
                    BgWhite.setVisibility(View.INVISIBLE);
                    BgBlack.setVisibility(View.INVISIBLE);
                    btn.setVisibility(View.INVISIBLE);
            }
        }
    };
}