package com.example.allcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

public class CustomDialogActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        i=findViewById(R.id.imageButton);
        i.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final Dialog dialog = new Dialog(CustomDialogActivity.this);
        dialog.setContentView(R.layout.dialog);
        dialog.setCancelable(false);
        dialog.show();
        ImageButton i2=dialog.findViewById(R.id.imageButton2);
        final EditText t1=dialog.findViewById(R.id.text1);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               dialog.cancel();
            }
        });

    }
}