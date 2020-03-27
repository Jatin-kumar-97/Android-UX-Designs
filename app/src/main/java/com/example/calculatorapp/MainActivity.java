package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Animation atg,btgone,btgtwo;
    ImageView ivSplash;
    TextView tvSplash,tvSubsplash;
    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvSplash = findViewById(R.id.tvSplash);
        tvSubsplash = findViewById(R.id.tvSubSplash);
        ivSplash = findViewById(R.id.ivsplash);
        btnget = findViewById(R.id.btnget);

        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
        btgone = AnimationUtils.loadAnimation(this,R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation(this,R.anim.btgtwo);

        ivSplash.startAnimation(atg);
        tvSplash.startAnimation(btgone);
        tvSubsplash.startAnimation(btgone);
        btnget.startAnimation(btgtwo);


        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,StopwatchAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });



    }


}
