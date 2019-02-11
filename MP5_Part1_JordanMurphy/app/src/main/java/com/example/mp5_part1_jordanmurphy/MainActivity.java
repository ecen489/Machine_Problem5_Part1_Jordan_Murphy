package com.example.mp5_part1_jordanmurphy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.jolene);
    }

    public void startPlay(View view) {
        mp.start();
    }

    public void stopPlay(View view) {
        mp.stop();
    }
}
