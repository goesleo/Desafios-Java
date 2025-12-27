 /*3)Exercício 3 — while com Condição de Parada
Enunciado:
Leia números até o usuário digitar 0.
Quando isso acontecer, o programa deve encerrar e mostrar quantos
números foram digitados.
Dica: use while (n != 0) com contador*/

 import java.util.Scanner;

 public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Digite um numero (0 Fecha o programa):");
        numero = sc.nextInt();

        while(numero != 0){
            contador++;

            System.out.println("Digite um numero (0 Fecha o programa):");
            numero = sc.nextInt();

        }

        System.out.println("Você digitou " + contador + " números.");

        sc.close();
    }


}
