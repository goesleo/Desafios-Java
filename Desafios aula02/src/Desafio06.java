import java.util.Scanner;

/**/
public class Desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Criança: " + (idade <= 12));
        System.out.println("Adolescente: " + (idade >= 13 && idade <= 17));
        System.out.println("Adulto: " + (idade >= 18 && idade <= 59));
        System.out.println("Idoso: " + (idade >= 60));


    }

}
