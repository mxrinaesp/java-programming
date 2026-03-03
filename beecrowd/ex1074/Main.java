package beecrowd.ex1074;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            }

            if (x % 2 == 0 && x != 0) {
                System.out.print("EVEN ");
            } else if (x % 2 != 0) {
                System.out.print("ODD ");
            }

            if (x > 0) {
                System.out.println("POSITIVE");
            } else if (x < 0) {
                System.out.println("NEGATIVE");
            }
        }

        sc.close();
    }
}
