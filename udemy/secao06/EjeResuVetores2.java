package udemy.secao06;

import java.util.Locale;
import java.util.Scanner;

public class EjeResuVetores2 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //declaración + instancia
        double[] vet = new double[N];

        //guardar y leer los elementos en el vector
        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }
 
        //imprimir el vector
        for (int i=0; i<N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        //somar los elementos del vector
        double soma = 0.0;
        for(int i=0; i<N; i++) {
            soma += vet[i];
        }

        System.out.printf("%.2f%n", soma);

        double media = soma / N;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
