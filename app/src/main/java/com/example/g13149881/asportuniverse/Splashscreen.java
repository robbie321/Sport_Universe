package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by mblackweir on 08/04/2016.
 */

public class Splashscreen extends Activity {

    public static final int seconds = 4;
    public static final int miliseconds = seconds * 1000;

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_layout);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(seconds - 1);
        progressBar.getProgressDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

        startAnimation();
    }

    public void startAnimation() {
        new CountDownTimer(miliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //progressbar update--->1 second
                progressBar.setProgress(getMiliseconds(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                Splashscreen.this.startActivityForResult(i, 1);
            }
        }.start();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //when I return to the MainActivity, finish my app
        if (requestCode == 1) finish();
    }

    public int getMiliseconds(long milis) {
        return (int) ((miliseconds - milis) / 1000);
    }
}