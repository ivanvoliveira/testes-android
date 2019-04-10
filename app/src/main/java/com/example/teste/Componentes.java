package com.example.teste;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Componentes extends AppCompatActivity {

    private TextView textViewResultado;
    private Button buttonEnviar;
    private TextInputEditText editTextProduto;
    private CheckBox checkBoxBranco, checkBoxVerde, checkBoxVermelho;
    private List<String> check = new ArrayList<String>();
    private RadioGroup radioGroupEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        textViewResultado = findViewById(R.id.textView_resultado_produto);
        buttonEnviar = findViewById(R.id.button_componentes_enviar);
        editTextProduto = findViewById(R.id.editText_produto);
        checkBoxBranco = findViewById(R.id.checkBox_branco);
        checkBoxVerde = findViewById(R.id.checkBox_verde);
        checkBoxVermelho = findViewById(R.id.checkBox_vermelho);
        radioGroupEstoque = findViewById(R.id.radioGroup_estoque);

        verificaRadio();

    }

    public void verificaRadio(){
        radioGroupEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton_sim){
                    textViewResultado.setText("Sim");
                }
                else{
                    textViewResultado.setText("Não");
                }
            }
        });
    }

    public void verificaCheck(View v){
        check.clear();

        if (checkBoxBranco.isChecked()){
            check.add(checkBoxBranco.getText().toString());
        }
        if (checkBoxVerde.isChecked()){
            check.add(checkBoxVerde.getText().toString());
        }
        if (checkBoxVermelho.isChecked()){
            check.add(checkBoxVermelho.getText().toString());
        }

        textViewResultado.setText(check.toString());
    }

    public void setaProduto(View v){
        textViewResultado.setText(editTextProduto.getText());
    }
}
