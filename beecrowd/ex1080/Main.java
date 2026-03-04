package beecrowd.ex1080;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        //estas son las variables de salida
        int posicao = 1;
        int maior = 0;
        
        for (int i=1; i<=100; i++) {
            int N = sc.nextInt();
            
            //esta condición pq tiene que ser número positivo
            //solo los números mayores entran en el if
            if (N > maior) {
                maior = N;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
