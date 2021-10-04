package com.example.bba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen_Activity extends AppCompatActivity {
    private ImageView logo;
    private TextView title1 , slogan;

    Animation topAnimation , buttomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        //Initialising imaageview , textview
        logo = findViewById(R.id.logo);
        title1 = findViewById(R.id.title1);
        slogan = findViewById(R.id.slogan);

        //Created amination resources file , now initialising then
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_amination);
        buttomAnimation = AnimationUtils.loadAnimation(this,R.anim.button_animation);

        logo.setAnimation(topAnimation);
        title1.setAnimation(buttomAnimation);
        slogan.setAnimation(buttomAnimation);

        //Splash screen work s0 it can work with other activity//
        int SPLASH_SCREEN = 4300;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen_Activity.this , LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);





    }
}