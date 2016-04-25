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
        Button Exercise = (Button) findViewById(R.id.exercise_button);
        Button Nutrition = (Button) findViewById(R.id.nutrition_button);
        Button Cardio = (Button) findViewById(R.id.cardio_button);

        Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Nutrition.this, Bulk.class);
                startActivity(myIntent);
            }
        });
        Nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        Cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Nutrition.this, Cardio.class);
                startActivity(myIntent);
            }
        });

    }
}
