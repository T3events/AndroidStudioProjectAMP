package edu.ivytech.final5;
// DONE
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    // do in Fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.help_activity);
        // frag setup
        FragmentManager fm = getFragmentManager();
        // get/display frag
        FragmentTransaction ft = fm.beginTransaction();
        // replacement frag
        ft.commit();

    }
}
