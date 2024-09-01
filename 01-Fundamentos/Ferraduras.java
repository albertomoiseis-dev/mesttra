import java.util.Scanner;

public class Ferraduras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de cavalos adquiridos: ");
        int quantidadeCavalos = scanner.nextInt();

        final int FERRADURAS_POR_CAVALO = 4;

        int totalFerraduras = quantidadeCavalos * FERRADURAS_POR_CAVALO;

        System.out.printf("Para equipar todos os cavalos, são necessárias %d ferraduras.\n", totalFerraduras);

        scanner.close();
    }
}
