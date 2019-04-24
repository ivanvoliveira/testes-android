package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDados extends AppCompatActivity {

    private TextView nome, idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        nome = findViewById(R.id.textView_nome);
        idade = findViewById(R.id.textView_idade);

        Bundle dados = getIntent().getExtras();
        String n = dados.getString("nome");
        int i = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        //nome.setText(n);
        nome.setText(usuario.getEmail());
        idade.setText(String.valueOf(i));
    }
}
