import java.util.Scanner;

/*Escreva um algoritmo que 
leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. 
Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida */

public class Exercio3 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int a = leitor.nextInt();

        System.out.print("Insira o valor de B: ");
        int b = leitor.nextInt();

        if (a != b) {
         
            if (a > b) {
                System.out.println("O número A é maior do que o número B.");
            } else {
                System.out.println("O número B é maior do que o número A.");
            }
        } else {
            System.out.println("A sequência de números informados é inválida, pois os números são iguais.");
        }

        leitor.close();
 
    }

}
