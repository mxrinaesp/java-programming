package src.beecrowd.ex1010;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd1, qtd2;
        double valor1, valor2, valorTotal;

        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();
        valorTotal = (valor1 * qtd1) + (valor2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}