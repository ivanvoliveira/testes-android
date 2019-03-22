package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //declarações de variaveis
    private Button botaoTrocaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincula as variaveis as views do xml
        botaoTrocaTela = findViewById(R.id.button_troca_tela);

        //metodo para click de troca de tela
        botaoTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarDeTela = new Intent(MainActivity.this, Activity2.class);
                startActivity(trocarDeTela);
            }
        });
        //fim do conteudo aula 1
    }
}
