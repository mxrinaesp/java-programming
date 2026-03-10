package beecrowd.vectores_ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++){
            vet[i] = sc.nextInt();
        }

        int qtdpares = 0;
        for (int i=0; i<N; i++) {
            if (vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
                qtdpares++;
            }
        }
        System.out.println();
        
        System.out.println(qtdpares);

        sc.close();
    }
}
