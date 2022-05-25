package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class poisk extends AppCompatActivity implements View.OnClickListener {
Button button_n2;
Button poisk2;
Button home2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisk);
        Button button_n2 = (Button)findViewById(R.id.button_n2);
        button_n2.setOnClickListener(this);
        Button poisk2 = (Button)findViewById(R.id.poisk2);
        poisk2.setOnClickListener(this);
        Button home2 = (Button)findViewById(R.id.home2);
        home2.setOnClickListener(this);
    }


    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button_n2:
                Intent intetq = new Intent(this, Nastroiki.class);
                startActivity(intetq);
                finish();
                break;
            case R.id.poisk2:
                Intent intetq2 = new Intent(this, athematic.class);
                startActivity(intetq2);
                finish();
                break;
            case R.id.home2:
                Intent intetq3 = new Intent(this, MainActivity.class);


                startActivity(intetq3);
                finish();
                break;

           /*case R.id.izbrannoe:

               break;*/


        }
    }
}