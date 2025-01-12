package com.target.exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        inverterString("target sistemas");
        inverterString("candidato lucas");
        inverterString("tem potencial");
    }

    public static void inverterString(String texto) {
        StringBuilder novoTexto = new StringBuilder();
        for(int i = texto.length() - 1; i >= 0; i--) {
            novoTexto.append(texto.charAt(i));
        }

        System.out.println(novoTexto);
    }
}
