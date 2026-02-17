package beecrowd.ex1040;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1, N2, N3, N4, media;
        N1 = sc.nextDouble();
        N2 = sc.nextDouble();
        N3 = sc.nextDouble();
        N4 = sc.nextDouble();

        media = ((int) ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4)) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");
            
            double N5 = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", N5);

            double mediaFinal = (media + N5) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado."); 
            }
            else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        else if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
