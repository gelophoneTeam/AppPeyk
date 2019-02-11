package com.example.apppeyk;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Requ extends Activity {


//list Item
public static int[] box = {
        R.drawable.ic_box,
        R.drawable.ic_box,
        R.drawable.ic_box,
        R.drawable.ic_box,
        };

public static String[] name = {
        "نام داروخانه : دکتر نصیری زاده","نام داروخانه : دکتر نصیری زاده","نام داروخانه : دکتر نصیری زاده","نام داروخانه : دکتر نصیری زاده",

        };

public static String[] adress = {
        "آدرس:ملاصدرا روبروی بیمارستان تامین اجتماعی","آدرس:ملاصدرا روبروی بیمارستان تامین اجتماعی","آدرس:ملاصدرا روبروی بیمارستان تامین اجتماعی",
        "آدرس:ملاصدرا روبروی بیمارستان تامین اجتماعی",
        };
public static String[] dateT = {
        "تاریخ:","تاریخ:","تاریخ:","تاریخ:",
        };
public static String[] date = {
        "97/11/21", "97/11/21", "97/11/21", "97/11/21",
        };
public static String[] codeT = {
        "کد سفارش:", "کد سفارش:", "کد سفارش:", "کد سفارش:",
        };
public static String[] code = {
        "#332566","#332566","#332566","#332566",
        };
        ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requ);

        //listAdaptor

        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new ReAdapter(this,box,name,adress,dateT,date,codeT,code));

        }
        }
