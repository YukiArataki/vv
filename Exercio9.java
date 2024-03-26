import java.util.Scanner;

/*9. Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. 
Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
Caso sejam diferentes, informe que são diferentes e qual número é o maior. */

public class Exercio9 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = leitor.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = leitor.nextInt();

        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        
            if (A > B) {
                System.out.println("O número maior é: " + A);
            } else {
                System.out.println("O número maior é: " + B);
            }
        }

        leitor.close();
    }

}
