/*Enunciado:
Crie um programa que peça ao usuário uma senha (número inteiro).
O programa só encerra quando ele digitar 1234.
Enquanto errar, deve exibir “Senha incorreta!”.
Dica: use do-while para garantir pelo menos uma execução.*/

import java.util.Scanner;
public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

            if (senha != 1234) {
                System.out.println("Senha incorreta!");
            }

        } while (senha != 1234);

        System.out.println("Senha correta! Acesso liberado.");
        sc.close();
    }
}
