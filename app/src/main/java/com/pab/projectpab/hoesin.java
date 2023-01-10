package com.pab.projectpab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hoesin extends AppCompatActivity {
    Button btn_lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoesin);
        btn_lokasi = findViewById(R.id.btn_lokasi2);
        btn_lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(hoesin.this, hoesinmaps.class);
                startActivity(PINDAH);
            }
        });
    }
}