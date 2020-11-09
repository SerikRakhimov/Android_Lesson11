package com.example.graphics;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);
        ImageView imageView9 = findViewById(R.id.imageView9);
        ImageView imageView10 = findViewById(R.id.imageView10);

        Animation animationAlphaTranslate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_alpha_translate);
        Button button = (Button) findViewById(R.id.activate);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "pacifico.ttf");
        button.setTypeface(typeface);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.startAnimation(animationAlphaTranslate);
                imageView2.startAnimation(animationAlphaTranslate);
                imageView3.startAnimation(animationAlphaTranslate);
                imageView4.startAnimation(animationAlphaTranslate);
                imageView5.startAnimation(animationAlphaTranslate);
                imageView6.startAnimation(animationAlphaTranslate);
                imageView7.startAnimation(animationAlphaTranslate);
                imageView8.startAnimation(animationAlphaTranslate);
                imageView9.startAnimation(animationAlphaTranslate);
                imageView10.startAnimation(animationAlphaTranslate);
            }
        });
    }

}