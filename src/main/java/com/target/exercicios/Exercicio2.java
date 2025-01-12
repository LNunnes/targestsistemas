package com.target.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static boolean pertenceFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int a = 0, b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
