package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PassarDados extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passar_dados);

        buttonEnviar = findViewById(R.id.buttonEnviarDados);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassarDados.this, ActivityDados.class);

                Usuario usuario = new Usuario("Ivan", "email");

                intent.putExtra("nome", "Ivan Viana");
                intent.putExtra("idade", 30);
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });
    }
}
