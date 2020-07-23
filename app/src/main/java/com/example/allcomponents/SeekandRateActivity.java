package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekandRateActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, RatingBar.OnRatingBarChangeListener {
    SeekBar s;
    TextView t;
    RatingBar r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekand_rate);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        t = findViewById(R.id.t1);
        s = findViewById(R.id.seekBar);
        r = findViewById(R.id.ratingBar);
        s.setOnSeekBarChangeListener(this);
        r.setOnRatingBarChangeListener(this);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        t.setText("" + progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(), "Stop", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        t.setText("" + rating);
    }

}