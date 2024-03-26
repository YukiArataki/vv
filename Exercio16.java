import java.util.Scanner;

/*16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética. 
Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

public class Exercio16 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("A média aritmética das notas é: %.2f\n", media);

        leitor.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

}
