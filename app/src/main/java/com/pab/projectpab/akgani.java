package com.pab.projectpab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class akgani extends AppCompatActivity {
    Button btn_lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akgani);
        btn_lokasi = (Button) findViewById(R.id.btn_lokasi2);
        btn_lokasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH2 = new Intent(akgani.this, akganimaps.class);
                startActivity(PINDAH2);
            }
        });

    }
}