package anky.dj.iitkgp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Menu extends Activity {
	Button beginner, intermediate, expert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.menu);
		beginner = (Button) findViewById(R.id.beginner);
		intermediate = (Button) findViewById(R.id.intermediate);
		expert = (Button) findViewById(R.id.expert);
		beginner.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelone = new Intent("anky.dj.iitkgp.LEVELONE");
				startActivity(levelone);
			}

		});
		intermediate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent leveltwo = new Intent("anky.dj.iitkgp.LEVELTWO");
				startActivity(leveltwo);
			}

		});
		expert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent levelthree = new Intent("anky.dj.iitkgp.LEVELTHREE");
				startActivity(levelthree);
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

		return true;
	}

	protected void onPause() {
		super.onPause();
		finish();
	}
}