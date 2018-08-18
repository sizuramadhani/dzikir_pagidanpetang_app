package com.mada.dzikirpagidanpetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bpagi = (Button) findViewById(R.id.btnpagi);
        bpagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Pagi.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });

        final Button bpetang = (Button) findViewById(R.id.btnpetang);
        bpetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Petang.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });

        final Button bpagipetang = (Button) findViewById(R.id.btnpagipetang);
        bpagipetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),pagidanpetang.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });

    }
}
