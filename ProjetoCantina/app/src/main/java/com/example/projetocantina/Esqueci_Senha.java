package com.example.projetocantina;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Esqueci_Senha extends AppCompatActivity {

    private TextView codigo;
    private TextView nif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
        //---------------------------------------------------------------------------------------------
        //Execução Automática do código
        codigo=findViewById(R.id.txtcodigo);
        nif=findViewById(R.id.txtnif);
        codigo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String conteudo;
                conteudo=codigo.getText().toString();
                if(conteudo.length()==6){
                    Toast.makeText(Esqueci_Senha.this, "VALIDADO", Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(Esqueci_Senha.this,TelaInicial.class);
                    startActivity(it);
                    finish();
                }
            }
        });


    }
    public void Voltar (View v){
        Intent it = new Intent(Esqueci_Senha.this,TelaInicial.class);
        startActivity(it);
        finish();
    }
    public void Validar (View v){
        if(nif.length()==9) {
            //se sim liga a base de dados
            Toast.makeText(Esqueci_Senha.this, "VALIDADO VAI FILHÃOO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "NIF INCORRETO, POR FAVOR VERIFIQUE OS DADOS INSERIDOS", Toast.LENGTH_SHORT).show();
        }
      /*  Intent it = new Intent(Esqueci_Senha.this,TelaInicial.class);
        startActivity(it);
        finish();
       */
    }




}