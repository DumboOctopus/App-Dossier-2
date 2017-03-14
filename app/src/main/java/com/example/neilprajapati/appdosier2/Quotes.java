package com.example.neilprajapati.appdosier2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quotes extends AppCompatActivity {

    private TextView quoteBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);


        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quoteSetup();
            }
        });
    }

    private void quoteSetup() {
        Random rand = new Random();

        Resources res = getResources();
        String[] quotes = res.getStringArray(R.array.quotes);

        quoteBox = (TextView) findViewById(R.id.quoteBox);
        int randomValue = rand.nextInt(quotes.length);
        quoteBox.setText(quotes[randomValue]);
    }

}
