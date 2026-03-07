package beecrowd.ex1158;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;

            //aquí es para poner todos los pares en impares
            if (x % 2 == 0) {
                x = x + 1;                            
            }
            
            //aquí para repetir y veces el número x
            for (int j = 0; j < y; j++) {
                soma += x;//sumamos el número x
                x = x + 2;//y antes de volver al bucle, sumamos 2 porque son impares
            }

            System.out.println(soma);
        }

        sc.close();
    }
}
