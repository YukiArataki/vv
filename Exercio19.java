import java.util.Scanner;

/*19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume 
calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura; Exemplo: raio = 10, altura = 15. 
Volume = 4710 */

public class Exercio19 {

    public static void executar(){
        
        Scanner leitor = new Scanner(System.in); 

        Double volume;
        Double v = 3.14;
        Double r;
        Double altura;

        System.out.println("Informe o raio da circuferencia");
        r = leitor.nextDouble();

        System.out.println("Informe a altura");
        altura = leitor.nextDouble();

        volume = v * (r * r) * altura;

        System.out.println("O valor do volume de lata de óleo é" + volume);
    }

}
