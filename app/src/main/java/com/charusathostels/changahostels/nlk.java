package com.charusathostels.changahostels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;


public class nlk extends AppCompatActivity {
    private Button nlkfees;
    private ImageView nlkfeess;
    private Button nlkaddress;
    private ImageView nlkaddresss;
    private Button nlkcontact;
    private ImageView nlkcontactss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nlk);
        nlkfees =findViewById(R.id.nlkfees);

        nlkfeess=findViewById(R.id.nlkfeess);
        nlkfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkfees.class));
            }
        });

        nlkfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkfees.class));
            }
        });
        nlkaddress=findViewById(R.id.nlkaddress);
        nlkaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkaddress.class));
            }
        });
        nlkaddresss=findViewById(R.id.nlkaddresss);
        nlkaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkaddress.class));
            }
        });

        nlkcontact= findViewById(R.id.nlkcontact);
        nlkcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkcontact.class));
            }
        });
        nlkcontactss = findViewById(R.id.nlkcontactss);
        nlkcontactss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nlk.this,nlkcontact.class));
            }
        });

    }
}

