package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //declarações de variaveis
    private Button buttonTrocaTela, buttonTrocaTela2, buttonTrocaTela4, buttonTrocaTela5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincula as variaveis as views do xml
        buttonTrocaTela = findViewById(R.id.button_main_text);
        buttonTrocaTela2 = findViewById(R.id.button_main_sorteio);
        buttonTrocaTela4 = findViewById(R.id.button_main_jokenpo);
        buttonTrocaTela5 = findViewById(R.id.button_main_noticia);
        //declaração de variaveis e vinculação as views
        Button buttonTrocaTela3 = findViewById(R.id.button_main_frases);

        //metodo para click de troca de tela
        buttonTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, NomeIdade.class);
                startActivity(trocarTela);
            }
        });

        buttonTrocaTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Sorteio.class);
                startActivity(trocarTela);
            }
        });

        buttonTrocaTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Frases.class);
                startActivity(trocarTela);
            }
        });

        buttonTrocaTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Jokenpo.class);
                startActivity(trocarTela);
            }
        });

        buttonTrocaTela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Noticia.class);
                startActivity(trocarTela);
            }
        });
    }
}
