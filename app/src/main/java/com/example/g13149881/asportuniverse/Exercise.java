package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mblackweir on 21/04/2016.
 */
public class Exercise extends Activity
    {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_layout);

        //creating buttons for exercise activity
        Button chest = (Button) findViewById(R.id.chest_button);
        Button back = (Button) findViewById(R.id.back_button);
        Button shoulders = (Button) findViewById(R.id.shoulders_button);
        Button arms = (Button) findViewById(R.id.arms_button);
        Button legs = (Button) findViewById(R.id.legs_button);
        Button abs = (Button) findViewById(R.id.abs_button);

        // listening for chest button click
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Exercise.this, Chest_main.class);
                startActivity(myIntent);
            }
        });
            // listening for back button click
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent constructor takes a Context as it's first parameter
                    // (.this is used because Exercise is a subclass of context)
                    //and then the class of the page to where the system delivers the Intent
                    Intent myIntent = new Intent(Exercise.this, Back_main.class);
                    startActivity(myIntent);
                }
            });
            // listening for shoulders button click
            shoulders.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent constructor takes a Context as it's first parameter
                    // (.this is used because Exercise is a subclass of context)
                    //and then the class of the page to where the system delivers the Intent
                    Intent myIntent = new Intent(Exercise.this, Shoulders_main.class);
                    startActivity(myIntent);
                }
            });
            // listening for arms button click
            arms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent constructor takes a Context as it's first parameter
                    // (.this is used because Exercise is a subclass of context)
                    //and then the class of the page to where the system delivers the Intent
                    Intent myIntent = new Intent(Exercise.this, Arms_main.class);
                    startActivity(myIntent);
                }
            });
            // listening for leg button click
            legs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent constructor takes a Context as it's first parameter
                    // (.this is used because Exercise is a subclass of context)
                    //and then the class of the page to where the system delivers the Intent
                    Intent myIntent = new Intent(Exercise.this, Legs_main.class);
                    startActivity(myIntent);
                }
            });
            // listening for abs button click
            abs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent constructor takes a Context as it's first parameter
                    // (.this is used because Exercise is a subclass of context)
                    //and then the class of the page to where the system delivers the Intent
                    Intent myIntent = new Intent(Exercise.this, Abs_main.class);
                    startActivity(myIntent);
                }
            });
    }
    }