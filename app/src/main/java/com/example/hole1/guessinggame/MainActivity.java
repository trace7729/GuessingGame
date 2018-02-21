package com.example.hole1.guessinggame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int mainsoundchecked=SettingsActivity.soundchecked;
    Button btnPlay, btnSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.birds007);
        super.onCreate(savedInstanceState);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);
        btnSound = (Button) findViewById(R.id.btnSound);
        btnSound.setOnClickListener(this);

    }
        public void onClick(View view){
            switch(view.getId()){
                case R.id.btnPlay:
                    Intent b;
                    b=new Intent(this, GameActivity.class);
                    startActivity(b);

                    break;
                case R.id.btnSound:
                    Intent s;
                    s=new Intent(this, SettingsActivity.class);
                    startActivity(s);
            }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

/**
        btnPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mainsoundchecked==0) {
                    mp.start();
                }
                Intent u = new Intent(MainActivity.this, GameActivity.class);
                MainActivity.this.startActivity(u);
            }
        });
        btnSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, SettingsActivity.class);
                MainActivity.this.startActivity(e);
            }
        });**/


}