package anky.dj.iitkgp;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Help extends Activity {
	TextView tv, tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		tv = (TextView) findViewById(R.id.tvscrol);
		tv1 = (TextView) findViewById(R.id.tvscrol1);
		tv2 = (TextView) findViewById(R.id.tvscrol2);
		tv.setText("Welcome to 'What's The Number' !!!\n\n* The goal of this game is to break the code !\n\n* Use deductive reasoning skills to find out the right code.\n\n* Depending upon the difficulty,there are two modes of gameplay: NORMAL and CHALLENGING\n\n* In Normal mode you can practise for the real challenge and hone your skills.\n\n* In Challenging mode,you have 3 campaigns : Beginner ; Intermediate and Expert.This is the brutal game setup where the difficulty level rises up.\n\n*Here the use of timer in accordance with the number of attempts is vital for achieving some high scores in the game.\n\nFor each campaign i.e,\n\nBeginner   =  45 seconds  (No. of attempts = 5)\n\nIntermediate   =  2.5 minutes  (No. of attempts = 10)\n\nExpert   =  5 minutes  (No. of attempts = 15)\n\nBreak the code in as few attempts with less time and progress to next level.\n\nCompete with friends for achieving high scores.\n\n* Instructions / Hints / Suggestions *\n\n* As soon as you start playing any level the computer chooses a random number according to the level choosed by you.Your aim is to guess that random number with the hints given in some pattern and color combination.\n\n* For Example - "
				+ "If you wishes to play Beginner level,the computer chooses a 3 digit random number ranging from 000 to 999.\n\n* At first you have to make a random guess and with that guess the real action starts as you will get hints which will help you to break the code, but it will only be possible if you give proper attention to hints as these are the only things that can help you to conquer the milestone.\n\n The hints will be in the form of * * * with different color combinations and each color having it's own importance.\n\n There are 3 colors namely : Red , Blue , Green\n\n ~ 1 Green * indicates that one of the digits in random number is in the number entered by you and is at the correct place.\n\n~ 1 Blue * indicates that one of the digits in random number is in the number entered by you but is at the wrong place.\n\n~ 1 Red * indicates that one of the digit in the random number is not in the number entered by you. ");
		tv1.setText("\n* The one thing to notice here is that the 3 asterisk in the beginner level (4 in Intermediate and 5 in Expert) do not correspond to the same digit as they are alligned.They are also jumbled everytime you make a guess.\n\n");
		tv2.setText("BREAK THE CODE AND BE THE BEST CODE BREAKER...\n\nENJOY !");
	}

}
