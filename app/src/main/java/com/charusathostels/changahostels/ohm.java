package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ohm extends AppCompatActivity {
    private Button ohmfees;
    private ImageView ohmfeess;
    private Button ohmaddress;
    private ImageView ohmaddresss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohm);

        ohmfees = (Button) findViewById(R.id.ohmfees);
        ohmfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmfees.class));
            }
        });
        ohmfeess = findViewById(R.id.ohmfeess);
        ohmfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmfees.class));
            }
        });

        ohmaddress = findViewById(R.id.ohmaddress);
        ohmaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmaddress.class));
            }
        });

        ohmaddresss = findViewById(R.id.ohmaddresss);
        ohmaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ohm.this,ohmaddress.class));
            }
        });
    }
}
