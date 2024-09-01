import java.util.Scanner;

public class Frangotech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoChip = 4.00;
        double custoAnelAlimento = 3.50;

        System.out.print("Informe o número de frangos: ");
        int numeroDeFrangos = scanner.nextInt();

        double custoTotalPorFrango = custoChip + (2 * custoAnelAlimento);
        double gastoTotal = numeroDeFrangos * custoTotalPorFrango;

        System.out.printf("O gasto total para marcar todos os frangos é: R$ %.2f\n", gastoTotal);
        
        scanner.close();
    }
}
