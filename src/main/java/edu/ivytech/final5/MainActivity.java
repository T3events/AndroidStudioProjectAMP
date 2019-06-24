package edu.ivytech.final5;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    // define vars for widgets
    public Uri mUrl;

    public Button help;
    private Button allSitesButton;
    private Button ebayMercariButton;
    private Button poshEbayButton;
    private Button mercariPoshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  View view = inflater.inflate(R.layout.activity_main, container, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//   @Override
    //  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



    /* references with view since its a fragment
    help =(Button)view.findViewById(R.id.help);
    allSitesButton =(Button)view.findViewById(R.id.allSitesButton);
    ebayMercariButton =(Button)view.findViewById(R.id.ebayMercariButton);
    poshEbayButton =(Button)view.findViewById(R.id.poshEbayButton);
    mercariPoshButton =(Button)view.findViewById(R.id.mercariPoshButton);

    // listeners for buttons
        help.setOnClickListener(this);
        allSitesButton.setOnClickListener(this);
        ebayMercariButton.setOnClickListener(this);
        poshEbayButton.setOnClickListener(this);
        mercariPoshButton.setOnClickListener(this);

        return view;
}
*/

    // alternate way without Listeners
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


}

//   mUrl = Uri.parse("https://yahoo.com/");
//  Intent intent = new Intent(this, SearchFrag.class);
//  final WebView webview = findViewById(R.id.webview);
//   mUrl = Uri.parse("https://google.com/");