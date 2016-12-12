package com.exercicio;

public class Lampada {

    protected boolean ligada;

    public Lampada() {

    }

    public void liga() {
        ligada = true;
    }

    public void desliga() {
        ligada = false;
    }

    public String observa() {
        if (ligada == true) {
            return "ligada";
        } else {
            return "desligada";
        }
    }
}
