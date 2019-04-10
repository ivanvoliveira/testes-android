package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTrocaTela, buttonTrocaTela2, buttonTrocaTela3, buttonTrocaTela4, buttonTrocaTela5, buttonTrocaTela6, buttonTrocaTela7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTrocaTela = findViewById(R.id.button_main_componentes);
        buttonTrocaTela2 = findViewById(R.id.button_main_sorteio);
        buttonTrocaTela4 = findViewById(R.id.button_main_jokenpo);
        buttonTrocaTela3 = findViewById(R.id.button_main_frases);
        buttonTrocaTela5 = findViewById(R.id.button_main_noticia);
        buttonTrocaTela6 = findViewById(R.id.button_main_netflix);

        buttonTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Componentes.class));
            }
        });

        buttonTrocaTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, Sorteio.class));
            }
        });

        buttonTrocaTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Frases.class));
            }
        });

        buttonTrocaTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Jokenpo.class));
            }
        });

        buttonTrocaTela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Noticia.class));
            }
        });

        buttonTrocaTela6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Netflix.class));
            }
        });

        buttonTrocaTela7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Combustivel.class));
            }
        });
    }
}
