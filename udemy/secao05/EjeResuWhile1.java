package udemy.secao05;

import java.util.Scanner;

public class EjeResuWhile1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            x = sc.nextInt(); // siempre poner las variables antes de cerrar el while para que vuelva a la condición y se mantenga el loop
            y = sc.nextInt();
        }

        sc.close();
    }
}