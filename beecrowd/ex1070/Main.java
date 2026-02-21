package beecrowd.ex1070;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x, total;
        x = sc.nextInt();
        total = x;

        // me pide los números impares, por eso el total ++/+= 1 para que, si x es par, se le sume 1 y dé impar
        if (x % 2 == 0) {
            total++;
        }

        System.out.println(total);
        total += 2; // aquí es += 2 porque los impares van a cada dos. Si fuese += 1, sería un número par (ej: 9+2=11;;9+1=10)
        System.out.println(total);
        total += 2;
        System.out.println(total);
        total += 2;
        System.out.println(total);
        total += 2;
        System.out.println(total);
        total += 2;
        System.out.println(total);

        sc.close();
    }
}
