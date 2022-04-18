package com.example.question5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox toi,db,dj,hindu,au,rp;
    EditText result;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toi=findViewById(R.id.toi);
        db=findViewById(R.id.db);
        dj=findViewById(R.id.dj);
        hindu=findViewById(R.id.hindu);
        au=findViewById(R.id.au);
        rp=findViewById(R.id.rp);
        result=findViewById(R.id.result);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans="";
                if(toi.isChecked())
                    ans+="Times Of India\n";
                if(db.isChecked())
                    ans+="Dainik Bhaskar\n";
                if(hindu.isChecked())
                    ans+="The Hindu\n";
                if(dj.isChecked())
                    ans+="Dainik Jagran\n";
                if(au.isChecked())
                    ans+="Amar Ujala\n";
                if(rp.isChecked())
                    ans+="Rajasthan Patrika\n";
                if(ans.length()>0)
                    ans=ans.substring(0,ans.length()-1);
                result.setText(ans);
            }
        });
    }
}