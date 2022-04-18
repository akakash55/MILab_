package com.example.question7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView playground,gym,keyboard,laptop,classroom,home;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playground=findViewById(R.id.playground);
        gym=findViewById(R.id.gym);
        keyboard=findViewById(R.id.keyboard);
        laptop=findViewById(R.id.laptop);
        classroom=findViewById(R.id.classroom);
        home=findViewById(R.id.home);
        image=findViewById(R.id.image);
        playground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.playground);
            }
        });
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.gym);
            }
        });
        keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.keyboard);
            }
        });
        classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.classroom);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.laptop);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.home);
            }
        });
    }
}