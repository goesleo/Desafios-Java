import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a segunda nota  do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();

         double media = (nota + nota2 + nota3) / 3;

        System.out.print("Digite a presença do aluno: ");
        int presenca = sc.nextInt();

        boolean aprovadoPorMedia = media >= 7.0;

        boolean aprovadoPorPresenca = presenca >= 75;

        boolean aprovadoGeral = aprovadoPorPresenca && aprovadoPorMedia;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média Final: %.2f%n", media);
        System.out.println("1. Aprovado por média? " + aprovadoPorMedia);
        System.out.println("2. Frequência OK? " + aprovadoPorPresenca);
        System.out.println("3. APROVADO GERAL? " + aprovadoGeral);

        sc.close();




    }

}
