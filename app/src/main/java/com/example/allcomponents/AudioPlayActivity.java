package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class AudioPlayActivity extends AppCompatActivity implements View.OnClickListener{
    Button b4,b5;
    MediaPlayer md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_play);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        md= MediaPlayer.create(AudioPlayActivity.this,R.raw.abc1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                md.start();
                break;
            case R.id.button5:
                md.pause();
                break;
        }

    }
}