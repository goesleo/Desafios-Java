import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Desafio 01");
            System.out.println("2 - Desafio 02");
            System.out.println("3 - Desafio 03");
            System.out.println("4 - Desafio 04");
            System.out.println("5 - Desafio 05");
            System.out.println("6 - Desafio 06");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1 -> Desafio01.main(null);
                case 2 -> Desafio02.main(null);
                case 3 -> Desafio03.main(null);
                case 4 -> Desafio04.main(null);
                case 5 -> Desafio05.main(null);
                case 6 -> Desafio06.main(null);
                case 0 -> System.out.println("Saindo... ");
                default -> System.out.println("Opção inválida ");
            }

        } while (opcao != 0);
        ler.close();
    }
}