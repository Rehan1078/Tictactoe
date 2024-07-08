package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);


        Thread stub = new Thread(){
            @Override
            public void run() {

                try{
                    sleep(4000);
                }
                catch (Exception e){}
                finally {
                    Intent intent = new Intent(Splashactivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }

        };

        stub.start();


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(Splashactivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        },4000);
    }
}