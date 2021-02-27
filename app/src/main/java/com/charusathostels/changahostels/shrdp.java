package com.charusathostels.changahostels;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class shrdp extends AppCompatActivity {

    private Button shrdpfees;
    private ImageView shrdpfeess;
    private Button shrdpaddress;
    private ImageView shrdpaddresss;
    private Button shrdpcontact;
    private ImageView shrdpcontacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrdp);

        shrdpfees = findViewById(R.id.shrdpfees);
        shrdpfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpfees.class));
            }
        });
        shrdpfeess = findViewById(R.id.shrdpfeess);
        shrdpfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpfees.class));
            }
        });

        shrdpaddress = findViewById(R.id.shrdpaddress);
        shrdpaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpaddress.class));
            }
        });

        shrdpaddresss = findViewById(R.id.shrdpaddresss);
        shrdpaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpaddress.class));
            }
        });
        shrdpcontact= findViewById(R.id.shrdpcontact);
        shrdpcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpcontact.class));
            }
        });
        shrdpcontacts= findViewById(R.id.shrdpcontacts);
        shrdpcontacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shrdp.this,shrdpcontact.class));
            }
        });
    }
}
