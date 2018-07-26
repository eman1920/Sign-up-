package com.example.android.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  // when continue button  is pressed
        TextView continueSignUp = (TextView) findViewById(R.id.sign_up_continue);
        continueSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // continue to sign up
            }
        });


// when pressing sign in
       TextView signIn = (TextView) findViewById(R.id.sign_in);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // open sign in page
            }
        });

    }

}
