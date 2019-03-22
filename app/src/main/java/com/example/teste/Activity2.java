package com.example.teste;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView textoTela2;
    private Button botaoTela3, botaoTrocaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Vincula as variaveis as views do xml
        botaoTela3 = findViewById(R.id.button_tela3);
        textoTela2 = findViewById(R.id.textView_troca);
        botaoTrocaTexto = findViewById(R.id.button_troca_texto);

        //metodo de troca para tela 3
        botaoTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltaTela = new Intent(Activity2.this, Activity3.class);
                startActivity(voltaTela);
            }
        });

        //metodo para trocar texto do text view
        botaoTrocaTexto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textoTela2.setText("Texto trocado!");
            }
        });
        //fim do conteudo aula 1
    }
}
