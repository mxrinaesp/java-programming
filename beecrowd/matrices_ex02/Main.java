package beecrowd.matrices_ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = 0;
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
                vet[i] += mat[i][j];
            }
        }

        for (int i=0; i<N; i++) {
            System.out.println(vet[i]);
        }
        
        sc.close();
    }
}
