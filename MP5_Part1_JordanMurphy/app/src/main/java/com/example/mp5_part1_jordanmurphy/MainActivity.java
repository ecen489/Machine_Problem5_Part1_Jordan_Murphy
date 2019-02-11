package com.example.mp5_part1_jordanmurphy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.jolene);
    }

    public void onRadioButtonClicked(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.jolene:
                if (checked)

                    image.setImageResource(R.drawable.dolly_parton);

                try
                {
                    mp.reset();
                }
                catch(Exception ex)
                {

                }

                mp = MediaPlayer.create(this,R.raw.jolene);

                mp.start();

                    break;
            case R.id.every:
                if (checked)

                    image.setImageResource(R.drawable.u2);

                try
                {
                    mp.reset();
                }
                catch(Exception ex)
                {

                }

                mp = MediaPlayer.create(this,R.raw.every_breaking_wave);


                mp.start();

                    break;
            case R.id.hymn:
                if (checked)

                    image.setImageResource(R.drawable.coldplay);

                try
                {
                    mp.reset();
                }
                catch(Exception ex)
                {

                }

                mp = MediaPlayer.create(this,R.raw.hymn_for_the_weekend);

                mp.start();

                break;
        }
    }
    public void startPlay(View view) {
        mp.start();
    }

    public void stopPlay(View view) {
        mp.pause();
    }
}
