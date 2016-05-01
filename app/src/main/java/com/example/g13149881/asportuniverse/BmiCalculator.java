package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiCalculator extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
        //handle for button for calculating bmi
        final Button calculate_BMI = (Button) findViewById(R.id.calc);

        //Handle for editText to enter your weigth
        final EditText weight = (EditText) findViewById(R.id.weight);

        //Handle for editText to enter your height
        final EditText height = (EditText) findViewById(R.id.height);

        //Handle for TextView to view your result
        final TextView result = (TextView) findViewById(R.id.view_result);

        //handle for textView to view message display after your calculate your bmi
        final TextView msg = (TextView) findViewById(R.id.view_msg);
        //Listener for button calculate_BMI
        calculate_BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 //declaring w for weight,h for height,bmi for bmi
                 double w,h,bmi;
                //declaring an empty string message
                String message = "";
                //displaying a toast error if the user doesnt enter any input and clicks the button
                if(weight.getText().toString().equals("") || height.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    //set w the value entered for weight
                    //set h the value enter for heigth
                    w = Double.parseDouble(weight.getText().toString());
                    h = Double.parseDouble(height.getText().toString());

                    //formula for calculating your BMI
                    bmi = h * h;
                    bmi = w/bmi;

                    //displaying the textView result the result of your BMI
                    result.setText(String.valueOf(bmi));

                    //choosing which messgae to display in respect to the result you got
                    if (bmi < 18.5) {
                        message = "Underweight";
                    } else if (bmi >= 18.5 && bmi < 25) {
                        message = "Normal";
                    } else if (bmi > 25) {
                        message = "Overweight";
                    }
                    //Displaying the message
                    msg.setText(message);
                }
            }
        });
    }
}