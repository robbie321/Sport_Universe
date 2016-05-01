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

        //buttons created for Nutrition activity
        Button Bulk = (Button) findViewById(R.id.bulk_button);
        Button Lean = (Button) findViewById(R.id.lean_button);
        Button Cal = (Button) findViewById(R.id.calories_button);

        // listening for bulk button click
        Bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent constructor takes a Context as it's first parameter
                // (.this is used because Nutrition is a subclass of context)
                //and then the class of the page to where the system delivers the Intent
                Intent myIntent = new Intent(Nutrition.this, Bulk.class);
                startActivity(myIntent);
            }
        });
        // listening for 7 day diet plan button click
        Lean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent constructor takes a Context as it's first parameter
                // (.this is used because Nutrition is a subclass of context)
                //and then the class of the page to where the system delivers the Intent
                Intent myIntent = new Intent(Nutrition.this, Lean.class);
                startActivity(myIntent);
            }
        });
        // listening for calrie button click
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent constructor takes a Context as it's first parameter
                // (.this is used because Nutrition is a subclass of context)
                //and then the class of the page to where the system delivers the Intent
                Intent myIntent = new Intent(Nutrition.this, Calories.class);
                startActivity(myIntent);
            }
        });

    }
}
