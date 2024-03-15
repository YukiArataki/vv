import java.util.Scanner;

/*6.Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é: F = (9 * C + 160) /5 */

public class Exercio6 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);
        double Celsius, Fahrenheit;

        System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");

        System.out.println("Digite a temperatura em Celsius: ");
        Celsius = leitor.nextDouble();

        Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.print("\n A media convertida é " + Fahrenheit + "ºF\n");
    }

}
