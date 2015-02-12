package anky.dj.iitkgp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;

import java.math.*;
import java.util.Random;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.format.Time;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;

public class P1 extends Activity {
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, r, s, t;
	TextView tvh[] = new TextView[41];
	NumberPicker np1, np2, np3;
	Button b1;
	int random;
	int x = 0, y = 0, z = 0, x1, x2, x3, a, b, count = 0, i = 1, result = 0,
			counter = 0;
	String dom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.p1);

		tv1 = (TextView) findViewById(R.id.textView2);
		tv2 = (TextView) findViewById(R.id.textView1);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv5 = (TextView) findViewById(R.id.textView5);
		np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		np3 = (NumberPicker) findViewById(R.id.numberPicker3);
		np3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		b1 = (Button) findViewById(R.id.button1);
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
		display();
	}

	private void display() {
		// TODO Auto-generated method stub
		np1.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(newVal));
				x = Integer.parseInt(tv1.getText().toString());
			}

		});
		np2.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv2.setText(String.valueOf(newVal));
				y = Integer.parseInt(tv2.getText().toString());

			}

		});
		np3.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {
				// TODO Auto-generated method stub
				tv3.setText(String.valueOf(newVal));
				z = Integer.parseInt(tv3.getText().toString());
			}

		});
		np1.setMaxValue(9);
		np1.setMinValue(0);
		np2.setMaxValue(9);
		np2.setMinValue(0);
		np3.setMaxValue(9);
		np3.setMinValue(0);
		x1 = (int) ((Math.random()) * 9 * 100);
		x2 = (int) ((Math.random()) * 9 * 10);
		x3 = (int) ((Math.random()) * 9);

		a = x1 / 100;
		b = x2 / 10;
		i = 1;

		b1.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;

				count++;
				random = (int) (Math.random() * 5);
				if (count == 10)
					tvh[i].setText(" "+(count) + ".            " + y + "" + x + ""
							+ z);
				else
					tvh[i].setText(" "+(count) + ".              " + y + "" + x
							+ "" + z);
				tvh[i + 1].setText("*");
				tvh[i + 2].setText("*");
				tvh[i + 3].setText("*");
				tvh[i + 1].setTextColor(Color.RED);
				tvh[i + 2].setTextColor(Color.RED);
				tvh[i + 3].setTextColor(Color.RED);

				if (random == 0) {
					r = tvh[i + 1];
					s = tvh[i + 2];
					t = tvh[i + 3];
				} else if (random == 1) {
					r = tvh[i + 1];
					s = tvh[i + 3];
					t = tvh[i + 2];
				} else if (random == 2) {
					r = tvh[i + 2];
					s = tvh[i + 1];
					t = tvh[i + 3];
				} else if (random == 3) {
					r = tvh[i + 2];
					s = tvh[i + 3];
					t = tvh[i + 1];
				} else if (random == 4) {
					r = tvh[i + 3];
					s = tvh[i + 1];
					t = tvh[i + 2];
				} else if (random == 5) {
					r = tvh[i + 3];
					s = tvh[i + 2];
					t = tvh[i + 1];
				}
				int userinput[] = { y, x, z };
				int ran[] = { a, b, x3 };
				int iii, j, n = 0;
				int c[] = new int[3];
				int k[][] = new int[3][3];
				for (iii = 0, j = 0; iii < 3; iii++) {
					if (userinput[iii] == ran[j]) {
						c[j]++;
						k[j][n] = iii + 1;
						n++;
					}
					if (iii == 2 && j < 2) {
						iii = -1;
						j++;
						n = 0;
					}
				}

				int c1 = 0, c2 = 0, c3 = 0;
				for (j = 0; j < 3; j++) {
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
					if (k[0][0] != 0 && c1 == 0) {

						r.setTextColor(Color.BLUE);
					}
					if (k[1][0] != 0 && c2 == 0) {

						s.setTextColor(Color.BLUE);
					}
					if (k[2][0] != 0 && c3 == 0) {

						t.setTextColor(Color.BLUE);
					}

				}
				i = i + 4;

				tv4.setText("No. of Attempts = " + count);
				result = 6 - count;
				if (c1 == 1 && c2 == 1 && c3 == 1) {

					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							P1.this);
					builder1.setMessage("Your Score Is  " + result + "/" + "5");
					builder1.setCancelable(true);
					builder1.setPositiveButton("Try Next Level",
							new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.P2");
									startActivity(menu);
								}
							});
					builder1.setNegativeButton("Try Challenging Mode",
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
											"anky.dj.iitkgp.P1");
									startActivity(menu);
								}
							});

					AlertDialog alert11 = builder1.create();
					alert11.show();
					builder1.setCancelable(false);
					b1.setEnabled(false);

				}
				if (count == 5 && (c1 != 1 || c2 != 1 || c3 != 1)) {

					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							P1.this);
					builder1.setMessage("oops!!!! U couldn't break the code"
							+ "\n" + "The code was : " + a + "" + b + "" + x3);
					builder1.setCancelable(true);
					builder1.setPositiveButton("Try Again",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// dialog.cancel();
									Intent menu = new Intent(
											"anky.dj.iitkgp.P1");
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
			Intent menu = new Intent("anky.dj.iitkgp.PRACTISE");
			startActivity(menu);
		}
		if (keyCode == KeyEvent.KEYCODE_HOME) {
			// The Code Want to Perform.
			Intent menu = new Intent("anky.dj.iitkgp.LEVELTHREE");
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
		// TODO Auto-generated method stub

		super.onPause();

		finish();
	}
}
