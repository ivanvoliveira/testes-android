package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    private Button buttonPegaNome, buttonPegaIdade;
    private TextView textResultado;
    private EditText editTextNome, editTextIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //Vincula as variaveis as views do xml
        textResultado = findViewById(R.id.textView_resultado);
        editTextNome = findViewById(R.id.editText_nome);
        editTextIdade = findViewById(R.id.editText_idade);
        buttonPegaNome = findViewById(R.id.button_pega_nome);
        buttonPegaIdade = findViewById(R.id.button_pega_idade);

        //metodo de click para pegar o nome do edit text e jogar no text view resultado
        buttonPegaNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                textResultado.setText(nome);
            }
        });

        //metodo de click para pegar idade
        buttonPegaIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idadeString = editTextIdade.getText().toString();
                if (idadeString.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Você não nasceu!", Toast.LENGTH_LONG).show();
                }
                else {
                    int idade = Integer.parseInt(idadeString);

                    if(idade >= 18){
                        textResultado.setText(idadeString);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Menor de idade!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
