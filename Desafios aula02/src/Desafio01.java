/*Enunciado:Crie um programa que leia um número inteiro e diga se ele é par ou
ímpar.*/


import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int n = sc.nextInt();

        System.out.println("É par? " + (n % 2 == 0));
        System.out.println("É ímpar? " + (n % 2 != 0));

        sc.close();
    }

}
