package com.example.teste;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PreferenciasDoUsuario extends AppCompatActivity {

    private Button buttonSalvar;
    private EditText editTextNome;
    private TextView textViewResultado;
    private static final String ARQUIVO_PREFERENCIA = "Preferencias";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias_do_usuario);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        editTextNome = findViewById(R.id.editTextNome);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = preferences.edit();

                if (editTextNome.getText().toString().equals("")) {
                    Toast.makeText(PreferenciasDoUsuario.this, "Preencha o nome", Toast.LENGTH_SHORT).show();
                    editTextNome.setError("Preencha este campo!");
                }
                else {
                    String nome = editTextNome.getText().toString();
                    editor.putString("nome", nome);
                    editor.commit();
                    textViewResultado.setText("Olá, " + nome);
                }
            }
        });

        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

        if (preferences.contains("nome")){
            textViewResultado.setText("Olá, " + preferences.getString("nome", "usuário não definido"));
        } else {
            textViewResultado.setText("Olá, usuário não definido");
        }
    }
}
