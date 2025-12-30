/*1) Exercício 1 — Vetor de Notas
Escreva um programa que:
Peça ao usuário para informar 4 notas (tipo double);
Armazene em um vetor;
Ao final, exiba:
Todas as notas digitadas;
A média das notas.*/

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] notas = new double [4];
        double soma = 0;

        //for para ler as notas
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        //exibindo as notas
        System.out.println("\nNotas Digitadas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ":" + (notas[i]));
            soma += notas[i];
        }

        double media = soma/notas.length;
        System.out.println("\nMédia das notas: " + media);
        sc.close();

    }

}
