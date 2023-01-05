package com.example.telaalmoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                Intent it = new Intent(MainActivity.this, telaAlmoco.class);
                startActivity(it);
                finish();
            }

    }
