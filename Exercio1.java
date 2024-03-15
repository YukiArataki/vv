import java.util.Scanner;

/*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem 
“Número maior do que 10!”, caso este número seja maior, ou “Númeromenor ou igual a 10!”, 
caso este número seja menor ou igual*/

public class Exercio1 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        if ( numero > 10) {
            System.out.println("O número digitado é maior que 10.");
        }else if ( numero < 10) {
            System.out.println("O número digitado é menor que 10.");
        }else {
            System.out.println("O número digitado é igual a 10.");
        }

        leitor.close();
        
    }

}
