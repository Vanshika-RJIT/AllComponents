package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class AudioRecordActivity extends AppCompatActivity implements View.OnClickListener {
    Button b3;
    int request_code=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_record);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
                Intent i2 = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
                startActivityForResult(i2, request_code);


    }

}