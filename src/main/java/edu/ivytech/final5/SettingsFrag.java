package edu.ivytech.final5;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SettingsFrag extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    // instance vars
    public SharedPreferences prefs;
    public boolean disableBtn = false;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        // get xml file
        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);

        // Get default SharedPreferences object
  prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        setHasOptionsMenu(true);
    }


    @Override
    public void onResume() {
        super.onResume();

        prefs.registerOnSharedPreferenceChangeListener(this);

    }

    @Override
    public void onPause() {
        prefs.unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }





    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        if (key.equals("check_box_3")) {

            disableBtn = prefs.getBoolean(key, disableBtn);
        }

    }


}

