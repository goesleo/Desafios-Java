/*5) Exercício 5 — Números Pares de 1 a N
Enunciado:
Peça um número N ao usuário e mostre todos os pares entre 1 e N,
inclusive.
Dica: use um for e o operador % para verificar paridade.*/

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        System.out.println("Numeros pares de 1 ate " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();


    }



}
