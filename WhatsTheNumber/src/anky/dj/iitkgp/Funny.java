package anky.dj.iitkgp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Funny extends Activity {
	MediaPlayer ourSong;
	TextView tv;
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.funny);
		ourSong = MediaPlayer.create(Funny.this, R.raw.fail_sound);

		tv = (TextView) findViewById(R.id.textView1);
		b1 = (Button) findViewById(R.id.tryagain);
		Levelone obj = new Levelone();
		
		tv.setText("Time Over..!!\n The number is "
				+ getIntent().getIntExtra("a", -1));
		ourSong.start();
		final int k = getIntent().getIntExtra("b", -1);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent menu;
				if (k == 1) {
					menu = new Intent("anky.dj.iitkgp.LEVELONE");
				} else if (k == 2) {
					menu = new Intent("anky.dj.iitkgp.LEVELTWO");
				} else if (k == 3) {
					menu = new Intent("anky.dj.iitkgp.LEVELTHREE");
				} else {
					menu = new Intent("anky.dj.iitkgp.MENU");
				}
				startActivity(menu);

			}

		});
	}

	@Override
	protected void onPause() {
		super.onPause();
		ourSong.release();
		finish();

	}
}