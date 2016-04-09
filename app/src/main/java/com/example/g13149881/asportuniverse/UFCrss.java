package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UFCrss extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ufc_rss);


        Button home = (Button) findViewById(R.id.button_home);
        Button soccer = (Button) findViewById(R.id.soccer_button);
        Button rugby = (Button) findViewById(R.id.rugby_button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UFCrss.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UFCrss.this, SoccerRss.class);
                startActivity(myIntent);
            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UFCrss.this, RugbyRss.class);
                startActivity(myIntent);
            }
        });
    }
}
