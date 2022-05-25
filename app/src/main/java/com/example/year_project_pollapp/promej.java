package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class promej extends AppCompatActivity implements View.OnClickListener {
TextView attentionn2;
    Button home3;
    Button nazad3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promej);
        TextView attentionn2 = (TextView) findViewById(R.id.attentionn2);
        Button home3 = (Button)findViewById(R.id.home3);
        home3.setOnClickListener(this);
        Button nazad3 = (Button)findViewById(R.id.nazad3);
        nazad3.setOnClickListener(this);

    }


    public void onClick(View view) {
        String q = "1";
        switch (view.getId()) {


            case R.id.home3:
                Intent intent = new Intent(this, athematic.class);
                intent.putExtra("qw", q);
                startActivity(intent);
                finish();
                break;
            case R.id.nazad3:
                Intent intetq22 = new Intent(this, Nastroiki.class);
                startActivity(intetq22);
                finish();
                break;


           /*case R.id.izbrannoe:

               break;*/


        }
    }



}
