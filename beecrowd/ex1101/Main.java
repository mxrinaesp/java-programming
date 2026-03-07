package beecrowd.ex1101;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        
        while (m > 0 && n > 0) {
            int soma = 0;

            if (m > n) {
                for (int i=n; i <= m; i++) {
                    System.out.print(i + " ");
                    soma+= i;
                }

                System.out.println("Sum=" + soma);
                
            } else {
                for (int i=m; i <= n; i++) {
                    System.out.print(i + " ");
                    soma+= i;
                }

                System.out.println("Sum=" + soma);

            }
            
            m = sc.nextInt();
            n = sc.nextInt();
        }

        sc.close();
    }
}
