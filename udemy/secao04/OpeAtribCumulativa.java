package udemy.secao04;

import java.util.Locale;
import java.util.Scanner;

public class OpeAtribCumulativa {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double plano = 50.0;

        if (minutos > 100) {
            plano += (minutos - 100) * 2.0;
        }
        
        System.out.printf("Valor a pagar: R$ %.2f%n", plano);

        sc.close();
    }
}
