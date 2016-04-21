package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by g13155105 on 19/04/2016.
 */
public class BmiCalculator extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);

        final Button calculate_BMI = (Button) findViewById(R.id.calc);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText height = (EditText) findViewById(R.id.height);
        final TextView result = (TextView) findViewById(R.id.view_result);
        final TextView msg = (TextView) findViewById(R.id.view_msg);

        calculate_BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 double w,h,bmi;

                String message = "";
                if(weight.getText().toString().equals("") || height.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    w = Double.parseDouble(weight.getText().toString());
                    h = Double.parseDouble(height.getText().toString());

                    bmi = h * h;
                    bmi = w/bmi;

                    result.setText(String.valueOf(bmi));
                    if (bmi < 18.5) {
                        message = "Underweight";
                    } else if (bmi >= 18.5 && bmi < 25) {
                        message = "Normal";
                    } else if (bmi > 25) {
                        message = "Overweight";
                    }
                    msg.setText(message);
                }
            }
        });
    }
}