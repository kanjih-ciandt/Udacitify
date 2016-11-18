package com.udacity.udacitify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *  Class responsible for play the music
 *
 *  This class will use Android multimidia framework
 *  (https://developer.android.com/guide/topics/media/mediaplayer.html)
 *
 *
 */
public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }
}
