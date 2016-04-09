package com.example.g13149881.asportuniverse;

/**
 * Created by g13149881 on 04/04/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SoccerRss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer_rss);


        Button home = (Button) findViewById(R.id.button_home);
        Button ufc = (Button) findViewById(R.id.ufc_button);
        Button rugby = (Button) findViewById(R.id.rugby_button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SoccerRss.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        ufc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SoccerRss.this, UFCrss.class);
                startActivity(myIntent);

            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SoccerRss.this, RugbyRss.class);
                startActivity(myIntent);
            }
        });
    }
}