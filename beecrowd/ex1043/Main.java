package beecrowd.ex1043;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, perimetro, area;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            area = (A + B) / 2 * C;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
