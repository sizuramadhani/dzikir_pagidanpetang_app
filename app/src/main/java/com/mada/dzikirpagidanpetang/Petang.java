package com.mada.dzikirpagidanpetang;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Petang extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;

    String[] judul = {
          "Pembukaan","Dibaca Saat Petang #1","Dibaca Saat Petang #2","Dibaca Saat Petang #3","Dibaca Saat Petang #4"
    };

    String [] keterangan = {
            String.valueOf(R.string.pembukaan), String.valueOf(R.string.Dzikir_Petang_1), String.valueOf(R.string.Dzikir_Petang_2),
            String.valueOf(R.string.Dzikir_Petang_3), String.valueOf(R.string.Dzikir_Petang_4)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang);
        viewPager = (ViewPager) findViewById(R.id.pager);


        adapter = new viewpageradapter(getApplication(),judul,keterangan);
        viewPager.setAdapter(adapter);
    }
}
