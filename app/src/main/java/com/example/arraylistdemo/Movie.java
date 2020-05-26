package com.example.arraylistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Movie extends AppCompatActivity {


    ImageView image;
    TextView movie;
    ArrayList<Actors> actors = new ArrayList<>();

    private String SHARED_PREFS = "Choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.movie );

        image = findViewById( R.id.image1 );
        movie = findViewById( R.id.movie );

    }

}
