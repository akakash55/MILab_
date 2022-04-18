package com.gaurav.bhag.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button enter;
    public static ArrayList<User> users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.enter);
        users.add(new User("Gaurav","gb67"));
        users.add(new User("Prateek","pk70"));
        users.add(new User("Navdeep","ns68"));
        users.add(new User("Anil","am66"));
        users.add(new User("Bhavesh","bv69"));
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginDialog dialog=new LoginDialog();
                dialog.show(getSupportFragmentManager(),"123");
            }
        });
    }
}