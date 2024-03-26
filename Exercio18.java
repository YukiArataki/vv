import java.util.Scanner;

/*18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.
Média harmônica =             3
                   ------------------------
                   1    +    1    +    1
                 -----      -----     ------
                 nota1      nota2     nota3
Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
Média: 7.37
 */

public class Exercio18 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double mediaHarmonica = calcularMediaHarmonica(nota1, nota2, nota3);

        System.out.printf("A média harmônica das notas é: %.2f\n", mediaHarmonica);

        leitor.close();
    }

    public static double calcularMediaHarmonica(double nota1, double nota2, double nota3) {
        return 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
    }

}
