package udemy.secao05;

import java.util.Locale;
import java.util.Scanner;

public class EstruRepeDoWhile {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32;
        System.out.printf("Equivalente en Fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();
    }
}
