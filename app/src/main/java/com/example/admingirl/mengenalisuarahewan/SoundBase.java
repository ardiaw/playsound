package com.example.admingirl.mengenalisuarahewan;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;

public class SoundBase extends Service {
    MediaPlayer media;
    public static int[] resource = { R.raw.angsa, R.raw.anjing, R.raw.ayam,
            R.raw.babi, R.raw.burung_hantu, R.raw.cempe, R.raw.elang,
            R.raw.sapi, R.raw.simpanse, R.raw.ular,};

    @Override
    public IBinder onBind(Intent intent) {
// TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onCreate() {
        media = new MediaPlayer();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
// TODO do something useful
        Bundle extras = intent.getExtras();
        int position = (Integer) extras.get("position");
        media = MediaPlayer.create(this, SoundBase.resource[position]);
        media.setLooping(false);
        media.start();
// Toast.makeText(this,position,Toast.LENGTH_LONG).show();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        media.stop();
        media.release();
    }
}
