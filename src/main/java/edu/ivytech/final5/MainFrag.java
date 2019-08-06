package edu.ivytech.final5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFrag extends Fragment implements View.OnClickListener {

    // define vars for widgets
    public Button help;
    private Button allSitesButton;
    private Button ebayMercariButton;
    private Button poshEbayButton;
    private Button mercariPoshButton;
    public Button btnPref;
    public Button button2;

    // preferences set up
    protected SharedPreferences prefs;
    protected boolean disableBtn = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // Set the default value for the preferences
        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);

        // Get default SharedPreferences
        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_main, container, false);

        // get ref to widgets
        button2 = (Button) view.findViewById(R.id.button2);
        btnPref = (Button) view.findViewById(R.id.btnPref);
        help = (Button) view.findViewById(R.id.help);
        allSitesButton = (Button) view.findViewById(R.id.allSitesButton);
        ebayMercariButton = (Button) view.findViewById(R.id.ebayMercariButton);
        poshEbayButton = (Button) view.findViewById(R.id.poshEbayButton);
        mercariPoshButton = (Button) view.findViewById(R.id.mercariPoshButton);


        // set listeners
        button2.setOnClickListener(this);
        btnPref.setOnClickListener(this);
        help.setOnClickListener(this);
        allSitesButton.setOnClickListener(this);
        ebayMercariButton.setOnClickListener(this);
        poshEbayButton.setOnClickListener(this);
        mercariPoshButton.setOnClickListener(this);

        return view;

    }


    @Override
    public void onPause() {

        SharedPreferences.Editor editor = prefs.edit();

        // save check preference
        editor.putBoolean("check_box_3", disableBtn);
        editor.commit();
        super.onPause();
    }


    public void onResume() {
        super.onResume();
        // Gather the information from the prefs variable that was saved
        disableBtn = prefs.getBoolean("check_box_3", disableBtn);
    }


    @Override
    public void onClick(View v) {
        Intent intent, choose; //they can all share these vars

        switch (v.getId()) {
            case (R.id.ebayMercariButton):

                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://cse.google.com/cse?cx=011756999790210407116:rlgdn4xfjji"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");

                startActivity(choose);
                break;
            case (R.id.allSitesButton):
                // if preference was checked/changed to true, skip, otherwise launch
                if (disableBtn != false) {
                    break;


                } else {   //default is to keep btn active

                    intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                    intent.setData(Uri.parse("https://cse.google.com/cse?cx=011756999790210407116:kaxbhq-au5m"));
                    choose = Intent.createChooser(intent, "Open Search Engine with...");
                    startActivity(choose);
                    break;
                }
            case (R.id.mercariPoshButton):
                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://cse.google.com/cse?cx=011756999790210407116:jpxoy6l9mv8"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");
                startActivity(choose);

                break;

            case (R.id.poshEbayButton):
                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://cse.google.com/cse?cx=011756999790210407116:avp6csdv5hi"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");
                startActivity(choose);

                break;
            //if they dont pick a search engine they have a few more button press options
            case (R.id.help):
                startActivity(new Intent(getActivity(), HelpActivity.class));
                break;

            case (R.id.btnPref):

                startActivity(new Intent(getActivity(), SettingsActivity.class));
                break;
            // button2 launches other activity (bonus signups)
            case (R.id.button2):

                startActivity(new Intent(getActivity(), SecondaryActivity.class));
                break;

        }
    }

}


