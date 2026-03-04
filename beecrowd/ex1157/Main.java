package beecrowd.ex1157;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        //i empieza en 1 y tiene que llegar hasta igualar N (<=);
        for (int i=1; i<=N; i++) {
            // son divisores si al ir dividiendo el resto, da 0;
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
