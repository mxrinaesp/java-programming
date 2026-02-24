package beecrowd.ex1118;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // es como un juego: si pulsas 1, repites el algoritmo de media, si pulsas 2, se cierra
        int x = 1;
        
        while (x != 2) {
            if (x == 1) {
                int qtdNotasValidas = 0;
                double media, nota, soma = 0;
        
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
            }

            System.out.println("novo calculo (1-sim 2-nao)");

            x = sc.nextInt();
        }

        sc.close();
    }
}
