package com.example.android.musicalstructure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop category
        TextView pop = (TextView) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopListerActivity}
                Intent popIntent = new Intent(MainActivity.this, PopListerActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the blues category
        TextView blues = (TextView) findViewById(R.id.blues);

        // Set a click listener on that View
        blues.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the blues category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BluesListerActivity page}
                Intent bluesIntent = new Intent(MainActivity.this, BluesListerActivity.class);

                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the rock category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockListerActivity page}
                Intent rockIntent = new Intent(MainActivity.this, RockListerActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });
    }
}
