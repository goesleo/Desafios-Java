import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];


        int totalLinhas = 2;
        int totalColunas = 3;

        System.out.println("--- Preenchendo a Matriz 2x3 ---");

        for (int i = 0; i < totalLinhas; i++) {
            for (int j = 0; j < totalColunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                    }
                }

                System.out.println("\n--- Soma das Colunas ---");

                for (int j = 0; j < totalColunas; j++) {
                    int somaColuna = 0; // Zera a soma a cada nova coluna

                    for (int i = 0; i < totalLinhas; i++) {
                        somaColuna += matriz[i][j];
                    }

                    System.out.println("A soma da Coluna " + j + " é: " + somaColuna);
                }

                sc.close();



    }


}
