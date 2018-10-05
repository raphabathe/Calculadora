package com.digitalhouse.calculadora;

public class Operacao {

    private float valor1;
    private float valor2;
    private String sinal;


    public float operacao(){
        float resultado = 0F;
        if (sinal.contains("x")){
            return multiplicar();
        }else if (sinal.contains("+")) {
            return somar();
        }else if (sinal.contains("-")) {
            return subtrair();
        }else if (sinal.contains("÷")) {
            return dividir();
        }else
        return resultado;
    }

    public float exibirResultado(){
        return operacao();
    }


    public float multiplicar(){
        return valor1 * valor2;
    }


    public float somar(){
        return valor1 + valor2;
    }

    public float subtrair(){
        return valor1 - valor2;
    }

    public float dividir(){
        return valor1 / valor2;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }
}
