package com.example.week3_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ImgTop, ImgBottom;
    ImageButton BtnTop, BtnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgTop = (ImageView) findViewById(R.id.ImgTop);
        ImgBottom = (ImageView) findViewById(R.id.ImgBottom);
        BtnTop = (ImageButton) findViewById(R.id.BtnTop);
        BtnBottom = (ImageButton) findViewById(R.id.BtnBottom);

        BtnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImgTop.setImageResource(R.drawable.my_face);
                ImgBottom.setImageResource(0);
            }
        });

        BtnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImgTop.setImageResource(0);
                ImgBottom.setImageResource(R.drawable.my_face);
            }
        });
    }
}