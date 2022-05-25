package com.example.year_project_pollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Nastroiki extends AppCompatActivity implements View.OnClickListener {
    String[] data = {" - ","математика", "русский", "информатика"};
    Button nazad11;
    Button zagruzka;
    TextView textView;

    static int pos_spisok; // тут ош


    int code=0;
    int nom_form=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String pos; // попытка исправления ошибки
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nastroiki);
        //кнопки:
                Button nazad11 = (Button) findViewById(R.id.nazad11);
                nazad11.setOnClickListener(this);
                Button zagruzka = (Button) findViewById(R.id.zagruzka);
                zagruzka.setOnClickListener(this);


        // адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Title");
        // выделяем элемент
        spinner.setSelection(0);

        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // показываем позиция нажатого элемента
                pos_spisok=position;


                // Получаем выбранный объект
                String item = (String)parent.getItemAtPosition(position);

                if(Nastroiki.pos_spisok==0){
                    Toast.makeText(getBaseContext(), "Вы не выбрали предмет", Toast.LENGTH_SHORT).show();// ****************************
                }

                if(Nastroiki.pos_spisok==1){
                    Toast.makeText(getBaseContext(), "Выбранный предмет: МАТЕМАТИКА", Toast.LENGTH_SHORT).show();// ****************************
                }

                if(Nastroiki.pos_spisok==2){
                    Toast.makeText(getBaseContext(), "Выбранный предмет: РУССКИЙ", Toast.LENGTH_SHORT).show();// ****************************;
                }

                if(Nastroiki.pos_spisok==3) {
                    Toast.makeText(getBaseContext(), "Выбранный предмет: ИНФОРМАТИКА", Toast.LENGTH_SHORT).show();// ****************************
                }
                //Toast.makeText(getBaseContext(), "Выбранный предмет: математика", Toast.LENGTH_SHORT).show();// ****************************
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.nazad11:


                Intent intetN = new Intent(this, athematic.class);
                startActivity(intetN);
                finish();

                break;
            case R.id.zagruzka:

                if(pos_spisok==1){
                    Intent intentNN1 = new Intent(this, athematic.class);

                    //intentNN1.putExtra("mo", math);
                    startActivity(intentNN1);
                    finish();


                }
                if(pos_spisok==2){
                    Intent intentNN2 = new Intent(this, athematic.class);
                    //intentNN2.putExtra("mo", russ);
                    startActivity(intentNN2);
                    finish();


                }
                if(pos_spisok==3){
                    Intent intentNN3 = new Intent(this, athematic.class);
                    //intentNN3.putExtra("mo", infr);
                    startActivity(intentNN3);
                    finish();


                }

        }
    }

}





// *

