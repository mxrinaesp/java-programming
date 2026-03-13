package udemy.secao07;

import java.util.Locale;
import java.util.Scanner;

public class EjeResuMatrizes2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        double[][] numeros = new double[M][N];
        double[] vet = new double[M];

        for (int i=0; i<M; i++) {
            vet[i] = 0;
            for (int j=0; j<N; j++) {
                numeros[i][j] = sc.nextDouble();
                vet[i] += numeros[i][j];
            }
        }

        for (int i=0; i<M; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
