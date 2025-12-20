import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();


        double IMC = peso/(altura*altura);

        boolean abaixoOuIgual18_5 = IMC <= 18.5;
        boolean entre18_5e24_9 = IMC > 18.5 && IMC < 25;
        boolean acimaOuIgual30 = IMC >= 30;

        System.out.printf("%.2f%n", IMC);
        System.out.println(abaixoOuIgual18_5);
        System.out.println(entre18_5e24_9);
        System.out.println(acimaOuIgual30);

        input.close();


    }
}
