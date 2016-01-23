package com.ms_wit.funfacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = "";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                fact = randomNumber + "";
                if (randomNumber == 0) {
                    fact = "Ants stretch when they wake up in the morning.";

                }
                else if (randomNumber ==1) {
                    fact = "Ostriches run faster than horses.";
                }
                else if {
                    fact = "Olympic gold medals are mostly made of silver.";
                }
                else {
                    fact = "Opps. Something's gone horribly wrong. " +
                            "It's likely the end of the world as we know it.";
                }
                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
