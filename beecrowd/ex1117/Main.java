package beecrowd.ex1117;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota, soma, media;
        soma = 0;
        int qtdNotasValidas = 0;
        
        while (qtdNotasValidas < 2) {
            nota = sc.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                qtdNotasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        media = soma / 2;

        System.out.printf("media = %.2f%n", media);

        sc.close();
   }
}
