package net.greenrivertech.hliu.tsarandomizer;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class TSARandomizer extends AppCompatActivity {

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tsarandomizer);

        ImageButton ibtn = (ImageButton) findViewById(R.id.imageButton);
        ibtn.setBackgroundResource(R.drawable.blank);
    }

    public void onClick(View view)
    {
        final ImageButton ibtn = (ImageButton) findViewById(R.id.imageButton);

        int temp = r.nextInt(2);

        if(temp == 0)
        {
            new CountDownTimer(4000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    ibtn.setBackgroundResource(R.drawable.left_lg);
                    ibtn.setClickable(false);
                }

                @Override
                public void onFinish() {
                    ibtn.setBackgroundResource(R.drawable.blank);
                    ibtn.setClickable(true);
                }
            }.start();
        }

        else
        {
            new CountDownTimer(4000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    ibtn.setBackgroundResource(R.drawable.right_lg);
                    ibtn.setClickable(false);
                }

                @Override
                public void onFinish() {
                    ibtn.setBackgroundResource(R.drawable.blank);
                    ibtn.setClickable(true);
                }
            }.start();
        }
    }
}
