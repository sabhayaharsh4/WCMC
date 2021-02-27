package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ash extends AppCompatActivity {

    private Button ashfees;
    private ImageView ashfeess;
    private Button ashaddress;
    private ImageView ashaddresss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ash);

        ashfees = (Button) findViewById(R.id.ashfees);
        ashfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashfees.class));
            }
        });

        ashfeess = findViewById(R.id.ashfeess);
        ashfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashfees.class));
            }
        });

        ashaddress = findViewById(R.id.ashaddress);
        ashaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashaddress.class));
            }
        });

        ashaddresss = findViewById(R.id.ashaddresss);
        ashaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ash.this,ashaddress.class));
            }
        });


    }
}
