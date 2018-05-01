package com.superoriginal.rootashadnasim.starapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //fdsdfdf
        ImageView image=findViewById(R.id.imageView);
        Resources res = getResources();
        String col=getIntent().getStringExtra("name");


        int resID = res.getIdentifier(col , "drawable", getPackageName());
        image.setImageResource(resID);

    }
}
