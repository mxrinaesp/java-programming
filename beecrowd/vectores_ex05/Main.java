package beecrowd.vectores_ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        int soma = 0;
        int qtdpares = 0;
        for (int i=0; i<N; i++) {
            if (vet[i] % 2 == 0) {
                soma+= vet[i];
                qtdpares++;
            }
        }
        double media = (double) soma / qtdpares;
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
