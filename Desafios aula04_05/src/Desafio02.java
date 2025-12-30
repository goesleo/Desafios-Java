/*2) Exercício 2 — Contando Números Pares
Crie um programa que:
1.Leia 10 números inteiros e guarde em um vetor int[];
2.Conte quantos são pares;
3.Ao final, mostre:
Todos os números;
Quantos eram pares.*/

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [10];
        int totalPares = 0;

        for (int i = 0; i < numeros.length; i++ ){

            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0){
                totalPares ++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Quantidade de pares: " + totalPares);

        sc.close();



    }






}
