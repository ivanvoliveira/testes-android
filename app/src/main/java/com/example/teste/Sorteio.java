package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Sorteio extends AppCompatActivity {

    private Button buttonTrocaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio);

        buttonTrocaTela = findViewById(R.id.button_sorteio_frases);

        buttonTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarTela = new Intent(Sorteio.this, Frases.class);
                startActivity(trocarTela);
            }
        });
    }

    public void sortearNumero(View view) { //metodo alternativo de vincular função ao botão, mudando no xml
        TextView textoResultado = findViewById(R.id.textView_numero);
        int numero = new Random().nextInt(11);
        textoResultado.setText("O número selecionado é: " + numero);
    }
}

