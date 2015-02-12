package anky.dj.iitkgp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Modes extends Activity {
	Button normal, challenging;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.modes);
		normal = (Button) findViewById(R.id.normal);
		challenging = (Button) findViewById(R.id.challenging);
		normal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.PRACTISE");
				startActivity(levelone);
			}

		});
		challenging.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.MENU");
				startActivity(levelone);
			}

		});
	}

	protected void onPause() {
		super.onPause();
		finish();
	}

}
