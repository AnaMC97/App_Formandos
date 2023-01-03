package com.example.projetocantina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_btn);
    }
    public void EsqueciSenha(View v){
        Intent it = new Intent(TelaInicial.this,Esqueci_Senha.class);
        startActivity(it);
        finish();
    }

}