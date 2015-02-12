package anky.dj.iitkgp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;

import java.math.*;
import java.util.Random;

import anky.dj.iitkgp.R.id;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.format.Time;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.NumberPicker;
import android.widget.Toast;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;

public class Leveltwo extends Activity {
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, r, s, t, u;
	TextView tvh[] = new TextView[51];
	NumberPicker np1, np2, np3, np4;
	Button b1;
	int random;
	int x = 0, y = 0, z = 0, w = 0, x1, x2, x3, a, b, count = 0, i = 1,
			result = 0, x0, xx, c, d;
	String dom;
	Chronometer chrono;
	Time time1 = new Time();
	Time time2 = new Time();
	Thread stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.leveltwo);

		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv5 = (TextView) findViewById(R.id.textView5);
		tv6 = (TextView) findViewById(R.id.textView6);
		np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np3 = (NumberPicker) findViewById(R.id.numberPicker3);
		np3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np4 = (NumberPicker) findViewById(R.id.numberPicker4);
		np4.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		b1 = (Button) findViewById(R.id.button1);
		chrono = (Chronometer) findViewById(R.id.chronometer1);
		tvh[i++] = (TextView) findViewById(R.id.textView10);
		tvh[i++] = (TextView) findViewById(R.id.textView11);
		tvh[i++] = (TextView) findViewById(R.id.textView12);
		tvh[i++] = (TextView) findViewById(R.id.textView13);
		tvh[i++] = (TextView) findViewById(R.id.textView14);
		tvh[i++] = (TextView) findViewById(R.id.textView15);
		tvh[i++] = (TextView) findViewById(R.id.textView16);
		tvh[i++] = (TextView) findViewById(R.id.textView17);
		tvh[i++] = (TextView) findViewById(R.id.textView18);
		tvh[i++] = (TextView) findViewById(R.id.textView19);
		tvh[i++] = (TextView) findViewById(R.id.textView20);
		tvh[i++] = (TextView) findViewById(R.id.textView21);
		tvh[i++] = (TextView) findViewById(R.id.textView22);
		tvh[i++] = (TextView) findViewById(R.id.textView23);
		tvh[i++] = (TextView) findViewById(R.id.textView24);
		tvh[i++] = (TextView) findViewById(R.id.textView25);
		tvh[i++] = (TextView) findViewById(R.id.textView26);
		tvh[i++] = (TextView) findViewById(R.id.textView27);
		tvh[i++] = (TextView) findViewById(R.id.textView28);
		tvh[i++] = (TextView) findViewById(R.id.textView29);
		tvh[i++] = (TextView) findViewById(R.id.textView30);
		tvh[i++] = (TextView) findViewById(R.id.textView31);
		tvh[i++] = (TextView) findViewById(R.id.textView32);
		tvh[i++] = (TextView) findViewById(R.id.textView33);
		tvh[i++] = (TextView) findViewById(R.id.textView34);
		tvh[i++] = (TextView) findViewById(R.id.textView35);
		tvh[i++] = (TextView) findViewById(R.id.textView36);
		tvh[i++] = (TextView) findViewById(R.id.textView37);
		tvh[i++] = (TextView) findViewById(R.id.textView38);
		tvh[i++] = (TextView) findViewById(R.id.textView39);
		tvh[i++] = (TextView) findViewById(R.id.textView40);
		tvh[i++] = (TextView) findViewById(R.id.textView41);
		tvh[i++] = (TextView) findViewById(R.id.textView42);
		tvh[i++] = (TextView) findViewById(R.id.textView43);
		tvh[i++] = (TextView) findViewById(R.id.textView44);
		tvh[i++] = (TextView) findViewById(R.id.textView45);
		tvh[i++] = (TextView) findViewById(R.id.textView46);
		tvh[i++] = (TextView) findViewById(R.id.textView47);
		tvh[i++] = (TextView) findViewById(R.id.textView48);
		tvh[i++] = (TextView) findViewById(R.id.textView49);
		tvh[i++] = (TextView) findViewById(R.id.textView50);
		tvh[i++] = (TextView) findViewById(R.id.textView51);
		tvh[i++] = (TextView) findViewById(R.id.textView52);
		tvh[i++] = (TextView) findViewById(R.id.textView53);
		tvh[i++] = (TextView) findViewById(R.id.textView54);
		tvh[i++] = (TextView) findViewById(R.id.textView55);
		tvh[i++] = (TextView) findViewById(R.id.textView56);
		tvh[i++] = (TextView) findViewById(R.id.textView57);
		tvh[i++] = (TextView) findViewById(R.id.textView58);
		tvh[i++] = (TextView) findViewById(R.id.textView59);

		stop = new Thread() {
			public void run() {
				try {
					sleep(151000);
					chrono.stop();
					Intent menu = new Intent("anky.dj.iitkgp.FUNNY");
					menu.putExtra("a", (a * 1000 + b * 100 + c * 10 + d));
					menu.putExtra("b", 2);
					startActivity(menu);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					chrono.stop();

				}
			}

		};

		display();
	}

	private void display() {
		// TODO Auto-generated method stub
		np1.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv3.setText(String.valueOf(newVal));
				w = Integer.parseInt(tv3.getText().toString());
			}

		});
		np2.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(newVal));
				z = Integer.parseInt(tv1.getText().toString());

			}

		});
		np3.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv6.setText(String.valueOf(newVal));
				x = Integer.parseInt(tv6.getText().toString());
			}

		});
		np4.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv2.setText(String.valueOf(newVal));
				y = Integer.parseInt(tv2.getText().toString());
			}

		});
		np1.setMaxValue(9);
		np1.setMinValue(0);
		np2.setMaxValue(9);
		np2.setMinValue(0);
		np3.setMaxValue(9);
		np3.setMinValue(0);
		np4.setMaxValue(9);
		np4.setMinValue(0);
		x0 = (int) ((Math.random()) * 9 * 1000);
		x1 = (int) ((Math.random()) * 9 * 100);
		x2 = (int) ((Math.random()) * 9 * 10);
		x3 = (int) ((Math.random()) * 9);

		a = x0 / 1000;
		b = x1 / 100;
		c = x2 / 10;
		d = x3;
		i = 1;

		b1.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (count == 0) {
					chrono.setBase(SystemClock.elapsedRealtime());
					chrono.start();
					stop.start();
				}
				count++;
				random = (int) (Math.random() * 11);
				if (count == 10)
					tvh[i].setText(" "+(count) + ".            " + w + "" + x + ""
							+ y + "" + z);
				else
					tvh[i].setText(" "+(count) + ".              " + w + "" + x
							+ "" + y + "" + z);
				tvh[i + 1].setText("*");
				tvh[i + 2].setText("*");
				tvh[i + 3].setText("*");
				tvh[i + 4].setText("*");
				tvh[i + 1].setTextColor(Color.RED);
				tvh[i + 2].setTextColor(Color.RED);
				tvh[i + 3].setTextColor(Color.RED);
				tvh[i + 4].setTextColor(Color.RED);

				if (random == 0) {
					r = tvh[i + 1];
					s = tvh[i + 2];
					t = tvh[i + 3];
					u = tvh[i + 4];
				} else if (random == 1) {
					r = tvh[i + 1];
					s = tvh[i + 4];
					t = tvh[i + 2];
					u = tvh[i + 3];
				} else if (random == 2) {
					r = tvh[i + 1];
					s = tvh[i + 3];
					t = tvh[i + 4];
					u = tvh[i + 2];
				} else if (random == 3) {
					r = tvh[i + 2];
					s = tvh[i + 3];
					t = tvh[i + 1];
					u = tvh[i + 4];
				} else if (random == 4) {
					r = tvh[i + 2];
					s = tvh[i + 4];
					t = tvh[i + 3];
					u = tvh[i + 1];
				} else if (random == 5) {
					r = tvh[i + 2];
					s = tvh[i + 1];
					t = tvh[i + 4];
					u = tvh[i + 3];
				} else if (random == 6) {
					r = tvh[i + 3];
					s = tvh[i + 4];
					t = tvh[i + 2];
					u = tvh[i + 1];
				} else if (random == 7) {
					r = tvh[i + 3];
					s = tvh[i + 1];
					t = tvh[i + 4];
					u = tvh[i + 2];
				} else if (random == 8) {
					r = tvh[i + 3];
					s = tvh[i + 2];
					t = tvh[i + 1];
					u = tvh[i + 4];
				} else if (random == 9) {
					r = tvh[i + 4];
					s = tvh[i + 2];
					t = tvh[i + 1];
					u = tvh[i + 3];
				} else if (random == 10) {
					r = tvh[i + 4];
					s = tvh[i + 1];
					t = tvh[i + 3];
					u = tvh[i + 2];
				} else if (random == 11) {
					r = tvh[i + 4];
					s = tvh[i + 3];
					t = tvh[i + 2];
					u = tvh[i + 1];
				}
				int userinput[] = { w, x, y, z };
				int ran[] = { a, b, c, d };
				int iii, j, n = 0;
				int cc[] = new int[4];
				int k[][] = new int[4][4];
				for (iii = 0, j = 0; iii < 4; iii++) {
					if (userinput[iii] == ran[j]) {
						cc[j]++;
						k[j][n] = iii + 1;
						n++;
					}
					if (iii == 3 && j < 3) {
						iii = -1;
						j++;
						n = 0;
					}
				}

				int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
				for (j = 0; j < 4; j++) {
					if (k[0][j] == 1) {
						r.setTextColor(Color.GREEN);

						c1 = 1;
					}
					if (k[1][j] == 2) {
						s.setTextColor(Color.GREEN);

						c2 = 1;
					}
					if (k[2][j] == 3) {
						t.setTextColor(Color.GREEN);

						c3 = 1;
					}
					if (k[3][j] == 4) {
						u.setTextColor(Color.GREEN);

						c4 = 1;
					}

					if (k[0][0] != 0 && c1 == 0) {

						r.setTextColor(Color.BLUE);
					}
					if (k[1][0] != 0 && c2 == 0) {

						s.setTextColor(Color.BLUE);
					}
					if (k[2][0] != 0 && c3 == 0) {

						t.setTextColor(Color.BLUE);
					}
					if (k[3][0] != 0 && c4 == 0) {

						u.setTextColor(Color.BLUE);
					}

				}
				i = i + 5;

				tv4.setText("No. of Attempts = " + count);
				result = 11 - count;
				if (c1 == 1 && c2 == 1 && c3 == 1 && c4 == 1) {
					stop.interrupt();
					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							Leveltwo.this);
					builder1.setMessage("Your Score Is  " + result + "/" + "10");
					builder1.setCancelable(true);
					showElapsedTime();
					builder1.setPositiveButton("Try Next Level",
							new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.LEVELTHREE");
									startActivity(menu);
								}
							});
					
					builder1.setNeutralButton("Try Again",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.LEVELTWO");
									startActivity(menu);
								}
							});

					AlertDialog alert11 = builder1.create();
					alert11.show();
					builder1.setCancelable(false);
					b1.setEnabled(false);

				}
				if (count == 10 && (c1 != 1 || c2 != 1 || c3 != 1 || c4 != 1)) {
					stop.interrupt();
					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							Leveltwo.this);
					builder1.setMessage("oops!!!! U couldn't break the code"
							+ "\n" + "The code was : " + a + "" + b + "" + c
							+ "" + d);
					builder1.setCancelable(true);
					builder1.setPositiveButton("Try Again",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.LEVELTWO");
									startActivity(menu);
								}
							});
					

					AlertDialog alert11 = builder1.create();
					alert11.show();
					builder1.setCancelable(false);
					b1.setEnabled(false);

				}

			}

		});

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// replaces the default 'Back' button action
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			stop.interrupt();
			Intent menu = new Intent("anky.dj.iitkgp.MENU");
			startActivity(menu);
		}
		return true;
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Intent menu = new Intent("anky.dj.iitkgp.MENU");
		startActivity(menu);
	}

	private void showElapsedTime() {
		long elapsedMillis = SystemClock.elapsedRealtime() - chrono.getBase()
				- 1000;
		Toast.makeText(Leveltwo.this, "Elapsed milliseconds: " + elapsedMillis,
				Toast.LENGTH_LONG).show();
		SharedPreferences settings = getSharedPreferences("score", 0);
		SharedPreferences.Editor editor = settings.edit();
		int score = settings.getInt("score21", 0);
		int score1 = settings.getInt("score22", 0);
		int score2 = settings.getInt("score23", 0);

		String name21 = settings.getString("name21", "");
		String name22 = settings.getString("name22", "");
		String name23 = settings.getString("name23", "");

		float time21 = settings.getFloat("time21", 0);
		float time22 = settings.getFloat("time22", 0);
		float time23 = settings.getFloat("time23", 0);

		if ((11 - count) >= score) {
			editor.putFloat("time21", elapsedMillis / 1000);
			editor.putString("name21", settings.getString("nametemp", ""));
			editor.putInt("score21", (11 - count));
			editor.putFloat("time22", time21);
			editor.putString("name22", name21);
			editor.putInt("score22", score);
			editor.putFloat("time23", time22);
			editor.putString("name23", name22);
			editor.putInt("score23", score1);
		} else if ((11 - count) >= score1 && (11 - count) < score) {
			editor.putFloat("time22", elapsedMillis / 1000);
			editor.putString("name22", settings.getString("nametemp", ""));
			editor.putInt("score22", (11 - count));
			editor.putFloat("time23", time22);
			editor.putString("name23", name22);
			editor.putInt("score23", score1);
		} else if ((11 - count) >= score2 && (11 - count) < score1) {
			editor.putFloat("time23", elapsedMillis / 1000);
			editor.putString("name23", settings.getString("nametemp", ""));
			editor.putInt("score23", (11 - count));
		}
		editor.commit();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		stop.interrupt();
		super.onPause();
		finish();
	}
}