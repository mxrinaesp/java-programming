package beecrowd.ex1116;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            double resultado = (double) x / y;

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}
