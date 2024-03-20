import java.util.Scanner;

/*5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
da variável A passe a ser o valor da variável B e 
o valor da variável B passe a ser ovalor da variável A. Apresentar uma mensagem com o valor 
original de cada variávele outra com os valores trocados. */

public class Exercio5 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        int VarA;
        int VarB;
        int Aux;

        System.out.println("Digite a primeira variavel");
        VarA = leitor.nextInt();

        System.out.println("Digite a segunda variavel");
        VarB = leitor.nextInt();

        Aux = VarA;
        VarA = VarB;
        VarB = Aux;

        System.out.println("O valor de A he" + VarA);
        System.out.println("O valor de B he" + VarB);

        leitor.close();
    }

}
