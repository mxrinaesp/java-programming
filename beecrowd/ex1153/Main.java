package beecrowd.ex1153;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1; // multiplicaciones acumuladas siempren empiezan en 1 porque sino N * 0 = 0;
        
        for (int i=1; i<=N; i++) {            
            fatorial *= i; // para que sea acumulativo, hay que multiplicar por el nuevo actual, o sea, i;
        }

        System.out.println(fatorial);
        
        sc.close();
    }
}
