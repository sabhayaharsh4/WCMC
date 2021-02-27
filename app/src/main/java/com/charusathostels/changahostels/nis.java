package com.charusathostels.changahostels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class nis extends AppCompatActivity {

    private Button nisfees;
    private ImageView nisfeess;
    private Button nisaddress;
    private ImageView nisaddresss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nis);

        nisfees = (Button) findViewById(R.id.nisfees);
        nisfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisfees.class));
            }
        });

        nisfeess = findViewById(R.id.nisfeess);
        nisfeess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisfees.class));
            }
        });

        nisaddress = findViewById(R.id.nisaddress);
        nisaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisaddress.class));
            }
        });

        nisaddresss = findViewById(R.id.nisaddresss);
        nisaddresss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nis.this,nisaddress.class));
            }
        });
    }
}
