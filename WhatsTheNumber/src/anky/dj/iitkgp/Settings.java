package anky.dj.iitkgp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class Settings extends Activity {

	SeekBar sb;
	AudioManager am;
	String name;
	private String[] state1 = new String[4];
	private String[] state2 = new String[4];
	private String[] state3 = new String[4];
	Spinner sp1, sp2, sp3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		Button b = (Button) findViewById(R.id.button1);
		sb = (SeekBar) findViewById(R.id.seekBar1);
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
		sb.setMax(am.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
		sb.setProgress(am.getStreamVolume(AudioManager.STREAM_MUSIC));
		sp1 = (Spinner) findViewById(R.id.spinner1);
		sp2 = (Spinner) findViewById(R.id.spinner2);
		sp3 = (Spinner) findViewById(R.id.spinner3);
		final SharedPreferences settings = getSharedPreferences("score", 0);

		String name11 = settings.getString("name11", "");
		String name12 = settings.getString("name12", "");
		String name13 = settings.getString("name13", "");

		String name21 = settings.getString("name21", "");
		String name22 = settings.getString("name22", "");
		String name23 = settings.getString("name23", "");

		String name31 = settings.getString("name31", "");
		String name32 = settings.getString("name32", "");
		String name33 = settings.getString("name33", "");

		int score11 = settings.getInt("score11", 0);
		int score12 = settings.getInt("score12", 0);
		int score13 = settings.getInt("score13", 0);

		int score21 = settings.getInt("score21", 0);
		int score22 = settings.getInt("score22", 0);
		int score23 = settings.getInt("score23", 0);

		int score31 = settings.getInt("score31", 0);
		int score32 = settings.getInt("score32", 0);
		int score33 = settings.getInt("score33", 0);

		float time11 = settings.getFloat("time11", 0);
		float time12 = settings.getFloat("time12", 0);
		float time13 = settings.getFloat("time13", 0);

		float time21 = settings.getFloat("time21", 0);
		float time22 = settings.getFloat("time22", 0);
		float time23 = settings.getFloat("time23", 0);

		float time31 = settings.getFloat("time31", 0);
		float time32 = settings.getFloat("time32", 0);
		float time33 = settings.getFloat("time33", 0);

		state1[0] = "Level One";
		state1[1] = name11 + " , " + score11 + "/5 , " + time11 + " sec";
		state1[2] = name12 + " , " + score12 + "/5 , " + time12 + " sec";
		state1[3] = name13 + " , " + score13 + "/5 , " + time13 + " sec";

		state2[0] = "Level Two";
		state2[1] = name21 + " , " + score21 + "/10 , " + time21 + " sec";
		state2[2] = name22 + " , " + score22 + "/10 , " + time22 + " sec";
		state2[3] = name23 + " , " + score23 + "/10 , " + time23 + " sec";

		state3[0] = "Level Three";
		state3[1] = name31 + " , " + score31 + "/15 , " + time31 + " sec";
		state3[2] = name32 + " , " + score32 + "/15 , " + time32 + " sec";
		state3[3] = name33 + " , " + score33 + "/15 , " + time33 + " sec";

		/*
		 * tv.setText(name1 + " - " + score1 + " - " + time1 + " sec");
		 * tv1.setText(name2 + " - " + score2 + " - " + time2 + " sec");
		 * tv2.setText(name3 + " - " + score3 + " - " + time3 + " sec");
		 */

		ArrayAdapter<String> adapter_state1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, state1);
		adapter_state1
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp1.setAdapter(adapter_state1);

		sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}

		});

		ArrayAdapter<String> adapter_state2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, state2);
		adapter_state2
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp2.setAdapter(adapter_state2);

		sp2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}

		});

		ArrayAdapter<String> adapter_state3 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, state3);
		adapter_state3
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp3.setAdapter(adapter_state3);

		sp3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}

		});
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

				inputManager.hideSoftInputFromWindow(getCurrentFocus()
						.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
				EditText et = (EditText) findViewById(R.id.editText1);
				name = "" + et.getText().toString();
				Toast.makeText(Settings.this, "Name Saved..!!",
						Toast.LENGTH_LONG).show();
				SharedPreferences.Editor editor = settings.edit();
				editor.putString("nametemp", name);
				editor.commit();
				et.setFocusable(false);
			}

		});

		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				am.setStreamVolume(AudioManager.STREAM_MUSIC, arg1, 0);

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

		});

	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
