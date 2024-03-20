import java.util.Scanner;

/*7.Escreva um algoritmo que leia um número e diga, através de uma mensagem, 
se este número está no intervalo entre 100 e 200. 
Caso o número esteja fora do intervaloo usuário também deverá ser informado. */

public class Exercio7 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float n1;

        System.out.println("Escreva um número que está no intervalo entre 100 e 200");
         n1 = leitor.nextFloat();

        if (n1 >= 100 && n1 <= 200) {
            System.out.println("O valor está entre os intervalos");
        }
        else{
            System.out.println("O valor não está nos intervarlos");
        }
    }

}
