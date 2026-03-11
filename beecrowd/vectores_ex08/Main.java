package beecrowd.vectores_ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        double menorAltura = 4;
        double maiorAltura = 0;
        double somaMulheres = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i=0; i<N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (sexo[i] == 'F') {
                qtdMulheres++;
                somaMulheres += altura[i];
            }

            if (sexo[i] == 'M') {
                qtdHomens++;
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (somaMulheres / qtdMulheres));
        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }
}
