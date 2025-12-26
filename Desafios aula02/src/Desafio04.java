import java.util.Scanner;

/*Enunciado:​
Leia a velocidade de um carro.
Exiba:
 “Dentro do limite” se for até 80 km/h,
 "Acima do limite” se estiver entre 81 e 100 km/h,
 “Multa grave!” se for acima de 100 km/h.*/
public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade: ");
        int v = sc.nextInt();

        System.out.println("Dentro do limite: " + (v <= 80));
        System.out.println("Acima do limite: " + (v > 80 && v <= 100));
        System.out.println("Multa grave: " + (v > 100));

        System.out.println("Multa R$0: " + (v <= 80));
        System.out.println("Multa R$150: " + (v > 80 && v <= 100));
        System.out.println("Multa R$500: " + (v > 100));

        sc.close();




    }
}
