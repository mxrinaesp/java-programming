package udemy.secao05;

import java.util.Scanner;

public class EstruRepeFor {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N es el número de repeticiones que haremos

        int soma = 0;

        // i va a ayudar a hacer el contaje de repeticiones 
        for (int i=0; i<N; i++) {
            int x = sc.nextInt(); // x es el valor de cada repetición
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}
