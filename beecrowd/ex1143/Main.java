package beecrowd.ex1143;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");

            int potencia = (int) Math.pow(i, 2);
            System.out.print(potencia + " ");

            int potencia2 = (int) Math.pow(i, 3);
            System.out.println(potencia2);
        }

        sc.close();
    }
}
