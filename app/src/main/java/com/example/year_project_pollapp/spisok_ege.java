package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class spisok_ege extends AppCompatActivity implements View.OnClickListener {
    Button nazad6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_ege);

        Button nazad6 = (Button)findViewById(R.id.nazad6);
        nazad6.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nazad6:

                Intent intetkpp1 = new Intent(this, MainActivity.class);
                startActivity(intetkpp1);
                finish();
                break;
        }
    }
}