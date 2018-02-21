package com.example.hole1.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class SettingsActivity extends AppCompatActivity {
    public static int soundchecked=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        soundOff();
    }
    public void soundOff(){
        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (buttonView.isChecked()){
                    soundchecked=1;
                }else{
                    soundchecked=0;
                }
            }
        });
    }
}
