package com.example.g13149881.asportuniverse;

/**
 * Created by g13149881 on 04/04/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SoccerRss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer_rss);


        Button home = (Button) findViewById(R.id.button_home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SoccerRss.this, MainActivity.class);
                SoccerRss.this.startActivity(myIntent);


            }
        });
    }
}