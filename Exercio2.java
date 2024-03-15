import java.util.Scanner;

/*2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma. */

public class Exercio2 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:  ");
        int n1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o segundo número: ");
        int n2 = Integer.parseInt(leitor.nextLine());

        int soma = n1 + n2;

        System.out.println("A soma dos dois valores é: " + soma);
  }
    }
