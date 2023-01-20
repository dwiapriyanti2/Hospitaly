package com.pab.projectpab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class umum extends AppCompatActivity {
    Button btn_detail2,btn2_detail2,btn2_detail3,btn_detail4,btn_detail5;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuabout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.item1){
            startActivity(new Intent(umum.this, About.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umum);
        btn_detail2 = (Button) findViewById(R.id.btn2_detail);
        btn2_detail2= (Button) findViewById(R.id.btn_detail2);
        btn2_detail3= (Button) findViewById(R.id.btn3_detail);
        btn_detail4= (Button) findViewById(R.id.btn4_detail);
        btn_detail5= (Button) findViewById(R.id.btn5_detail);
        btn_detail2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(umum.this, bhayangkara.class);
                startActivity(PINDAH2);
            }
        });
        btn2_detail2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(umum.this, akgani.class);
                startActivity(PINDAH2);
            }
        });
        btn2_detail3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(umum.this, matasumsel.class);
                startActivity(PINDAH2);
            }
        });
        btn_detail4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(umum.this, pertamina.class);
                startActivity(PINDAH2);
            }
        });
        btn_detail5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(umum.this, hoesin.class);
                startActivity(PINDAH2);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}