package com.pab.projectpab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_swasta, btn_umum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_swasta = (Button) findViewById(R.id.btn_swasta);
        btn_umum = (Button) findViewById(R.id.btn_umum);
        btn_swasta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH = new Intent(MainActivity.this, Second.class);
                startActivity(PINDAH);
            }
        });
        btn_umum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH = new Intent(MainActivity.this, three.class);
                startActivity(PINDAH);
            }
        });

    }
}