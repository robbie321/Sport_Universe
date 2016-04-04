package com.example.g13149881.asportuniverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by g13155105 on 04/04/2016.
 */
public class RugbyRss {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rugby_rss);


        Button home = (Button) findViewById(R.id.button_home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Home selected", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(SoccerRss.this, MainActivity.class);
                SoccerRss.this.startActivity(myIntent);


            }
        });
    }
}