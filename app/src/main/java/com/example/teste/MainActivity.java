package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //declarações de variaveis
    private Button botaoTrocaTela2, buttonTrocaTela3, buttonTrocaTela4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincula as variaveis as views do xml
        botaoTrocaTela2 = findViewById(R.id.button_activity_2);
        buttonTrocaTela3 = findViewById(R.id.button_activity_3);
        buttonTrocaTela4 = findViewById(R.id.button_activity_4);

        //metodo para click de troca de tela
        botaoTrocaTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Activity2.class);
                startActivity(trocarTela);
            }
        });
        //fim do conteudo aula 1

        buttonTrocaTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Activity3.class);
                startActivity(trocarTela);
            }
        });

        buttonTrocaTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, Sorteio.class);
                startActivity(trocarTela);
            }
        });
    }
}
