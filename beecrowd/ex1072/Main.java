package beecrowd.ex1072;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int somaIntervalo1 = 0, somaIntervalo2 = 0;

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();

            if (x>=10 && x<=20) {
                somaIntervalo1 += 1;
            } else {
                somaIntervalo2 += 1;
            }
        }
        
        System.out.println(somaIntervalo1 + " in");
        System.out.println(somaIntervalo2 + " out");
        
        sc.close();
    }
}
