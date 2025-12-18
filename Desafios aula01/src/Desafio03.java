import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base de um retangulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o raio de um circulo: ");
        double raio = sc.nextDouble();

        //Constante
        final double PI = 3.14;


        double areaRetangulo = base * altura ;
        double perimetroRetangulo = 2 * (base + altura);
        double areaCirculo = PI * raio * raio;

        boolean quadrado = (base == altura);
        boolean grandeEQuadrado = (areaRetangulo > 100 & quadrado);


        System.out.printf("area do Retangulo=%.2f%n", areaRetangulo);
        System.out.printf("perimetro do Retangulo=%.2f%n", perimetroRetangulo);
        System.out.printf("area do Circulo=%.2f%n", areaCirculo);
        System.out.println("quadrado=" + quadrado);
        System.out.println("Grande e Quadrado=" + grandeEQuadrado);


    }
}
