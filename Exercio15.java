import java.util.Scanner;

/*15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), calcule e 
retorne a distância entre eles. 
A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20).
Distancia: 18,03*/

public class Exercio15 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = leitor.nextDouble();
        System.out.print("y1: ");
        double y1 = leitor.nextDouble();

        System.out.println("Insira as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = leitor.nextDouble();
        System.out.print("y2: ");
        double y2 = leitor.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f\n", distancia);

        leitor.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
