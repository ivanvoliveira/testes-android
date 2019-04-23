package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SwitchToggle extends AppCompatActivity {

    private ToggleButton tgEstado;
    private Switch swEstado;
    private CheckBox cbEstado;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_toggle);

        tgEstado = findViewById(R.id.tb_estado);
        swEstado = findViewById(R.id.sw_estado);
        cbEstado = findViewById(R.id.cb_estado);
        tvResultado = findViewById(R.id.tv_resultado_switch);
    }

    public void enviar(View view){
        if (swEstado.isChecked()) {
            tvResultado.setText("Toggle Ligado");
        }
        else{
            tvResultado.setText("Toggle Desligado");
        }
    }
}
