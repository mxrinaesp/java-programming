package beecrowd.matrices_ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i=0; i<N; i++) {            
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<N; i++) {     
            //como vamos a buscar el mayor elemento de las líneas, mat[i][] para que sea bucle de líneas     
            int maior = mat[i][0]; //asumimos que el primer número de las líneas es el mayor;
            for (int j=1; j<N; j++) { //j=1 porque mat[i][0] ya sería la primera vuelta de j=0;
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }
        
        sc.close();
    }
}
