package edu.ivytech.final5;
// done
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // frag setup
        FragmentManager fm = getFragmentManager();
        // get/display frag
        FragmentTransaction ft = fm.beginTransaction();
        // replacement frag
        ft.commit();



    }
}


