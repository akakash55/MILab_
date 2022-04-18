package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v)
    {
        EditText xcor1=(EditText)findViewById(R.id.x1);
        EditText ycor1=(EditText)findViewById(R.id.y1);
        EditText xcor2=(EditText)findViewById(R.id.x2);
        EditText ycor2=(EditText)findViewById(R.id.y2);
        EditText display=(EditText)findViewById(R.id.ans);
        int x1=Integer.parseInt(xcor1.getText().toString());
        int y1=Integer.parseInt(ycor1.getText().toString());
        int x2=Integer.parseInt(xcor2.getText().toString());
        int y2=Integer.parseInt(ycor2.getText().toString());
        Switch simpleSwitch = (Switch) findViewById(R.id.round);
        Boolean switchState = simpleSwitch.isChecked();
        if(!switchState){
            double res=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
            display.setText("Value = "+res);
        }
        else
        {
            int res= (int) Math.round(Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))));
            display.setText("Value = "+res);
        }
    }

}