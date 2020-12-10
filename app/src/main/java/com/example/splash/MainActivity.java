package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation bottomAnim;
TextView logo;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
       bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation );
       logo= findViewById(R.id.textView);
       image=findViewById(R.id.imageView);
       image.setAnimation(bottomAnim);
        logo.setAnimation(bottomAnim);
        int SPLASH_SCREEN = 5000;
        new Handler().postDelayed(() -> {
           Intent intent=new Intent( MainActivity.this,dashboard.class);
           startActivity(intent);
           finish();
       }, SPLASH_SCREEN);
    }
}