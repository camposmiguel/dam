package com.miguelcr.mediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

public class MiServicioMusica extends Service {
    MediaPlayer mediaPlayer;
    String urlCancion = "http://www.miguelcr.com/kygo.mp3";

    public MiServicioMusica() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        // Instancio el mediaPlay con la canción que recibo uriCancion = R.raw.michael_buble
        mediaPlayer = MediaPlayer.create(this, Uri.parse(urlCancion));
        mediaPlayer.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //mediaPlayer.stop();
    }
}
