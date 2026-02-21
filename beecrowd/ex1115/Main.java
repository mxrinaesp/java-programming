package beecrowd.ex1115;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) { //no ponemos || porque V o F = V entonces el loop seguiría. Hay que usar && porque F y V = F para que pare

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            x = sc.nextInt(); // súper importante que no se me olvide poner esto para que no sea un loop infinito!!!
            y = sc.nextInt();

        }

        sc.close();
    }
}
