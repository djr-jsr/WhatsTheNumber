package anky.dj.iitkgp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Head extends Activity {
	Button button1, settings, button2, help,rate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.head);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.about);
		settings = (Button) findViewById(R.id.settings);
		help = (Button) findViewById(R.id.help);
		rate = (Button) findViewById(R.id.rate);

		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent start = new Intent("anky.dj.iitkgp.MODES");
				startActivity(start);

			}

		});
		help.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent start = new Intent("anky.dj.iitkgp.HELP");
				startActivity(start);

			}

		});
		settings.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent start = new Intent("anky.dj.iitkgp.SETTINGS");
				startActivity(start);

			}

		});
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent start = new Intent("anky.dj.iitkgp.ABOUT");
				startActivity(start);

			}

		});
		rate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Uri uri = Uri.parse("market://details?id=" + getPackageName());
				Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
				try {
				  startActivity(goToMarket);
				} catch (ActivityNotFoundException e) {
				  startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
				}

			}

		});
	}

}
