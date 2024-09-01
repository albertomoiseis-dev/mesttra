import java.util.Scanner;

public class SalarioINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário inicial do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();

        final double AUMENTO_PORCENTAGEM = 0.15; // 15%
        final double INSS_PORCENTAGEM = 0.11;    // 11%
        final double FGTS_PORCENTAGEM = 0.08;    // 8%

        double salarioAumentado = salarioInicial * (1 + AUMENTO_PORCENTAGEM);

        double descontoINSS = salarioAumentado * INSS_PORCENTAGEM;
        double descontoFGTS = salarioAumentado * FGTS_PORCENTAGEM;

        double salarioFinal = salarioAumentado - descontoINSS - descontoFGTS;

        double totalDescontos = descontoINSS + descontoFGTS;

        System.out.printf("Salário inicial: R$ %.2f\n", salarioInicial);
        System.out.printf("Salário após aumento: R$ %.2f\n", salarioAumentado);
        System.out.printf("Desconto de INSS: R$ %.2f\n", descontoINSS);
        System.out.printf("Desconto de FGTS: R$ %.2f\n", descontoFGTS);
        System.out.printf("Salário final após descontos: R$ %.2f\n", salarioFinal);
        System.out.printf("Total de descontos (INSS + FGTS): R$ %.2f\n", totalDescontos);

        scanner.close();
    }
}
