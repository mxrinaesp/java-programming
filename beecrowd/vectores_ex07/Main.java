package beecrowd.vectores_ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        double[] notas1Semestre = new double[N];
        double[] notas2Semestre = new double[N];

        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
            notas1Semestre[i] = sc.nextDouble();
            notas2Semestre[i] = sc.nextDouble();
        }
        
        System.out.println("Alunos aprovados:");

        for (int i=0; i<N; i++) {
            if ((notas1Semestre[i] + notas2Semestre[i]) / 2 >= 6) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
