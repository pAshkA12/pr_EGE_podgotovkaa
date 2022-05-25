package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button poisk1;
    Button home1;
    Button nazad4;
    Button kak_pisat_EGE;
    Button kriterii_EGE;
    Button button5;
    Button izbannoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button poisk1 = (Button)findViewById(R.id.poisk1);
        poisk1.setOnClickListener(this);
        Button home1 = (Button)findViewById(R.id.home1);
        home1.setOnClickListener(this);
        Button nazad4 = (Button)findViewById(R.id.nazad4);
        nazad4.setOnClickListener(this);
        Button kak_pisat_EGE = (Button)findViewById(R.id.kak_pisat_EGE);
        kak_pisat_EGE.setOnClickListener(this);
        Button kriterii_EGE = (Button)findViewById(R.id.kriterii_EGE);
        kriterii_EGE.setOnClickListener(this);
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button izbrannoe = (Button)findViewById(R.id.izbrannoe);
        izbrannoe.setOnClickListener(this);


    }

   public void onClick(View view) {

       switch (view.getId()) {

           case R.id.poisk1:

               Intent intetM1 = new Intent(this, athematic.class);
               startActivity(intetM1);
               finish();
               break;
           case R.id.home1:
               /*Intent intetM2 = new Intent(this, MainActivity.class);
               startActivity(intetM2);
               finish();*/
               break;

           case R.id.nazad4:
               Intent intetM3 = new Intent(this, Nastroiki.class);
               startActivity(intetM3);
               finish();
               break;

           case R.id.kak_pisat_EGE:
               Intent intetM4 = new Intent(this, pisat_ege.class);
               startActivity(intetM4);
               finish();
               break;

           case R.id.button5:
               Intent intetkp2 = new Intent(this, spisok_ege.class);
               startActivity(intetkp2);
               finish();
               break;

           case R.id.kriterii_EGE:
               Intent intetM5 = new Intent(this, kriterii.class);
               startActivity(intetM5);
               finish();
               break;

           case R.id.izbrannoe:
               Toast.makeText(getBaseContext(), "Избранное ещё не доступно ✌", Toast.LENGTH_SHORT).show();// ****************************
               break;


       }
        }


//5555555555555555555555555557788
}