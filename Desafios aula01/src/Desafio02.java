import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempC = sc.nextDouble();

        double tempF = tempC * 9.0 / 5.0 + 32;

        boolean conforto = (tempC >= 20 && tempC <= 24);
        boolean extremo = (tempC < 0 || tempC > 35);

        System.out.println("--- Resultado ---");
        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", tempF);
        System.out.println("Faixa de conforto: " + conforto);
        System.out.println("Temperatura extrema: " + extremo);

        sc.close();
    }
}
