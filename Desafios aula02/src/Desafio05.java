import java.util.Scanner;

/*Enunciado:
Peça o valor de uma compra e calcule o desconto conforme a faixa:
 Até R$100 → sem desconto
 De R$101 até R$500 → 10%
 Acima de R$500 → 15%
Mostre o valor final com printf("%.2f").*/
public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();

        double desconto =
                valor <= 100 ? 0 :
                        valor <= 500 ? valor * 0.10 :
                                valor * 0.15;

        double valorFinal = valor - desconto;

        System.out.println("Sem desconto: " + (valor <= 100));
        System.out.println("Desconto 10%: " + (valor > 100 && valor <= 500));
        System.out.println("Desconto 15%: " + (valor > 500));

        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();

    }
}
