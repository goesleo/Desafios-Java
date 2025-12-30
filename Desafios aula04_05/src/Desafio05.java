import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[2][3];

        System.out.println("--- Registro de Notas ---");

        for (int i = 0; i < 2; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                System.out.print("  Nota da prova " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Boletim Final ---");

        for (int i = 0; i < 2; i++) {
            double soma = 0;
            System.out.print("Aluno " + (i + 1) + " | Notas: ");

            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }

            double media = soma / 3;

            System.out.printf("] | Média: %.2f%n", media);

            System.out.println();
        }

        sc.close();
    }
}

