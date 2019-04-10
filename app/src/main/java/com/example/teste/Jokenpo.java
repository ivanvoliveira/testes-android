package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Jokenpo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokenpo);
    }

    public void pedra(View v){
        this.opcaoSelecionada("pedra");
    }

    public void papel(View v){
        this.opcaoSelecionada("papel");
    }

    public void tesoura(View v){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imageViewResultado = findViewById(R.id.imageView_escolha_app);
        TextView textoResultado = findViewById(R.id.textView_resultado_jokenpo);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int n = new Random().nextInt(3);
        String escolhaApp = opcoes[n];

        switch (escolhaApp){
            case "pedra":
                imageViewResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageViewResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageViewResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((escolhaApp == "pedra" && escolhaUsuario == "tesoura") || (escolhaApp == "papel" && escolhaUsuario == "pedra") || (escolhaApp == "tesoura" && escolhaUsuario=="papel")){
            textoResultado.setText("Você perdeu! :(");
        }
        else if ((escolhaUsuario == "pedra" && escolhaApp == "tesoura") || (escolhaUsuario == "papel" && escolhaApp == "pedra") || (escolhaUsuario == "tesoura" && escolhaApp=="papel")){
            textoResultado.setText("Você Ganhou :)");
        }
        else {
            textoResultado.setText("Empate! xD");
        }
    }
}
