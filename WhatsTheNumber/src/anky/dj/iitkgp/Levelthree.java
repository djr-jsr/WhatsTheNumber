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

public class Levelthree extends Activity {
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv100, r, s, t, u, q;
	TextView tvh[] = new TextView[121];
	NumberPicker np1, np2, np3, np4, np5;
	Button b1;
	int random;
	int x = 0, y = 0, z = 0, w = 0, p, x1, x2, x3, a, b, count = 0, i = 1,
			result = 0, x0, xx, c, d, x4, e, repeat = 0;

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

		setContentView(R.layout.levelthree);

		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv5 = (TextView) findViewById(R.id.textView5);
		tv6 = (TextView) findViewById(R.id.textView6);
		tv100 = (TextView) findViewById(R.id.textView200);
		np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np3 = (NumberPicker) findViewById(R.id.numberPicker3);
		np3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np4 = (NumberPicker) findViewById(R.id.numberPicker4);
		np4.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np5 = (NumberPicker) findViewById(R.id.numberPicker5);
		np5.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
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
		tvh[i++] = (TextView) findViewById(R.id.textView60);
		tvh[i++] = (TextView) findViewById(R.id.textView61);
		tvh[i++] = (TextView) findViewById(R.id.textView62);
		tvh[i++] = (TextView) findViewById(R.id.textView63);
		tvh[i++] = (TextView) findViewById(R.id.textView64);
		tvh[i++] = (TextView) findViewById(R.id.textView65);
		tvh[i++] = (TextView) findViewById(R.id.textView66);
		tvh[i++] = (TextView) findViewById(R.id.textView67);
		tvh[i++] = (TextView) findViewById(R.id.textView68);
		tvh[i++] = (TextView) findViewById(R.id.textView69);
		tvh[i++] = (TextView) findViewById(R.id.textView70);
		tvh[i++] = (TextView) findViewById(R.id.textView71);
		tvh[i++] = (TextView) findViewById(R.id.textView72);
		tvh[i++] = (TextView) findViewById(R.id.textView73);
		tvh[i++] = (TextView) findViewById(R.id.textView74);
		tvh[i++] = (TextView) findViewById(R.id.textView75);
		tvh[i++] = (TextView) findViewById(R.id.textView76);
		tvh[i++] = (TextView) findViewById(R.id.textView77);
		tvh[i++] = (TextView) findViewById(R.id.textView78);
		tvh[i++] = (TextView) findViewById(R.id.textView79);
		tvh[i++] = (TextView) findViewById(R.id.textView80);
		tvh[i++] = (TextView) findViewById(R.id.textView81);
		tvh[i++] = (TextView) findViewById(R.id.textView82);
		tvh[i++] = (TextView) findViewById(R.id.textView83);
		tvh[i++] = (TextView) findViewById(R.id.textView84);
		tvh[i++] = (TextView) findViewById(R.id.textView85);
		tvh[i++] = (TextView) findViewById(R.id.textView86);
		tvh[i++] = (TextView) findViewById(R.id.textView87);
		tvh[i++] = (TextView) findViewById(R.id.textView88);
		tvh[i++] = (TextView) findViewById(R.id.textView89);
		tvh[i++] = (TextView) findViewById(R.id.textView90);
		tvh[i++] = (TextView) findViewById(R.id.textView91);
		tvh[i++] = (TextView) findViewById(R.id.textView92);
		tvh[i++] = (TextView) findViewById(R.id.textView93);
		tvh[i++] = (TextView) findViewById(R.id.textView94);
		tvh[i++] = (TextView) findViewById(R.id.textView95);
		tvh[i++] = (TextView) findViewById(R.id.textView96);
		tvh[i++] = (TextView) findViewById(R.id.textView97);
		tvh[i++] = (TextView) findViewById(R.id.textView98);
		tvh[i++] = (TextView) findViewById(R.id.textView99);
		tvh[i++] = (TextView) findViewById(R.id.textView100);
		tvh[i++] = (TextView) findViewById(R.id.textView101);
		tvh[i++] = (TextView) findViewById(R.id.textView102);
		tvh[i++] = (TextView) findViewById(R.id.textView103);
		tvh[i++] = (TextView) findViewById(R.id.textView104);
		tvh[i++] = (TextView) findViewById(R.id.textView105);
		tvh[i++] = (TextView) findViewById(R.id.textView106);
		tvh[i++] = (TextView) findViewById(R.id.textView107);
		tvh[i++] = (TextView) findViewById(R.id.textView108);
		tvh[i++] = (TextView) findViewById(R.id.textView109);
		tvh[i++] = (TextView) findViewById(R.id.textView110);
		tvh[i++] = (TextView) findViewById(R.id.textView111);
		tvh[i++] = (TextView) findViewById(R.id.textView112);
		tvh[i++] = (TextView) findViewById(R.id.textView113);
		tvh[i++] = (TextView) findViewById(R.id.textView114);
		tvh[i++] = (TextView) findViewById(R.id.textView115);
		tvh[i++] = (TextView) findViewById(R.id.textView116);
		tvh[i++] = (TextView) findViewById(R.id.textView117);
		tvh[i++] = (TextView) findViewById(R.id.textView118);
		tvh[i++] = (TextView) findViewById(R.id.textView119);
		tvh[i++] = (TextView) findViewById(R.id.textView120);
		tvh[i++] = (TextView) findViewById(R.id.textView121);
		tvh[i++] = (TextView) findViewById(R.id.textView122);
		tvh[i++] = (TextView) findViewById(R.id.textView123);
		tvh[i++] = (TextView) findViewById(R.id.textView124);
		tvh[i++] = (TextView) findViewById(R.id.textView125);
		tvh[i++] = (TextView) findViewById(R.id.textView126);
		tvh[i++] = (TextView) findViewById(R.id.textView127);
		tvh[i++] = (TextView) findViewById(R.id.textView128);
		tvh[i++] = (TextView) findViewById(R.id.textView129);
		stop = new Thread() {
			public void run() {
				try {
					sleep(301000);
					chrono.stop();
					Intent menu = new Intent("anky.dj.iitkgp.FUNNY");
					menu.putExtra("a",
							(a * 10000 + b * 1000 + c * 100 + d * 10 + e));
					menu.putExtra("b", 3);
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
		np5.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv100.setText(String.valueOf(newVal));
				p = Integer.parseInt(tv100.getText().toString());

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
		np5.setMaxValue(9);
		np5.setMinValue(0);
		x4 = (int) ((Math.random()) * 9 * 10000);
		x0 = (int) ((Math.random()) * 9 * 1000);
		x1 = (int) ((Math.random()) * 9 * 100);
		x2 = (int) ((Math.random()) * 9 * 10);
		x3 = (int) ((Math.random()) * 9);

		a = x4 / 10000;
		b = x0 / 1000;
		c = x1 / 100;
		d = x2 / 10;
		e = x3;
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
				if (count >= 10)
					tvh[i].setText(" "+(count) + ".            " + w + "" + x + ""
							+ p + "" + y + "" + z);
				else
					tvh[i].setText(" "+(count) + ".              " + w + "" + x
							+ "" + p + "" + y + "" + z);
				tvh[i + 1].setText("*");
				tvh[i + 2].setText("*");
				tvh[i + 3].setText("*");
				tvh[i + 4].setText("*");
				tvh[i + 5].setText("*");
				tvh[i + 1].setTextColor(Color.RED);
				tvh[i + 2].setTextColor(Color.RED);
				tvh[i + 3].setTextColor(Color.RED);
				tvh[i + 4].setTextColor(Color.RED);
				tvh[i + 5].setTextColor(Color.RED);

				if (random == 0) {
					r = tvh[i + 1];
					s = tvh[i + 2];
					t = tvh[i + 3];
					u = tvh[i + 4];
					q = tvh[i + 5];
				} else if (random == 1) {
					q = tvh[i + 1];
					s = tvh[i + 4];
					t = tvh[i + 2];
					u = tvh[i + 3];
					r = tvh[i + 5];
				} else if (random == 2) {
					r = tvh[i + 1];
					q = tvh[i + 3];
					t = tvh[i + 4];
					u = tvh[i + 2];
					s = tvh[i + 5];
				} else if (random == 3) {
					r = tvh[i + 2];
					s = tvh[i + 3];
					q = tvh[i + 1];
					u = tvh[i + 4];
					t = tvh[i + 5];
				} else if (random == 4) {
					r = tvh[i + 2];
					s = tvh[i + 4];
					t = tvh[i + 3];
					q = tvh[i + 1];
					u = tvh[i + 5];
				} else if (random == 5) {
					q = tvh[i + 2];
					s = tvh[i + 1];
					t = tvh[i + 4];
					u = tvh[i + 3];
					r = tvh[i + 5];
				} else if (random == 6) {
					r = tvh[i + 3];
					q = tvh[i + 4];
					t = tvh[i + 2];
					u = tvh[i + 1];
					s = tvh[i + 5];
				} else if (random == 7) {
					r = tvh[i + 3];
					s = tvh[i + 1];
					q = tvh[i + 4];
					u = tvh[i + 2];
					t = tvh[i + 5];
				} else if (random == 8) {
					r = tvh[i + 3];
					s = tvh[i + 2];
					t = tvh[i + 1];
					q = tvh[i + 4];
					u = tvh[i + 5];
				} else if (random == 9) {
					q = tvh[i + 4];
					s = tvh[i + 2];
					t = tvh[i + 1];
					u = tvh[i + 3];
					r = tvh[i + 5];
				} else if (random == 10) {
					r = tvh[i + 4];
					q = tvh[i + 1];
					t = tvh[i + 3];
					u = tvh[i + 2];
					s = tvh[i + 5];
				} else if (random == 11) {
					r = tvh[i + 4];
					s = tvh[i + 3];
					q = tvh[i + 2];
					u = tvh[i + 1];
					t = tvh[i + 5];
				}
				int userinput[] = { w, x, p, y, z };
				int ran[] = { a, b, c, d, e };
				int iii, j, n = 0;
				int cc[] = new int[5];
				int k[][] = new int[5][5];
				for (iii = 0, j = 0; iii < 5; iii++) {
					if (userinput[iii] == ran[j]) {
						cc[j]++;
						k[j][n] = iii + 1;
						n++;
					}
					if (iii == 4 && j < 4) {
						iii = -1;
						j++;
						n = 0;
					}
				}

				int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
				for (j = 0; j < 5; j++) {
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
					if (k[4][j] == 5) {
						q.setTextColor(Color.GREEN);

						c5 = 1;
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
					if (k[4][0] != 0 && c5 == 0) {

						q.setTextColor(Color.BLUE);
					}

				}
				i = i + 6;

				tv4.setText("No. of Attempts = " + count);
				result = 16 - count;
				if (c1 == 1 && c2 == 1 && c3 == 1 && c4 == 1 && c5 == 1) {
					stop.interrupt();
					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							Levelthree.this);
					builder1.setMessage("Your Score Is  " + result + "/" + "15");
					builder1.setCancelable(true);
					showElapsedTime();
					builder1.setPositiveButton("",
							new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.MENU");
									startActivity(menu);
								}
							});
					
					builder1.setNeutralButton("Try Again",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.LEVELTHREE");
									startActivity(menu);
								}
							});

					AlertDialog alert11 = builder1.create();
					alert11.show();
					builder1.setCancelable(false);
					b1.setEnabled(false);

				}
				if (count == 15
						&& (c1 != 1 || c2 != 1 || c3 != 1 || c4 != 1 || c5 != 1)) {
					stop.interrupt();
					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							Levelthree.this);
					builder1.setMessage("oops!!!! U couldn't break the code"
							+ "\n" + "The code was : " + a + "" + b + "" + c
							+ "" + d + "" + e);
					builder1.setCancelable(true);
					builder1.setPositiveButton("Try Again",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.LEVELTHREE");
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
		this.onResume();
	}

	private void showElapsedTime() {
		long elapsedMillis = SystemClock.elapsedRealtime() - chrono.getBase()
				- 1000;
		Toast.makeText(Levelthree.this,
				"Elapsed milliseconds: " + elapsedMillis, Toast.LENGTH_LONG)
				.show();
		SharedPreferences settings = getSharedPreferences("score", 0);
		SharedPreferences.Editor editor = settings.edit();
		int score = settings.getInt("score31", 0);
		int score1 = settings.getInt("score32", 0);
		int score2 = settings.getInt("score33", 0);

		String name31 = settings.getString("name31", "");
		String name32 = settings.getString("name32", "");
		String name33 = settings.getString("name33", "");

		float time31 = settings.getFloat("time31", 0);
		float time32 = settings.getFloat("time32", 0);
		float time33 = settings.getFloat("time33", 0);

		if ((16 - count) >= score) {
			editor.putFloat("time31", elapsedMillis / 1000);
			editor.putString("name31", settings.getString("nametemp", ""));
			editor.putInt("score31", (16 - count));
			editor.putFloat("time32", time31);
			editor.putString("name32", name31);
			editor.putInt("score32", score);
			editor.putFloat("time33", time32);
			editor.putString("name33", name32);
			editor.putInt("score33", score1);
		} else if ((16 - count) >= score1 && (16 - count) < score) {
			editor.putFloat("time32", elapsedMillis / 1000);
			editor.putString("name32", settings.getString("nametemp", ""));
			editor.putInt("score32", (16 - count));
			editor.putFloat("time33", time32);
			editor.putString("name33", name32);
			editor.putInt("score33", score1);
		} else if ((16 - count) >= score2 && (16 - count) < score1) {
			editor.putFloat("time33", elapsedMillis / 1000);
			editor.putString("name33", settings.getString("nametemp", ""));
			editor.putInt("score33", (16 - count));
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
