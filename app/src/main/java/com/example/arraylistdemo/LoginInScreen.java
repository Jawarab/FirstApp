package com.example.arraylistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;

public class LoginInScreen extends AppCompatActivity {

    CircularImageView circularImageView;
    EditText user, pass;
    Button login;
    TextView loginwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login_in_screen );
        user = findViewById( R.id.username );
        pass = findViewById( R.id.password );
        login = findViewById( R.id.login );
        loginwelcome = findViewById( R.id.login2 );


        circularImageView = findViewById( R.id.avatar );

        circularImageView.setCircleColor( Color.WHITE );
        //circularImageView.setBorderWidth( 10f );
        //circularImageView.setBorderColor( Color.CYAN );
        // circularImageView.setShadowEnable( true );

        user.getText().toString();
        pass.getText().toString();



            login.setOnClickListener( new View.OnClickListener() {


                @Override
                public void onClick(View v) {

                    if (user.getText().toString().equals( "JAYB" ) && pass.getText().toString().equals( "1234" )){

                    Intent intent = new Intent( LoginInScreen.this, MainActivity.class );
                    startActivity( intent );
                } else {
                        Toast.makeText( getApplicationContext(),"Try Again",Toast.LENGTH_SHORT ).show();
                    }
            }


                 });
    }


}
