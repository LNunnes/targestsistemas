package com.target.exercicios;

public class Exercicio4 {
    private static final double SP =  67836.43;
    private static final double RJ =  36678.66;
    private static final double MG =  29229.88;
    private static final double ES =  27165.48;
    private static final double OUTROS =  19849.53;
    private static final double TOTAL = SP + RJ + MG + ES + OUTROS;

    public static void main(String[] args) {
        System.out.println("Participação SP: " + String.format("%.2f", (SP / TOTAL) * 100)  + " %");
        System.out.println("Participação RJ: " + String.format("%.2f", (RJ / TOTAL) * 100)  + " %");
        System.out.println("Participação MG: " + String.format("%.2f", (MG / TOTAL) * 100)  + " %");
        System.out.println("Participação ES: " + String.format("%.2f", (ES / TOTAL) * 100)  + " %");
        System.out.println("Participação OUTROS: " + String.format("%.2f", (OUTROS / TOTAL) * 100)  + " %");
    }

}
