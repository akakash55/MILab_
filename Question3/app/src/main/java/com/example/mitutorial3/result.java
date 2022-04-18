package com.example.mitutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

  TextView title,message;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);
    title = (TextView)findViewById(R.id.title);
    message = (TextView)findViewById(R.id.message);
    int shiftSize = getIntent().getIntExtra("ShiftSize",0);
    String msg = getIntent().getStringExtra("encryptedMsg");

    title.setText("Encryption with "+shiftSize);
    message.setText(msg);
  }
}