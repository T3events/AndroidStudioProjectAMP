package edu.ivytech.final5;
// DONE
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        // frag setup
        FragmentManager fm = getFragmentManager();
        // get/display frag
        FragmentTransaction ft = fm.beginTransaction();
        // replacement frag
        ft.commit();
    }
}
