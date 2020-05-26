package com.example.arraylistdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList<Actors> actors = new ArrayList<>();
    ListView listView;
    private DrawerLayout drawer;
    private final String SHARED_PREFS = "choice";
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate( R.menu.menu, menu );
        return true;
    }

 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        Toolbar toolbar = findViewById( R.id.toolbar );
        drawer = findViewById( R.id.drawer_layout);
        NavigationView navigationView = findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this);

        populateActorsList();

        setSupportActionBar( toolbar );

        //gets menu bottom to the top left
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();
/*
        if(savedInstanceState == null) { //if for the first time
            getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new MessageFragment() ).commit(); //opens frag first before selecting any item in nav drawer
            navigationView.setCheckedItem( R.id.movie );
        }

 */



        actors.add(new Actors( "Jack Nicholson", "Somethings Gotta Give" ));
        actors.add(new Actors( "Michelle Pheifer", "What Lies Beneath" ));
        actors.add(new Actors( "Martin Lawrence", "Bad Boys..." ));
        actors.add(new Actors( "Will Smith", "Men in Black..." ));
        actors.add(new Actors( "Danny DeVito", "Matilda" ));
        actors.add(new Actors( "Eddie Murphy", "The Nutty Professor" ));
        actors.add(new Actors( "Shiloh LaBuff", "Transformers" ));

       Collections.shuffle( actors );






    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent( this, MainActivity.class );
                intent.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity( intent );
                break;


            case R.id.firstmov: //ids are the ids of the menu items
                getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new MessageFragment()).commit();
                break;

            case R.id.secmov:
                getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new ChatFragment()).commit();
                break;

            case R.id.thirdmov:
                getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new ProfileFragment()).commit();
                break;

                case R.id.fthmov:
                    Toast.makeText( this, "Movie 4", Toast.LENGTH_SHORT ).show();
                break;

            case R.id.ffthmov:
                Toast.makeText( this,"Movie 5",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.sixthmov:
                Toast.makeText( this,"Movie 6",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.seventhmov:
                Toast.makeText( this,"Movie 7",Toast.LENGTH_SHORT ).show();
                break;
        }
        //drawer.closeDrawer( GravityCompat.START );
        return true;

        //return true so that item is selected
    }

    //Once drawer or toggle is pressed

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen( GravityCompat.START )){
            drawer.closeDrawer( GravityCompat.START );
        }else {
            super.onBackPressed();
        }

    }

    private void populateActorsList() {
        //constructor
       // ArrayList<Actors> actors = Actors.getActors();

        //Create the adapter
        CustomActorsAdapter adapter = new CustomActorsAdapter(this, actors);
        //Attach the adapter to a ListView
       listView = (ListView) findViewById( R.id.listView1 );
        listView.setAdapter( adapter );





    }




}
