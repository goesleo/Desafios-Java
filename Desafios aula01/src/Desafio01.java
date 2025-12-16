import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double soma = a + b;
        double media = (a + b)/2;

        double maior = Math.max(a, b);
        double menor = Math.min(a, b);

        boolean iguais = (a == b );

        System.out.printf("soma=%.2f%n", soma);
        System.out.printf("media=%.2f%n", media);
        System.out.printf("maior=%.2f%n", maior);
        System.out.printf("menor=%.2f%n", menor);
        System.out.println("sao Iguais=" + iguais);

        sc.close();

    }



}
