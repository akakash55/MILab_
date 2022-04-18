package com.example.performancetestq2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox toi,hind,tele,amar;
    Button submit;
    int cost=0;
    String ans="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toi=findViewById(R.id.toi);
        hind=findViewById(R.id.hind);
        tele=findViewById(R.id.tele);
        amar=findViewById(R.id.amar);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toi.isChecked())
                {
                    ans+="Times of India\n";
                    cost+=(30*7);
                }
                if(hind.isChecked())
                {
                    ans+="Hindustan\n";
                    cost+=(30*4);
                }
                if(tele.isChecked())
                {
                    ans+="The Telegraph\n";
                    cost+=(30*6);
                }
                if(amar.isChecked())
                {
                    ans+="Amar Ujala\n";
                    cost+=(30*3);
                }
                if(ans.length()>0)
                    ans=ans.substring(0,ans.length()-1);
                TotalCostDialog selectedDialog = new TotalCostDialog(ans,cost);
                selectedDialog.show(getSupportFragmentManager(),"123");
            }
        });
    }
}