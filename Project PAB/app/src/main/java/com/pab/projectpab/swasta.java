package com.pab.projectpab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class swasta extends AppCompatActivity {
    Button btn_detail,btn2_detail,btn3_detail,btn4_detail,btn5_detail;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuabout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.item1){
            startActivity(new Intent(swasta.this, About.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swasta);
        btn_detail = (Button) findViewById(R.id.btn_detail);
        btn2_detail = (Button) findViewById(R.id.btn2_detail);
        btn3_detail = (Button) findViewById(R.id.btn3_detail);
        btn4_detail = (Button) findViewById(R.id.btn4_detail);
        btn5_detail = (Button) findViewById(R.id.btn5_detail);
        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(swasta.this, three.class);
                startActivity(PINDAH);
            }
        });
        btn2_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(swasta.this, Four.class);
                startActivity(PINDAH);
            }
        });
        btn3_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(swasta.this, rscharitas.class);
                startActivity(PINDAH);
            }
        });
        btn4_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(swasta.this, muhammadiyah.class);
                startActivity(PINDAH);
            }
        });
        btn5_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(swasta.this, muhammadiyah.class);
                startActivity(PINDAH);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }};