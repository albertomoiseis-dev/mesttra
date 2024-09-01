import java.util.Scanner;
public class Imobiliaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a frente do terreno em metros: ");
        double frente = scanner.nextDouble();

        System.out.print("Informe a lateral do terreno em metros: ");
        double lateral = scanner.nextDouble();

        System.out.print("Informe o valor do metro quadrado: R$ ");
        double valorMetroQuadrado = scanner.nextDouble();


        double area = frente * lateral;

        double valorVenda = area * valorMetroQuadrado;

        System.out.printf("A área do terreno é: %.2f metros quadrados\n", area);

        System.out.printf("O valor de venda do terreno é: R$ %.2f\n", valorVenda);

        scanner.close();
    }
}

