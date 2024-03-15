import java.util.Scanner;

/*12.Escreva um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido.*/

public class Exercio12 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int numero = 1;

        System.out.println("Informe um número para verificer o Mês correspondente: ");
        numero = leitor.nextInt();

        //while(numero != 0);

        switch (numero) {
            case 0:
                System.exit(numero);
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5: 
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês invalido");
        }

    }

}
