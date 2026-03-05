package beecrowd.ex1142;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ultimo = N * 4;

        for (int i=1; i <= ultimo; i++) {

            if (i % 4 == 0) {
                System.out.printf("PUM%n");
            } else {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
