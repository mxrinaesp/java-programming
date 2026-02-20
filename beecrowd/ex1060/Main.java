package beecrowd.ex1060;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3, valor4, valor5, valor6;
        int total = 0;
    
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        valor3 = sc.nextDouble();
        valor4 = sc.nextDouble();
        valor5 = sc.nextDouble();
        valor6 = sc.nextDouble();

        // para sumar/restar cuánto valores hay, usamos +=/++ o -=/-- para sumar o resta 1 a la variable total
        if (valor1 > 0) {
            total += 1;
        }
        if (valor2 > 0) {
            total += 1;
        }
        if (valor3 > 0) {
            total += 1;
        }
        if (valor4 > 0) {
            total += 1;
        }
        if (valor5 > 0) {
            total += 1;
        }
        if (valor6 > 0) {
            total += 1;
        }

        System.out.println(total + " valores positivos");

        sc.close();
    }
}
