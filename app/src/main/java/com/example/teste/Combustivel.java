package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Combustivel extends AppCompatActivity {

    private EditText editTextPrecoAlcool, editTextPrecoGasolina;
    //private Button buttonCalcula;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustivel);

        editTextPrecoAlcool = findViewById(R.id.textInputAlcool);
        editTextPrecoGasolina = findViewById(R.id.textInputGasolina);
        //buttonCalcula = findViewById(R.id.button_calculaCombustivel);
        textViewResultado = findViewById(R.id.textView_resultadoCombustivel);


    }

    public void calculaCombustivel(View view) {
        String alcool = editTextPrecoAlcool.getText().toString();
        String gasolina = editTextPrecoGasolina.getText().toString();

        Boolean camposValidados = this.validaCampos(alcool, gasolina);

        if (camposValidados){
            this.calcularPreco(alcool, gasolina);
        }
        else {
            textViewResultado.setText("Preencha os campos!");
        }
    }

    public void calcularPreco(String pAlcool, String pGas) {
        Double alcool = Double.parseDouble(pAlcool);
        Double gasolina = Double.parseDouble(pGas);

        if (alcool / gasolina >= 0.7){
            textViewResultado.setText("Melhor utilizar Gasolina!");
        }
        else {
            textViewResultado.setText("Melhor utilizar Alcool!");
        }
    }

    public boolean validaCampos(String pAlcool, String pGas){
        Boolean camposValidados = true;

        if (pAlcool.isEmpty()){
            camposValidados = false;
            editTextPrecoAlcool.setError("Campo Vazio");
        }
        else if (pGas.isEmpty()){
            camposValidados = false;
            editTextPrecoGasolina.setError("Campo Vazio!");
        }

        return camposValidados;
    }

}
