package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Exercise = (Button) findViewById(R.id.exercise_button);
        Button Nutrition = (Button) findViewById(R.id.nutrition_button);
        Button Cardio = (Button) findViewById(R.id.cardio_button);
        Button Stopwatch = (Button) findViewById(R.id.stopwatch);

        Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening Exercises", Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 300);
                Intent myIntent = new Intent(MainActivity.this, Exercise.class);
                startActivity(myIntent);
            }
        });
        Nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Loading UFC Updates", Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 300);
                Intent myIntent = new Intent(MainActivity.this, Nutrition.class);
                startActivity(myIntent);

            }
        });
        Cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Loading Rugby Updates", Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 300);
                Intent myIntent = new Intent(MainActivity.this, Cardio.class);
                startActivity(myIntent);
            }
        });
        Stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, StopWatch.class);
                startActivity(myIntent);
            }
        });
    }
}
