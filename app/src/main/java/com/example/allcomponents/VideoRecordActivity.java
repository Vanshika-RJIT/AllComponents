package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class VideoRecordActivity extends AppCompatActivity implements View.OnClickListener {
    Button b2;
    int request_code=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_record);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        b2=findViewById(R.id.button2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i1 = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(i1, request_code);
    }

}