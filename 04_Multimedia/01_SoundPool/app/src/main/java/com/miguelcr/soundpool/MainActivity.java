package com.miguelcr.soundpool;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.Suppress;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SoundPool soundPool;
    int sonidoExplosion;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);


        // Player properties
        AudioAttributes aa = null;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            aa = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(10)
                    .setAudioAttributes(aa)
                    .build();
        } else {
            crearOldSoundPool();
        }


        // Load sound
        sonidoExplosion = soundPool.load(this,R.raw.powerup,1);
    }

    @SuppressWarnings("deprecation")
    private void crearOldSoundPool() {
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
    }


    @Override
    public void onClick(View v) {
        soundPool.play(sonidoExplosion,1,1,0,-1,1);
    }
}
