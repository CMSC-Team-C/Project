package com.example.personalityapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static Profile profile = new Profile(); //create profile where data is stored
    private Button button;
    private Button about;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //hide title bar


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectGender();
            }
        });

        about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });
    }


    public void openSelectGender(){
        Intent intent = new Intent(this, SelectGender.class);
        startActivity(intent);
    }

    public void openAbout(){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}