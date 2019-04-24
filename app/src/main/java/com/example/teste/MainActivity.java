package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonTrocaTela, buttonTrocaTela2, buttonTrocaTela3, buttonTrocaTela4, buttonTrocaTela5, buttonTrocaTela6, buttonTrocaTela8, buttonTrocaTela7, buttonTrocaTela9, buttonTrocaTela10, buttonTrocaTela11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        buttonTrocaTela = findViewById(R.id.button_main_sorteio);
        buttonTrocaTela2 = findViewById(R.id.button_main_frases);
        buttonTrocaTela3 = findViewById(R.id.button_main_jokenpo);
        buttonTrocaTela4 = findViewById(R.id.button_main_noticia);
        buttonTrocaTela5 = findViewById(R.id.button_main_netflix);
        buttonTrocaTela6 = findViewById(R.id.button_main_switch);
        buttonTrocaTela7 = findViewById(R.id.button_main_combustivel);
        buttonTrocaTela8 = findViewById(R.id.button_main_componentes);
        buttonTrocaTela9 = findViewById(R.id.button_main_gorjeta);
        buttonTrocaTela10 = findViewById(R.id.button_main_dados);
        buttonTrocaTela11 = findViewById(R.id.button_main_cara_coroa);

        buttonTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, Sorteio.class));
            }
        });

        buttonTrocaTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Frases.class));
            }
        });

        buttonTrocaTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Jokenpo.class));
            }
        });

        buttonTrocaTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Noticia.class));
            }
        });

        buttonTrocaTela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Netflix.class));
            }
        });

        buttonTrocaTela6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SwitchToggle.class));
            }
        });

        buttonTrocaTela7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Combustivel.class));
            }
        });

        buttonTrocaTela8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Componentes.class));
            }
        });

        buttonTrocaTela9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Gorjeta.class));
            }
        });

        buttonTrocaTela10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PassarDados.class));
            }
        });

        buttonTrocaTela11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CaraCoroa.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
