/*Enunciado:Leia duas notas de um aluno e calcule a média.
Depois, exiba:
       “Aprovado” se a média for ≥ 7,
       “Recuperação” se a média estiver entre 5 e 6.9,
       “Reprovado” se for < 5.*/
import java.util.Scanner;


public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;
        System.out.printf("Média = %.2f%n", media);

        System.out.println("Aprovado: " + (media >= 7));
        System.out.println("Recuperação: " + (media >= 5 && media < 7));
        System.out.println("Reprovado: " + (media < 5));

        sc.close();
    }
}
