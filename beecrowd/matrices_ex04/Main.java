package beecrowd.matrices_ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];
        int soma = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();

                if (j > i) { //mat[i][i] es la diagonal, enotnces los j mayores son los de encima
                    soma += mat[i][j];
                }
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
