import java.util.Scanner;

/*Escreva um algoritmo que 
leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. 
Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida */

public class Exercio3 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:  ");
        int a = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o segundo número: ");
        int b = Integer.parseInt(leitor.nextLine());

        int maior = (a > b);

        
    }

}
