import java.util.Scanner;
public class SalarioMinimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Informe o valor do salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário ganha o equivalente a %.2f salários mínimos.\n", quantidadeSalariosMinimos);

        scanner.close();
    }
}
