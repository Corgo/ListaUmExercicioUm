package com.exercicio;

public class UsaLampada {

    public static void main(String args[]) {
        //letra A
        Lampada lampadaUm = new Lampada();
        Lampada lampadaDois = new Lampada();
        //letra B
        lampadaUm.liga();
        lampadaDois.desliga();
        //Letra C
        lampadaUm.observa();
        lampadaDois.observa();

    }
}
