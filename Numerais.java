import java.util.Scanner;
import java.text.DecimalFormat;

public class Numerais {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Definição do formato para 5 casas decimais
        DecimalFormat formatoDecimal = new DecimalFormat("0.00000");

        // Leitura dos valores de A, B e C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Cálculo da média ponderada
        double media = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        // Exibição do resultado com a formatação
        System.out.println("MEDIA = " + formatoDecimal.format(media));

        // Fechar o Scanner
        scanner.close();
    }
}
