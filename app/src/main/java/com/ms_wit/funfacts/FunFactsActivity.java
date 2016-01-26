package com.ms_wit.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        final RelativeLayout coloredLayout = (RelativeLayout) findViewById(R.id.coloredLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                coloredLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
    }


}
