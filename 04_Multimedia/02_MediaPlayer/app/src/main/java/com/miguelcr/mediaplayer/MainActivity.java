package com.miguelcr.mediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    String urlCancion = "http://www.miguelcr.com/kygo.mp3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playPause(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btnPlayActivity:
                mediaPlayer = MediaPlayer.create(this, Uri.parse(urlCancion));
                mediaPlayer.start();
                break;
            case R.id.btnStopActivity: mediaPlayer.stop();
                break;
            case R.id.btnPlayService:
                Intent i = new Intent(this, MiServicioMusica.class);
                startService(i);
                break;
            case R.id.btnStopService:
                Intent i2 = new Intent(this, MiServicioMusica.class);
                stopService(i2);
                break;

        }
    }
}
