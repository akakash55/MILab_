package com.example.question8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int pencils=2,pens=2,erasers=2;
    TextView penQuantity,eraserQuantity,pencilQuantity;
    TextView total_cost;
    Button addEraser,removerEraser,addPen,addPencil,removePen,removePencil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penQuantity = (TextView) findViewById(R.id.pen_quantity);
        pencilQuantity = (TextView) findViewById(R.id.pencil_quantity);
        eraserQuantity = (TextView) findViewById(R.id.eraser_quantity);
        addEraser = (Button) findViewById(R.id.addEraser);
        addPen = (Button) findViewById(R.id.addPen);
        addPencil = (Button) findViewById(R.id.addPencil);
        total_cost = (TextView) findViewById(R.id.total_cost);
        removerEraser = (Button) findViewById(R.id.removeEraser);
        removePen = (Button) findViewById(R.id.removePen);
        removePencil = (Button) findViewById(R.id.removePencil);
        addPen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pens==100) {
                    Toast.makeText(MainActivity.this,"You cannot have more than 100 pens",Toast.LENGTH_SHORT).show();
                    return;
                }
                pens++;
                penQuantity.setText(String.valueOf(pens));
                displayPrice();
            }
        });
        removePen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pens==1) {
                    Toast.makeText(MainActivity.this,"You cannot have less than 1 pen",Toast.LENGTH_SHORT).show();
                    return;
                }
                pens--;
                penQuantity.setText(String.valueOf(pens));
                displayPrice();
            }
        });
        addEraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(erasers==100) {
                    Toast.makeText(MainActivity.this,"You cannot have less than 100 erasers",Toast.LENGTH_SHORT).show();
                    return;
                }
                erasers++;
                eraserQuantity.setText(String.valueOf(erasers));
                displayPrice();
            }
        });
        removerEraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(erasers==1) {
                    Toast.makeText(MainActivity.this,"You cannot have less than 1 eraser",Toast.LENGTH_SHORT).show();
                    return;
                }
                erasers--;
                eraserQuantity.setText(String.valueOf(erasers));
                displayPrice();
            }
        });
        addPencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pencils==100) {
                    Toast.makeText(MainActivity.this,"You cannot have more than 100 pencils",Toast.LENGTH_SHORT).show();
                    return;
                }
                pencils++;
                pencilQuantity.setText(String.valueOf(pencils));
                displayPrice();
            }
        });
        removePencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pencils==1) {
                    Toast.makeText(MainActivity.this,"You cannot have less than 1 pencil",Toast.LENGTH_SHORT).show();
                    return;
                }
                pencils--;
                pencilQuantity.setText(String.valueOf(pencils));
                displayPrice();
            }
        });
    }
    public void displayPrice() {
        int cost=pens*10+pencils*7+erasers*5;
        total_cost.setText(String.valueOf(cost));
    }
}