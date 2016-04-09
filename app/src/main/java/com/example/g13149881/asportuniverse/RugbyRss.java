package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by g13155105 on 04/04/2016.
 */
public class RugbyRss extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rugby_rss);


        Button home = (Button) findViewById(R.id.button_home);
        Button soccer = (Button) findViewById(R.id.soccer_button);
        Button ufc = (Button) findViewById(R.id.ufc_button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RugbyRss.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RugbyRss.this, SoccerRss.class);
                startActivity(myIntent);
            }
        });
        ufc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RugbyRss.this, UFCrss.class);
                startActivity(myIntent);
            }
        });
    }
}