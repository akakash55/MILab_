package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timeView;
    Button start,stop,reset;
    boolean running;
    int currentValue=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeView=(TextView) findViewById(R.id.time);
        start=(Button) findViewById(R.id.start);
        stop=(Button) findViewById(R.id.stop);
        reset=(Button) findViewById(R.id.reset);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                running=true;
                runCounter();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                running=false;
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                running=false;
                currentValue=0;
                timeView.setText(String.valueOf(currentValue));
            }
        });
    }

    public void runCounter() {
        Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                timeView.setText(String.valueOf(currentValue));
                if(running) {
                    currentValue++;
                    handler.postDelayed(this,5000);
                }
            }
        });
    }
}