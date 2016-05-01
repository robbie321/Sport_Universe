package com.example.g13149881.asportuniverse;



import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by g13155105 on 25/04/2016.
 */
public class Calories extends ActionBarActivity {

    public static int sum,max,counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calories_layout);

        final EditText enterCalories = (EditText) findViewById(R.id.enterCals);
        final EditText enterTarget = (EditText) findViewById(R.id.setTarget);
        final TextView total = (TextView) findViewById(R.id.totalcals);
        final TextView totalcalsSet = (TextView) findViewById(R.id.target_textView);

        if(!(max == 0)){
            totalcalsSet.setText(String.valueOf(max));
        }
        if(!(sum == 0)){
            total.setText(String.valueOf(sum));
        }


        final Notification notification = new NotificationCompat.Builder(this)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setContentTitle("Congratulations")
                .setContentText("Calorie target reached!!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setVisibility(1)
                .build();

        final NotificationManager notificationManager
                = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Button add = (Button) findViewById(R.id.button_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sum += 0;
                int caloriesConsumed = 0;


                if (enterCalories.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    caloriesConsumed = Integer.parseInt(enterCalories.getText().toString());


                    sum += caloriesConsumed;


                    total.setText(String.valueOf(sum));
                }
                enterCalories.setText("");

                if(counter == 0 && sum >= max){
                        notificationManager.notify(0, notification );
                    counter++;
                }

            }
        });
        Button set = (Button) findViewById(R.id.button_setTarget);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterTarget.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Error: Invalid Input", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    max = Integer.parseInt(enterTarget.getText().toString());
                    totalcalsSet.setText(String.valueOf(max));
                }
                enterTarget.setText("");
            }
        });
    }
}