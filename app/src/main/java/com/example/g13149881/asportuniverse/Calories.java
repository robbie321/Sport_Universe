package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by g13155105 on 25/04/2016.
 */
public class Calories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calories_layout);

        final EditText enterCalories = (EditText) findViewById(R.id.enterCals);
        final EditText enterTarget = (EditText) findViewById(R.id.target);
        final Button add = (Button) findViewById(R.id.button_add);

        final TextView total = (TextView) findViewById(R.id.totalcals);
        final TextView totalcalsSet = (TextView) findViewById(R.id.setTarget);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = 0;
                int caloriesConsumed = 0;
                int max = 0;

                if(enterTarget.getText().toString().equals("") || enterCalories.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    caloriesConsumed = Integer.parseInt(enterCalories.getText().toString());


                    sum += caloriesConsumed;


                    total.setText(String.valueOf(sum));

                }
            }
        });

    }
}