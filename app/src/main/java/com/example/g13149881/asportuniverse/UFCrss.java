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


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Home selected", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(UFCrss.this, MainActivity.class);
                UFCrss.this.startActivity(myIntent);
            }
        });
    }
}
