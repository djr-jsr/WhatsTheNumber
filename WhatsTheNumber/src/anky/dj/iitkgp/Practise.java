package anky.dj.iitkgp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Practise extends Activity {
	Button p1, p2, p3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.practise);
		p1 = (Button) findViewById(R.id.p1);
		p2 = (Button) findViewById(R.id.p2);
		p3 = (Button) findViewById(R.id.p3);
		p1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.P1");
				startActivity(levelone);
			}

		});
		p2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.P2");
				startActivity(levelone);
			}

		});
		p3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.P3");
				startActivity(levelone);
			}

		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// replaces the default 'Back' button action
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent menu = new Intent("anky.dj.iitkgp.MODES");
			startActivity(menu);
		}
		if (keyCode == KeyEvent.KEYCODE_HOME) {
			// The Code Want to Perform.
			Intent menu = new Intent("com.example.thenewworld.LEVELTHREE");
			startActivity(menu);
		}
		if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
			// do what you want with the power button
			return true;
		}

		return true;
	}

	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}

}
