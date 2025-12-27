/*2) Exercício 2 — Soma de Números
Enunciado:
Peça ao usuário para digitar 5 números inteiros.
Mostre ao final a soma total deles.
Dica: use um for para repetir a leitura e acumular*/

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º numero: ");
            int numero = sc.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma total é: " + soma);
        sc.close();


    }




}
