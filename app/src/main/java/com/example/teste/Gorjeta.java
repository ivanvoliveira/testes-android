package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class Gorjeta extends AppCompatActivity {

    private EditText editTextValor;
    private TextView textViewPorcentagem, textViewGorjeta, textViewTotal;
    private SeekBar seekGorjeta;
    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorjeta);

        editTextValor = findViewById(R.id.et_valor_gorjeta);
        textViewPorcentagem = findViewById(R.id.tv_porcentagem);
        textViewGorjeta = findViewById(R.id.tv_gorjeta);
        textViewTotal = findViewById(R.id.tv_total);
        seekGorjeta = findViewById(R.id.seekBar_gorjeta);

        seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = seekBar.getProgress();
                textViewPorcentagem.setText(Math.round(porcentagem) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calcular(){
        double valorInserido = Double.parseDouble(editTextValor.getText().toString());
        double gorjeta = valorInserido * (porcentagem / 100);
        double total = gorjeta + valorInserido;

        textViewGorjeta.setText("R$ " + Math.round(gorjeta));
        textViewTotal.setText("R$ " + total);
    }
}
