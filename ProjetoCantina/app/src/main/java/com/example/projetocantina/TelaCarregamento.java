package com.example.projetocantina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaCarregamento extends AppCompatActivity {
    int TIME = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it= new Intent(TelaCarregamento.this, TelaInicial.class);
                startActivity(it);
                finish();
            }
        },TIME);
    }
}