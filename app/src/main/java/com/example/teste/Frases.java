package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Frases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);
    }

    public void novaFrase(View vew){

        String[] frases = {
                "O ignorante afirma, o sábio duvida, o sensato reflete.",
                "Dizes que a beleza não é nada? Imagina um hipopótamo com alma de anjo... Sim, ele poderá convencer os outros de sua angelitude - mas que trabalheira!",
                "Para quê preocuparmo-nos com a morte? A vida tem tantos problemas que temos de resolver primeiro.",
                "Se a tranquilidae da água permite refletir as coisas, o que não poderá a tranquilidade do espírito?",
                "Não faças da tua vida um rascunho, Poderás não ter tempo de passá-la a limpo.",
                "Nossas dúvidas são traidoras e nos fazem perder o que, com frequência, poderíamos ganhar, por simples medo de arriscar.",
                "Fiquei magoado, não por me teres mentido, mas por não poder voltar a acreditar-te.",
                "'Nada se perde, tudo muda de dono' - tardia reflexão de Lavoisier ao descobrir que lhe haviam roubado a carteira."
        };
        int n = new Random().nextInt(frases.length);
        TextView textViewFrase = findViewById(R.id.textView_frase);
        textViewFrase.setText(frases[n]);
    }
}
