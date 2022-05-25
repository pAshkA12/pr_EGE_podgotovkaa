package com.example.year_project_pollapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class math_dop_forma extends AppCompatActivity implements View.OnClickListener {
    TextView tv_1_zag;
    TextView tv_2_zag;
    TextView tv_3_zag;


    Button nazad2;
    Button bt;



    String[] nazvanie = new String[9];
    String[] dop_opisanie = new String[9];
    String[] opisanie = new String[9];
    String[] ssilki = new String[9];
    String znach;
    String str1;
    int co;
    int code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_dop_forma);
        TextView tv_1_zag = (TextView) findViewById(R.id.tv_1_zag);
        TextView tv_2_zag = (TextView) findViewById(R.id.tv_2_zag);
        TextView tv_3_zag = (TextView) findViewById(R.id.tv_3_zag);


        Button nazad2 = (Button)findViewById(R.id.nazad2);
        nazad2.setOnClickListener(this);
        Button bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(this);





        String str = getIntent().getStringExtra("number");
        code = Integer.parseInt(str);





        nazvanie[0]="Профильная математика ЕГЭ Умскул";
        nazvanie[1]="Сайт Александра Ларина";
        nazvanie[2]="YouClever";
        nazvanie[3]="Интерактивный учебник по русскому языку";
        nazvanie[4]="Грамота.ру";
        nazvanie[5]="Правила русского языка";
        nazvanie[6]="Сайт Константина Полякова";
        nazvanie[7]="Информатик БУ";
        nazvanie[8]="Школа программиста";

        dop_opisanie[0]="YouTube-канал для сдачи ЕГЭ на 90+ баллов";
        dop_opisanie[1]="огромная база заданий с олимпиад, тестирований и ЕГЭ прошлых лет";
        dop_opisanie[2]="интерактивный учебник";
        dop_opisanie[3]="YouTube-канал, который ведёт Александр Долгих, преподаватель, подготовивший, по его словам, 587 стобалльников";
        dop_opisanie[4]="cайт с интерактивными диктантами для тренировки, словари по русскому языку и справочное бюро";
        dop_opisanie[5]="веб-справочник";
        dop_opisanie[6]="разбор типовых экзаменационных заданий";
        dop_opisanie[7]="YouTube-канал";
        dop_opisanie[8]="архив с заданиями ЕГЭ прошлых лет.";

        opisanie[0]="«Профильная математика ЕГЭ Умскул» — YouTube-канал, где можно найти множество видео с разборами сложных задач, а также лайфхаки для сдачи ЕГЭ на 90+ баллов.";
        opisanie[1]="Сайт Александра Ларина — огромная база заданий с олимпиад, тестирований и ЕГЭ прошлых лет, учебники по математике, разборы типовых ошибок. Также здесь есть форум, где можно задавать вопросы.";
        opisanie[2]="YouClever — интерактивный учебник по математике, в котором разбираются основные темы алгебры и геометрии.";
        opisanie[3]="«Русский язык ЕГЭ Умскул» — YouTube-канал, который ведёт Александр Долгих, преподаватель, подготовивший, по его словам, 587 стобалльников. Он подробно разбирает каждое задание и даёт подсказки тем, кто хочет сдать экзамен на отлично.";
        opisanie[4]="«Грамота.ру» — интерактивные диктанты для тренировки, словари по русскому языку и справочное бюро, где можно задавать вопросы о правильном написании слов и пунктуации.";
        opisanie[5]="«Правила русского языка» — веб-справочник, в котором орфографические и пунктуационные нормы удобно разбиты на группы и сопровождаются примерами. Также можно установить приложение на iOS с тем же содержанием.";
        opisanie[6]=" Сайт Константина Полякова — материалы для подготовки к ЕГЭ, разбор типовых экзаменационных заданий с несколькими способами решения.";
        opisanie[7]="«Информатик БУ» — канал со стримами, где разбираются типовые задачи ЕГЭ.";
        opisanie[8]="«Школа программиста» — архив с заданиями ЕГЭ прошлых лет.";

        ssilki[0]="https://www.youtube.com/channel/UCvffROOTDLzYGb4_9-ReyOg";
        ssilki[1]="http://alexlarin.net/";
        ssilki[2]="https://youclever.org/book/";
        ssilki[3]="https://www.youtube.com/playlist?list=PL66kIi3dt8A4f_vyuI750cuvAfbWqZZNd";
        ssilki[4]="http://gramota.ru/";
        ssilki[5]="https://therules.ru/";
        ssilki[6]="https://kpolyakov.spb.ru/school/ege.htm";
        ssilki[7]="https://www.youtube.com/channel/UCmUcjDHUkIMhfqBfyHYXYuA/featured";
        ssilki[8]="https://acmp.ru/";


        tv_1_zag.setText(nazvanie[code]);
        tv_2_zag.setText(dop_opisanie[code]);
        tv_3_zag.setText(opisanie[code]);


        str1 = getIntent().getStringExtra("mo");
        co = Integer.parseInt(str);
        /*try {
            co = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            co = 0;
        }*/


    }


    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.nazad2:
                Intent intetmd = new Intent(this, athematic.class);
                startActivity(intetmd);
                finish();

                break;

            case R.id.bt:
                final SpannableString webaddress = new SpannableString(ssilki[code]);
                Linkify.addLinks(webaddress, Linkify.ALL);

                final AlertDialog aboutDialog = new AlertDialog.Builder(this).setMessage(webaddress).setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                            }
                        }).create();

                aboutDialog.show();

                ((TextView) aboutDialog.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());

                break;


        }

    }



}