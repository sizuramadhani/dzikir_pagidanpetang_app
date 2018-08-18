package com.mada.dzikirpagidanpetang;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pagi extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;

    String[] judul = {
            "Pembukaan", "Dibaca Saat Pagi #1", "Dibaca Saat Pagi #2", "Dibaca Saat Pagi #3",
            "Dibaca Saat Pagi #4", "Dibaca Saat Pagi #5"
    };

    String[] keterangan = {
            String.valueOf(R.string.pembukaan), String.valueOf(R.string.Dibaca_Pagi_1x_1), String.valueOf(R.string.Dibaca_Pagi_1x_2),
            String.valueOf(R.string.Dibaca_pagi_3x_3), String.valueOf(R.string.Dibaca_Pagi_1x_4), String.valueOf(R.string.Dibaca_Pagi_1x_5)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi);
        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),judul,keterangan);
        viewPager.setAdapter(adapter);


    }
}
