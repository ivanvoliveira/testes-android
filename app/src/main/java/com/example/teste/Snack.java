package com.example.teste;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Snack extends AppCompatActivity {

    private Button buttonAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        buttonAbrir = findViewById(R.id.button_abrir_snack);

        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Troca texto do botão?", Snackbar.LENGTH_LONG).setAction("Trocar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonAbrir.setText("Botão alterado");
                    }
                }).show();
            }
        });
    }
}
