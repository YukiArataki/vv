import java.util.Scanner;

/*14. A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). 
Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da
Progressão Aritmética. Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. 
Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28 */

public class Exercio14 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro termo (a1) da Progressão Aritmética: ");
        int a1 = leitor.nextInt();

        System.out.print("Digite o número do termo (n) que deseja encontrar: ");
        int n = leitor.nextInt();

        System.out.print("Digite a razão (r) da Progressão Aritmética: ");
        int r = leitor.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O termo de ordem " + n + " da Progressão Aritmética é: " + an);

        leitor.close();
    }

}
