package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopwatchAct extends AppCompatActivity {

    Button btnStart,btnstop;
    ImageView icanchor;
    Animation round;
    Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        btnstop = findViewById(R.id.btnstop);
        btnStart = findViewById(R.id.btnstart1);
        icanchor = findViewById(R.id.icanchor);
        timer = findViewById(R.id.timerHere);
        btnstop.setAlpha(0);
        round = AnimationUtils.loadAnimation(this,R.anim.roundingalone);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                icanchor.startAnimation(round);
                btnstop.animate().alpha(1).setDuration(300).start();
                btnStart.animate().alpha(0).setDuration(300).start();

                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();
            }
        });



    }
}
