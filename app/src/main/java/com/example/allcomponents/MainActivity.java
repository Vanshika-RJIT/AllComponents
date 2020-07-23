package com.example.allcomponents;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String str[]={"Camera","Date","Time","VideoRecording","VideoPlaying","AudioRecording","AudioPlaying","SeekBar and RatingBar","Custom Dialog"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        l = findViewById(R.id.text1);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_selectable_list_item, str);
        l.setAdapter(ad);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(MainActivity.this, CameraActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(MainActivity.this, DateActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(MainActivity.this, TimeActivity.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(MainActivity.this, VideoRecordActivity.class);
                    startActivity(i);
                }else if (position == 4) {
                    Intent i = new Intent(MainActivity.this,  VideoPlayActivity.class);
                    startActivity(i);
                }else if (position == 5) {
                    Intent i = new Intent(MainActivity.this,AudioRecordActivity.class);
                    startActivity(i);
                }else if (position == 6) {
                    Intent i = new Intent(MainActivity.this, AudioPlayActivity.class);
                    startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(MainActivity.this,SeekandRateActivity.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(MainActivity.this,CustomDialogActivity .class);
                    startActivity(i);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
        ab.setTitle("Quit");
        ab.setMessage("Do you want to close the App?");
        ab.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }
            }
        }); ab.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ab.show();
    }
}