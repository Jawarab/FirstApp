package com.example.arraylistdemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Movie2 extends AppCompatActivity {


    ImageView image;
    TextView movie;
    ArrayList<Actors> actors = new ArrayList<>();

    private String SHARED_PREFS = "Choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.movie2 );

        image = findViewById( R.id.image2 );
        movie = findViewById( R.id.movie2 );

    }

}
