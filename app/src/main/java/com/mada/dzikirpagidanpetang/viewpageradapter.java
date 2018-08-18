package com.mada.dzikirpagidanpetang;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Hp on 16/01/2018.
 */

public class viewpageradapter extends PagerAdapter {

    Context context;
    String[] judul;
    String [] keterangan;
    LayoutInflater layoutInflater;

    public viewpageradapter (Context context, String[] judul,String[] keterangan) {
        this.context = context;
        this.judul = judul;
        this.keterangan = keterangan;

    }


    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textjudul,textketerangan;


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.galeri_item,container,false);


        textjudul = (TextView) v.findViewById(R.id.judulitem);
        textketerangan = (TextView) v.findViewById(R.id.keteranganitem);


        textjudul.setText(judul[position]);
        textketerangan.setText(Integer.parseInt(keterangan[position]));


        ((ViewPager) container).addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);

    }
}
