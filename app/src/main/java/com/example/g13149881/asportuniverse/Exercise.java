package com.example.g13149881.asportuniverse;

/**
 * Created by g13149881 on 04/04/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_layout);


        Button home = (Button) findViewById(R.id.button_home);
        Button ufc = (Button) findViewById(R.id.nutrition_button);
        Button rugby = (Button) findViewById(R.id.cardio_button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Exercise.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        ufc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Exercise.this, Nutrition.class);
                startActivity(myIntent);

            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Exercise.this, Cardio.class);
                startActivity(myIntent);
            }
        });
    }
}