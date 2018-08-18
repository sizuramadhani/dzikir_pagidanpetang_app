package com.mada.dzikirpagidanpetang;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class pagidanpetang extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;

    String[] judul = {
          "Pembukaan","Dzikir Pagi Dan Petang #1","Dzikir Pagi Dan Petang #2","Dzikir Pagi Dan Petang #3","Dzikir Pagi Dan Petang #4",
            "Dzikir Pagi Dan Petang #5","Dzikir Pagi Dan Petang #6","Dzikir Pagi Dan Petang #7","Dzikir Pagi Dan Petang #8",
            "Dzikir Pagi Dan Petang #9","Dzikir Pagi Dan Petang #10","Dzikir Pagi Dan Petang #11","Dzikir Pagi Dan Petang #12",
            "Dzikir Pagi Dan Petang #13","Dzikir Pagi Dan Petang #14","Dibaca Setiap Hari #15"
    };

    String [] keterangan = {
            String.valueOf(R.string.pembukaan), String.valueOf(R.string.dzikir_pagi_dan_Petang_1), String.valueOf(R.string.dzikir_pagi_dan_petang_2),
            String.valueOf(R.string.dzikir_pagi_dan_petang_3), String.valueOf(R.string.dzikir_pagi_dan_petang_4), String.valueOf(R.string.dzikir_pagi_dan_petang_5),
            String.valueOf(R.string.dzikir_pagi_dan_petang_6), String.valueOf(R.string.dzikir_pagi_dan_petang_7), String.valueOf(R.string.dzikir_pagi_dan_petang_8),
            String.valueOf(R.string.dzikir_pagi_dan_petang_9),String.valueOf(R.string.dzikir_pagi_dan_petang_10), String.valueOf(R.string.dzikir_pagi_dan_petang_11),
            String.valueOf(R.string.dzikir_pagi_dan_petang_12), String.valueOf(R.string.dzikir_Pagi_dan_petang_13), String.valueOf(R.string.dzikir_pagi_petang_14),
             String.valueOf(R.string.Dibaca_Setiap_Hari_15)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagidanpetang);
        viewPager = (ViewPager) findViewById(R.id.pager);


        adapter = new viewpageradapter(getApplication(),judul,keterangan);
        viewPager.setAdapter(adapter);


    }
}
