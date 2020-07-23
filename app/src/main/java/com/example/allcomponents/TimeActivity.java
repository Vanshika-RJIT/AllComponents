package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimeActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton i;
    TextView t;
    TimePickerDialog.OnTimeSetListener tt=new TimePickerDialog.OnTimeSetListener() {
         @Override
         public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
             t.setText(hourOfDay+":"+minute);
         }
     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        i=findViewById(R.id.imageButton);
         t=findViewById(R.id.textView);
      i.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Calendar c=Calendar.getInstance();
        new TimePickerDialog(TimeActivity.this,tt,c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),true).show();

    }
}