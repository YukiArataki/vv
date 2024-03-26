import java.util.Scanner;

/*8. Escreva um algoritmo que leia um número e 
mostre uma mensagem caso este número seja maior ou igual a 50, outra se ele for menor que 50. */

public class Exercio8 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = leitor.nextInt();

        if (numero >= 50) {
            System.out.println("O número é maior ou igual a 50.");
        } else {
            System.out.println("O número é menor que 50.");
        }

        leitor.close();
    }

}
