package com.example.jeoneunjee.gongmo1;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jeoneunjee.animation.R;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    AnimationDrawable ani;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.img);
        ani=(AnimationDrawable)img.getDrawable();
        ani.setOneShot(false);

        ani.start();

    }
}



