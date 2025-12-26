/*Enunciado:
Leia uma temperatura (em °C) e mostre:
●“Muito frio” se for menor que 10,
●“Agradável” se estiver entre 10 e 25,
●“Quente” se estiver entre 25 e 35,
●“Muito quente” se for maior que 35.*/


import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double t = sc.nextDouble();

        System.out.println("Muito frio: " + (t < 10));
        System.out.println("Agradável: " + (t >= 10 && t <= 25));
        System.out.println("Quente: " + (t > 25 && t <= 35));
        System.out.println("Muito quente: " + (t > 35));

        sc.close();





    }

}
