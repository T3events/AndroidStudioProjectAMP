package edu.ivytech.final5;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    //do intent from main

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);

       Intent i = getIntent();
    }
}
