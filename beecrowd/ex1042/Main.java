package beecrowd.ex1042;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, aux;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // para hacer el orden original de lectura
        int a2, b2, c2;
        a2 = a;
        b2 = b;
        c2 = c;

        // para ordenarlos de manera creciente
        if (a > c) {
            aux = c;
            c = a;
            a = aux;
        }

        if (b > c) {
            aux = c;
            c = b;
            b = aux;
        }

        if (a > b) {
            aux = b;
            b = a;
            a = aux;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        
        sc.close();
    }
}
