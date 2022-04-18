package com.example.performancetestq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView msg;
    boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(TextView) findViewById(R.id.msg);
        runCounter();
    }
    public void runCounter() {
        Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(!flag)
                {
                    msg.setText("Hello");
                    flag=true;
                }
                else
                {
                    String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
                    msg.setText(currentDateTimeString);
                }
                handler.postDelayed(this,5000);
            }
        });
    }
}