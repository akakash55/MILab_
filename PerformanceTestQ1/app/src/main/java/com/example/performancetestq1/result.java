package com.example.performancetestq1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class result extends AppCompatActivity {

    TextView dateandtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        dateandtime=(TextView) findViewById(R.id.dateandtime);
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        dateandtime.setText(currentDateTimeString);
    }
}