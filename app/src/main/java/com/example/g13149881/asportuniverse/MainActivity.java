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

        //buttons created for main activity
        Button Exercise = (Button) findViewById(R.id.exercise_button);
        Button Nutrition = (Button) findViewById(R.id.nutrition_button);
        Button Cardio = (Button) findViewById(R.id.cardio_button);
        Button Stopwatch = (Button) findViewById(R.id.stopwatch);
        Button BMI = (Button) findViewById(R.id.bmi_button);


        // listening for Exercise button click
        Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make toast, set this apps context, text and duration
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening Exercises", Toast.LENGTH_SHORT);
                //show toast
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
        // listening for nutrition button click
        Nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make toast, set this apps context, text and duration
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening Nutrition", Toast.LENGTH_SHORT);
                //show toast
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
        // listening for cardio button click
        Cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make toast, set this apps context, text and duration
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening Cardio", Toast.LENGTH_SHORT);
                //show toast
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
        // listening stopwatch bulk button click
        Stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make toast, set this apps context, text and duration
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening Stopwatch", Toast.LENGTH_SHORT);
                //show toast
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 300);
                Intent myIntent = new Intent(MainActivity.this, StopWatch.class);
                startActivity(myIntent);
            }
        });
        // listening for bmi button click
        BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make toast, set this apps context, text and duration
                final Toast toast = Toast.makeText(getApplicationContext(), "Opening BMI Calculator", Toast.LENGTH_SHORT);
                //show toast
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 300);
                Intent myIntent = new Intent(MainActivity.this, BmiCalculator.class);
                startActivity(myIntent);
            }
        });
    }
}
