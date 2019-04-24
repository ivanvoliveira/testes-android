package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        getSupportActionBar().hide();

        buttonVoltar = findViewById(R.id.button_voltar);
        imageViewResultado = findViewById(R.id.imageView_resultado_cara_coroa);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0) {
           imageViewResultado.setImageResource(R.drawable.moeda_cara);
        }
        else {
            imageViewResultado.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
