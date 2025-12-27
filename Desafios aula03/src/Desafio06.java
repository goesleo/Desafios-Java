/*Enunciado:
Monte um menu com as opções abaixo e repita até o usuário escolher
“4 – Sair”:
        1 - Somar dois números
2 - Subtrair dois números
3 - Multiplicar dois números
4 - Sair
Após escolher uma operação, leia os dois números, mostre o resultado
e retorne ao menu.*/

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SAIR");
            System.out.println("Opção: ");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro numero: ");
                double num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("Resultado " + (num1 / num2));
                        break;
                }
            }else if (opcao == 5) {
                    System.out.println("Saindo do Sistema... ");
                } else {
                    System.out.println("Opção invalida! Tente novamente!");
                }
            }while (opcao != 5);
            sc.close();
        }
    }