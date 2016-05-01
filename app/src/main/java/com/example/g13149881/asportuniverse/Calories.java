package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by g13155105 on 25/04/2016.
 */
public class Calories extends Activity {
    //Declaring static integers for the sum of how much calories you're adding to your total
    //@max the limit you want to set your daily calories at
    //@counter a counter for only displaying the notification only once for when you meet your daily target
    static int sum,max,counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calories_layout);
        //An editText for inputting your calories you consumed
        final EditText enterCalories = (EditText) findViewById(R.id.enterCals);

        //An editText for setting your calorie target
        final EditText enterTarget = (EditText) findViewById(R.id.setTarget);

        //A TextView to view your calories consumed so far
        final TextView total = (TextView) findViewById(R.id.totalcals);

        //A TextView to see the target number of calories you have set yourself
        final TextView totalcalsSet = (TextView) findViewById(R.id.target_textView);

        //A sound for the notification
        Uri sound = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dang);

        //An intent to open the same class again
        final Intent notificationIntent = new Intent(this, Calories.class);

        //A pendingIntent to call the intent "notificationIntent"
        final PendingIntent contentIntent = PendingIntent.getActivity(this
                , 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        //if the max has already been set display the your calorie target
        if(!(max == 0)){
            totalcalsSet.setText(String.valueOf(max));
        }
        //if you have already added some calories to your sum total, display how many you have consumed
        if(!(sum == 0)){
            total.setText(String.valueOf(sum));
        }

        //Building the notification for when you meet your calorie target
        final Notification notification = new NotificationCompat.Builder(this)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setContentTitle("Congratulations")
                .setContentText("Calorie target reached!!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setVisibility(1)
                .setSound(sound)
                .setContentIntent(contentIntent)
                .build();
        //Creating the notificationManager
        final NotificationManager notificationManager
                = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //handle for the Button to add calories to sum
        Button add = (Button) findViewById(R.id.button_add);
        //button listener for button "add"
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //giving sum and calories consumed a value
                sum += 0;
                int caloriesConsumed = 0;

                //display a toast error if nothing is inputted and the button is clicked
                if (enterCalories.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    //parseing the EditText to an integer value to give to the int caloriesConsumed
                    caloriesConsumed = Integer.parseInt(enterCalories.getText().toString());

                    //add caloriesConsumed to sum
                    sum += caloriesConsumed;

                    //set the TextView to display the amount of calories consumed
                    total.setText(String.valueOf(sum));
                }
                //if the counter is 0 and the sum is greater than or equal to the target set, then display the notification and increment the counter by 1
                if(counter == 0 && sum >= max){
                        notificationManager.notify(0, notification );
                    counter++;
                }
            }
        });
        //button handler for set
        Button set = (Button) findViewById(R.id.button_setTarget);
        //button listener to add target
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display toast error if nothing is inputted into textview and button is clicked
                if (enterTarget.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    //set the max to the value of the editText parsed into integer
                    max = Integer.parseInt(enterTarget.getText().toString());
                    //display the max target set
                    totalcalsSet.setText(String.valueOf(max));
                }
            }
        });
        //button handle to reset the sum,max and counter values
        final Button reset = (Button) findViewById(R.id.button_reset);
        //button listener for reset
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max=0;
                sum=0;
                counter=0;
            }
        });
    }
}