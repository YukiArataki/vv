import java.util.Scanner;

/*17. Elabore um algoritmo que receba três notas de um aluno os pesos 
referentes acada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada: 

Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3
                              peso1 + peso2 + peso3
Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
Média ponderada = 8.25
*/

public class Exercio17 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = leitor.nextDouble();

        double mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);

        System.out.printf("A média ponderada das notas é: %.2f\n", mediaPonderada);

        leitor.close();
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
    return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }

}
