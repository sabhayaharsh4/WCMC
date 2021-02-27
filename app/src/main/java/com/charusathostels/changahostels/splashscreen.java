package com.charusathostels.changahostels;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {
    private final int SPLASH_TIME_OUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {Intent mainIntent = new Intent(splashscreen.this,MainActivity.class);
            startActivity(mainIntent);
            //splashscreen.this.finish();
            }
        },SPLASH_TIME_OUT);

    }
}
