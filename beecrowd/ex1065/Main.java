package beecrowd.ex1065;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, valor4, valor5;
        int total = 0;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        valor4 = sc.nextInt();
        valor5 = sc.nextInt();

        // para ver si un número es par, su mod al dividir entre 2 debe dar 0
        if (valor1 % 2 == 0) {
            total += 1;
        }
        if (valor2 % 2 == 0) {
            total += 1;
        }
        if (valor3 % 2 == 0) {
            total += 1;
        }
        if (valor4 % 2 == 0) {
            total += 1;
        }
        if (valor5 % 2 == 0) {
            total += 1;
        }

        System.out.println(total + " valores pares");

        sc.close();
    }
}
