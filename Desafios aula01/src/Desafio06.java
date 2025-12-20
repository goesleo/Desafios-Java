import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Digite sua cidade: ");
        String cidade = input.nextLine();
        System.out.println("Digite seu apelido: ");
        String apelido = input.nextLine();

        boolean temApelido = apelido.length() > 0;
        boolean nomeIgualApelido = nome.equals(apelido);

        System.out.println(nome + ", " +  idade + ", " + cidade);
        System.out.println(temApelido);
        System.out.println(nomeIgualApelido);
        input.close();

    }



}
