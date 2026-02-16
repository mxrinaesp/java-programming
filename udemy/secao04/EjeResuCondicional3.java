package udemy.secao04;

import java.util.Scanner;

public class EjeResuCondicional3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // para averiguar cuál es el número menor, primero descartamos a; luego b; y lo que sobra es c.
        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        }
        else if (b < c) {
            System.out.println("MENOR = " + b);
        }
        else {
            System.out.println("MENOR = " + c);
        }

        sc.close();
    }
}