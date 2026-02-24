package beecrowd.ex1159;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x, soma;
        x = sc.nextInt();

        while (x != 0) {
            if (x % 2 != 0) {
                x++;
            }

            soma = 5 * x + 20;

            System.out.println(soma);

            x = sc.nextInt();
        }

        sc.close();
    }
}
