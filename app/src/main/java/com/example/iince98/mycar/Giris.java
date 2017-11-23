package com.example.iince98.mycar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by iince98 on 12/11/2017.
 */

public class Giris extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        /**
        Animation myanimation= AnimationUtils.loadAnimation(this, R.anim.gecis);
        aracbakim.startAnimation(myanimation);

        Thread zamanlayıcı= new Thread() {

            public void run () {
                try {
                    sleep(5000);
                    Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        zamanlayıcı.start();
         */

        Button aracbakımbilgi= (Button) findViewById(R.id.bkm_bilgi);
        Button aracbakımesas= (Button) findViewById(R.id.bkm_esas);
        Button aracyedekparca= (Button) findViewById(R.id.yedekparca);
        Button aracbakımtavsiye= (Button) findViewById(R.id.bkm_tavsiye);

        aracbakımbilgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startActivityIntent = new Intent(getApplicationContext(), Arac_bilgi.class);
                startActivity(startActivityIntent);
            }
        });

        aracbakımesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        aracyedekparca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        aracbakımtavsiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}