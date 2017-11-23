package com.example.iince98.mycar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

/**
 * Created by iince98 on 12/11/2017.
 */

public class Giris extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);

        ImageButton aracbakim= (ImageButton) findViewById(R.id.aracbakim);

        //Animation myanimation= AnimationUtils.loadAnimation(this, R.anim.gecis);
        //aracbakim.startAnimation(myanimation);

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


    }
}