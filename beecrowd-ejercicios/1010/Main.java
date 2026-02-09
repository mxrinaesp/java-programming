import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        double valor1, valor2, valorTotal;

        codigo1 = sc.nextInt();
        qtd1 = sc.nextInt();
        sc.nextLine();
        valor1 = sc.nextDouble();
        sc.nextLine();
        codigo2 = sc.nextInt();
        qtd2 = sc.nextInt();
        sc.nextLine();
        valor2 = sc.nextDouble();
        valorTotal = (valor1 * qtd1) + (valor2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}