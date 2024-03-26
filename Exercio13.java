import java.util.Scanner;

/*13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo 
de operador em outra variável do tipo CARACTERE. 
Imprima o resultado da operaçãode A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
mensagem de operador não definido. Tratar erro de divisão por zero. */

public class Exercio13 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = leitor.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = leitor.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador não definido!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        leitor.close();
    }

}
