package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question16 extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question16);                //set to the current page
        getSupportActionBar().hide(); //hide title bar

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                MainActivity.profile.setResponse(16, 'A');
                openQuestion17();                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                MainActivity.profile.setResponse(16, 'B');
                openQuestion17();                    //go to next question
            }
        });
    }

    public void openQuestion17(){
        Intent intent = new Intent(this, Question17.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0,0);
    }
}