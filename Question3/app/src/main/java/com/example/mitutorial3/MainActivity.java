package com.example.mitutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  EditText inputText,shiftSize;
  Button encrypt;
  String originalMsg;
  StringBuffer encryptedMsg;
  String shift;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    inputText = (EditText) findViewById(R.id.multilineText);
    shiftSize = (EditText) findViewById(R.id.shift);
    encrypt = (Button) findViewById(R.id.calculate);
    encrypt.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        originalMsg = inputText.getText().toString();
        shift = shiftSize.getText().toString();
        int shiftInt;
        if(shift==null) {
          shiftInt=1;
        } else {
           shiftInt = Integer.parseInt(shift);
        }
        encryptedMsg = encryption(originalMsg,shiftInt);
        Intent intent = new Intent(MainActivity.this,result.class);
        intent.putExtra("ShiftSize",shiftInt);
        intent.putExtra("encryptedMsg", (CharSequence) encryptedMsg);
        startActivity(intent);
      }
    });
  }

  public static StringBuffer encryption(String text, int s)
  {
    StringBuffer result= new StringBuffer();
    for (int i=0; i<text.length(); i++)
    {
      if (Character.isUpperCase(text.charAt(i)))
      {
        char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
        result.append(ch);
      }
      else
      {
        char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
        result.append(ch);
      }
    }
    return result;
  }
}