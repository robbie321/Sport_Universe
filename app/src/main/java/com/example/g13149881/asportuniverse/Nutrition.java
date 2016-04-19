package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nutrition);


        Button home = (Button) findViewById(R.id.button_home);
        Button soccer = (Button) findViewById(R.id.exercise_button);
        Button rugby = (Button) findViewById(R.id.cardio_button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Nutrition.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Nutrition.this, Exercise.class);
                startActivity(myIntent);
            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Nutrition.this, Cardio.class);
                startActivity(myIntent);
            }
        });
    }
}
