package com.example.allcomponents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    ImageView i;
    int request_code = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        i = findViewById(R.id.imageView);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
               Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(i, request_code);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==30)
        {
            assert data != null;
            Bundle b = data.getExtras();
            Bitmap bmp =(Bitmap) b.get("data");
            i.setImageBitmap(bmp);
        }
    }
}