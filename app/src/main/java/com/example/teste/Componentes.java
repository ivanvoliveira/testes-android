package com.example.teste;

import android.content.DialogInterface;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Componentes extends AppCompatActivity {

    private TextView textViewResultado, textViewResultadoSeekBar;
    private Button buttonEnviar;
    private TextInputEditText editTextProduto;
    private CheckBox checkBoxBranco, checkBoxVerde, checkBoxVermelho;
    private List<String> check = new ArrayList<String>();
    private RadioGroup radioGroupEstoque;
    private ProgressBar progressBar, progressBarLoading;
    private SeekBar seekBar;

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
        progressBar = findViewById(R.id.pb);
        progressBarLoading = findViewById(R.id.pb_loading);
        seekBar = findViewById(R.id.seekBar);
        textViewResultadoSeekBar = findViewById(R.id.tv_resultado_seek);

        verificaRadio();

        progressBarLoading.setVisibility(View.GONE);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewResultadoSeekBar.setText("Progresso: " + seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Seekbar alterado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Seekbar não pressionado", Toast.LENGTH_SHORT).show();
            }
        });

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

    public void setaProduto(View view){
        textViewResultado.setText(editTextProduto.getText());
    }

    public void toast(View view){
        Toast.makeText(getApplicationContext(), "Botão Pressionado", Toast.LENGTH_SHORT).show();
    }

    public void alert(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setCancelable(false);

        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem");

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Componentes.this, "Sim pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Componentes.this, "Não pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create();
        dialog.show();
    }

    public void carregarProgress(View view){
        progressBarLoading.setVisibility(View.VISIBLE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<=100; i++){
                    final int progresso = i;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progresso);
                            if (progresso == 100){
                                progressBarLoading.setVisibility(View.GONE);
                            }
                        }
                    });

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
