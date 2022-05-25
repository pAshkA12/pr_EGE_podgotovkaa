package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pisat_ege extends AppCompatActivity implements View.OnClickListener {
    Button nazad5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pisat_ege);

        Button nazad5 = (Button)findViewById(R.id.nazad5);
        nazad5.setOnClickListener(this);




    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.nazad5:

                Intent intetkp1 = new Intent(this, MainActivity.class);
                startActivity(intetkp1);
                finish();
                break;


    }
    }

}
