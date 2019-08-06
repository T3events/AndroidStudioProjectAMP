// copyright AMP 2019
package edu.ivytech.final5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // frag setup
        FragmentManager fm = getFragmentManager();
        // get/display frag
        FragmentTransaction ft = fm.beginTransaction();
        // replacement frag
        ft.commit();

    }

}

//////////////////////////////////////////////////////////////////////////
    /* WORKS PERFECTLY alternate way without Listeners
    public void onClick(View v) {

        Intent intent = null, choose = null;
        switch (v.getId()) {
            case (R.id.ebayMercariButton):

                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://www.google.com/"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");

                //this means if theres at least one browser:
                //   if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(choose);
                break;
            case (R.id.allSitesButton):
                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://www.yahoo.com/"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");
                startActivity(choose);
                break;
            case (R.id.mercariPoshButton):
                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://www.yahoo.com/"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");
                startActivity(choose);

                break;

            case (R.id.poshEbayButton):
                intent = new Intent(Intent.ACTION_VIEW); // implicit intent
                intent.setData(Uri.parse("https://www.yahoo.com/"));
                choose = Intent.createChooser(intent, "Open Search Engine with...");
                startActivity(choose);

                break;

            case (R.id.help):
                //regular launch via intent DO SAME FOR PREFERENCES
               // openHelp();
                Intent i = new Intent(this, HelpActivity.class);
                startActivity(i);

                break;

        //    case (R.id.btnPref):
         //       intent = new Intent(this, SettingsActivity.class);
         //       startActivity(intent);
         //       break;

        }

    }
  //  public void openHelp() {
  //      Intent i = new Intent(this, HelpActivity.class);
  //      startActivity(i);
 //   }
-----------------------------------------------------------------------

}

//   mUrl = Uri.parse("https://yahoo.com/");
//  Intent intent = new Intent(this, SearchFrag.class);
//  final WebView webview = findViewById(R.id.webview);
*/