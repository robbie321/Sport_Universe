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
        Button Bulk = (Button) findViewById(R.id.bulk_button);
        Button Lean = (Button) findViewById(R.id.lean_button);
        Button Cal = (Button) findViewById(R.id.calories_button);

        Bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Nutrition.this, Bulk.class);
                startActivity(myIntent);
            }
        });
        Lean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Nutrition.this, Lean.class);
                startActivity(myIntent);
            }
        });
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Nutrition.this, Calories.class);
                startActivity(myIntent);
            }
        });

    }
}
