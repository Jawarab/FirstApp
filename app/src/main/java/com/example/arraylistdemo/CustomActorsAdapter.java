package com.example.arraylistdemo;

import android.content.Context;
import android.content.Intent;

import android.graphics.Color;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class CustomActorsAdapter extends ArrayAdapter<Actors> {

ArrayList<Actors> values;
Context context;
    private String SHARED_PREFS = "Choice";

    public CustomActorsAdapter(Context context, ArrayList<Actors> actors) {
        super(context, R.layout.list_view_items, actors);
        this.values = actors;
        this.context = context;


    }

    @Override
    public int getCount() {
        return values.size();
    }

    //now click Ctrl + O to implement methods for array adapter




    @Override
    public View getView(int position,  View rowview,  ViewGroup parent) {
       // return super.getView( position, convertView, parent );

        //check to see if existing view is being used, if not inflate the view
      if(rowview == null) {
          // convertView = LayoutInflater.from(getContext()).inflate( R.layout.list_view_items, parent, false );
          LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
          rowview = inflater.inflate( R.layout.list_view_items, parent, false );
      }
        //get the data item for this position
        //Actors actors = getItem( position );
        //Lookup view for data population


        final TextView actorName = (TextView) rowview.findViewById( R.id.actorName);
        final TextView actorMovie = (TextView) rowview.findViewById( R.id.actorMovie );

        final String movActor = values.get( position ).getName();
        final String nameOfMovie = values.get( position ).getMovie();



        actorName.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (movActor.equals( "Jack Nicholson" ) && nameOfMovie.equals( "Somethings Gotta Give" )) {



                    Intent intent = new Intent(context, Movie.class  );
                    context.startActivity( intent );

                }



                if (movActor.equals( "Michelle Pheifer" ) && nameOfMovie.equals( "What Lies Beneath" )) {



                    Intent intent2 = new Intent(context, Movie2.class  );
                    context.startActivity( intent2 );


                }


                if (movActor.equals( "Eddie Murphy" ) && nameOfMovie.equals( "The Nutty Professor" )) {



                    Intent intent3 = new Intent(context, Movie3.class  );
                    context.startActivity( intent3 );


                }

                if (movActor.equals( "Will Smith" ) && nameOfMovie.equals( "Men in Black..." )) {



                    Intent intent4 = new Intent(context, Movie4.class  );
                    context.startActivity( intent4 );


                }

                if(movActor.equals( "Danny DeVito" ) && nameOfMovie.equals( "Matilda" )) {


                    Intent intent5 = new Intent( context,Movie5.class );
                    context.startActivity( intent5 );
                }

                if(movActor.equals( "Martin Lawrence" ) && nameOfMovie.equals( "Bad Boys..." )) {


                    Intent intent6 = new Intent( context,Movie6.class );
                    context.startActivity( intent6 );
                }

                if(movActor.equals( "Shiloh LaBuff" ) && nameOfMovie.equals( "Transformers" )){


                    Intent intent7 = new Intent( context, Movie7.class );
                    context.startActivity( intent7 );

                }





            }
        } );



            //Populate the data into the view

            actorName.setText( movActor );

            actorMovie.setText( nameOfMovie );





        return rowview;


    }



}
