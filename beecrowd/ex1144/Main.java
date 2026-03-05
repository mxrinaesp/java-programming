package beecrowd.ex1144;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i <= N; i++) {
            System.out.print(i + " ");

            int cuadrado = (int) Math.pow(i, 2);
            System.out.print(cuadrado + " ");

            int cubo = (int) Math.pow(i, 3);
            System.out.println(cubo);

            System.out.print(i + " ");

            int cuadrado2 = cuadrado + 1;
            System.out.print(cuadrado2 + " ");

            int cubo2 = cubo +1;
            System.out.println(cubo2);
        }

        sc.close();
    }
}
