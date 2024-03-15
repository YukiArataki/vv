import java.util.Scanner;

/*4.Escreva um algoritmo que 
leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos.*/

public class Exercio4 {

    public static void executar(){
        
        Scanner leitor = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite um número: ");
        num1 = leitor.nextInt();
        System.out.print("Digite mais um número: ");
        num2 = leitor.nextInt();

        System.out.println();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) );
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) );
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2) );
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) );

    }

}
