package com.digitalhouse.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {


    private TextView visor;
    private Operacao operacao = new Operacao();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        visor = findViewById(R.id.visor_calculadora);

    }




    public void addValor(View view){
        String atual = visor.getText().toString();
        String clicado = ((TextView) view).getText().toString();
        if (visor.getText().toString().contains(".") && clicado.contains(".")){
        }else if (visor.getText().toString().contains("+") || visor.getText().toString().contains("-") ||
                visor.getText().toString().contains("%") || visor.getText().toString().contains("x") || visor.getText().toString().contains("÷")){

            visor.setText(clicado);
        }else {
            visor.setText(atual + clicado);
        }
    }

    public void addPercent(View view){
        Float atual = Float.parseFloat(visor.getText().toString())/100;
        String novoNumero = atual.toString();
        visor.setText(novoNumero);
    }

    public void negativoPositivo(View view){
        String atual = visor.getText().toString();
        if (visor.getText().toString().contains("-")){
            visor.setText(atual);
        }else {
            visor.setText("-"+atual);
        }

    }

    public void limpar(View view){
        visor.setText("");
        operacao.setValor1(0);
        operacao.setValor2(0);
    }

    public void addOperacao(View view) {
        if (visor.getText().toString().contains(""){

        }

        else
        operacao.setValor1(Float.parseFloat(visor.getText().toString()));
        operacao.setSinal(((TextView)view).getText().toString());
        visor.setText(operacao.getSinal());

    }

    public void exibirResultado(View view){
       operacao.setValor2 (Float.parseFloat(visor.getText().toString()));
       visor.setText(String.valueOf(operacao.exibirResultado()));

    }
}
