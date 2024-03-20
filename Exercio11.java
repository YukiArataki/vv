import java.util.Scanner;

/*11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.*/

public class Exercio11 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o primeiro número ");
        a = leitor.nextInt();

        System.out.println("Digite o segundo número");
        b = leitor.nextInt();

        System.out.println("Digite o terceiro número");
        c = leitor.nextInt();

        if (a < b) {
            if (b < c) {
                System.out.println(a + "\n" + b + "\n" + c);
            }
            else if (a < c) {
                System.out.println(a + "\n" + c + "\n" + b);
            }else {
                System.out.println(c + "\n" + a + "\n" + b);
            }
        }
         else if (b < c) {
            if (a < c) {
                System.out.println(a + "\n" + b + "\n" + c);
            }
         }
        
    }

}
