package com.example.mynewuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    ImageView img,clover;


    LinearLayout textSplash,menu,txthome;
    Animation frombottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.bgapp);
        clover = findViewById(R.id.clover);
        textSplash = findViewById(R.id.linear);
        txthome = findViewById(R.id.texthome);
        menu = findViewById(R.id.menus);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        img.animate().translationY(-1150).setDuration(1000).setStartDelay(1000);
        clover.animate().alpha(0).translationY(-1700).setDuration(2000).setStartDelay(1000);
        textSplash.animate().translationY(140).alpha(0).setDuration(900).setStartDelay(900);

       txthome.startAnimation(frombottom);
       menu.startAnimation(frombottom);

    }
}
