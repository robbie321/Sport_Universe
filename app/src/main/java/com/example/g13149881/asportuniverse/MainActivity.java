package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton soccer = (ImageButton) findViewById(R.id.soccer_button);
        Button ufc = (Button) findViewById(R.id.ufc_button);
        ImageButton rugby = (ImageButton) findViewById(R.id.rugby_button);


        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Soccer data", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, SoccerRss.class);
                startActivity(myIntent);
            }
        });
        ufc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Loading UFC data", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, UFCrss.class);
                startActivity(myIntent);

            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Loading Rugby data", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, RugbyRss.class);
                startActivity(myIntent);
            }
        });
    }
}
