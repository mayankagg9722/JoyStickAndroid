package com.example.mayankaggarwal.joystick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        MainActivity joystick = (MainActivity) findViewById(R.id.myjoystick);
        joystick.setOnMoveListener(new MainActivity.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                Log.d("tagg",angle+" Str: "+strength);
            }
        });

    }
}
