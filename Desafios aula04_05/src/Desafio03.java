/*3) Exercício 3 — Maior e Menor Valor
Faça um programa que:1.Leia N números inteiros (defina N = 5, por exemplo);
2.Armazene em um vetor;
3.Descubra:
O maior valor;
O menor valor;*/

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 5;

        int[] vetor = new int[N];

        System.out.println("Digite " + N + " números inteiros:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];


        for (int i = 1; i < N; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        sc.close();

    }
}
