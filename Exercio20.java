import java.util.Scanner;

/*20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem, 
utilizando um automóvel que faz 12km por 
litro e considerando que sãofornecidos o tempo em hora e a velocidade média da viagem. */

public class Exercio20 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Double tempogastoemnaviagem;
        Double velocidademedia;
        Double distancia;
        Double litros_usados;

        System.out.println("Informe o tempo gasto na viagem ");
        tempogastoemnaviagem = leitor.nextDouble();

        System.out.println("Informe a velocidade média");
        velocidademedia = leitor.nextDouble();

        distancia = tempogastoemnaviagem * velocidademedia;

        litros_usados = (distancia / 12);

        System.out.println("A distancia percorrida é: " + distancia);
        System.out.println("A quantidade de litros ultilizados é: " + litros_usados);
        
    }

}
