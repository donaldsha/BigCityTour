package com.example.bigcitytour;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Min-Pc on 3/4/2018.
 */

public class SplashActivity extends AppCompatActivity{
    //splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //display splash screen with the given timer
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent (SplashActivity.this, MainActivity.class));

                //close splash Activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
