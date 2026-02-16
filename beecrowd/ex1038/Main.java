package beecrowd.ex1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int qtd = sc.nextInt();
    
        double conta;

        switch (item) {
        case 1:
            conta = 4.00;
            break;
        case 2:
            conta = 4.50;
            break;
        case 3:
            conta = 5.00;
            break;
        case 4:
            conta = 2.00;
            break;
        case 5:
            conta = 1.50;
            break;
        default:
            conta = 0.00;
            break;
        }

        double pagar = conta * qtd;

        System.out.printf("Total: R$ %.2f%n", pagar);

        sc.close();
    }
}
