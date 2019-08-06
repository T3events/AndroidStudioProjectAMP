package edu.ivytech.final5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SecondaryFrag extends Fragment implements View.OnClickListener {

    // Define vars for widgets
    private Button bonus1;
   private TextView textView;

    // preferences set up
    protected SharedPreferences prefs;
    protected boolean disableBtn = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // Set the default values for the preferences
        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);

        // Get default SharedPreferences object
        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_sec, container, false);
        // Setup Button and text
        bonus1 = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textView);

        // Set listener
        bonus1.setOnClickListener(this);

        setHasOptionsMenu(true);

        return view;

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(Intent.ACTION_VIEW); // implicit intent
                i.setData(Uri.parse("https://poshmark.com/signup"));
                Intent choose = Intent.createChooser(i, "Open site with...");

                //this means if theres at least one browser:
                //   if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(choose);
                break;
        }
    }

}
