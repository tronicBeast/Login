package com.example.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class showImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        FullImageActivity fim=new FullImageActivity();
        ImageAdapter imageAdapter = new ImageAdapter(this);
        int pos = fim.position;
        ImageView imageView = (ImageView) findViewById(R.id.nonblurred);
        imageView.setImageResource(imageAdapter.mThumbIds[pos]);
    }
}
