package src.beecrowd.ex1018;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int nota100 = N / 100; // 576 / 100 = 5
        int resto1 = N % 100; // 576 mod 100 = 76

        int nota50 = resto1 / 50; // 76 / 50 = 1
        int resto2 = resto1 % 50; // 76 mod 50 = 26

        int nota20 = resto2 / 20; // 26 / 20 = 1
        int resto3 = resto2 % 20; // 26 mod 20 = 6

        int nota10 = resto3 / 10; // 6 / 10 = 0
        int resto4 = resto3 % 10; // 6 mod 10 = 6

        int nota5 = resto4 / 5; // 6 / 5 = 1
        int resto5 = resto4 % 5; // 6 mod 5 = 1

        int nota2 = resto5 / 2; // 1 / 2 = 0
        int resto6 = resto5 % 2; // 1 mod 2 = 1

        int nota1 = resto6 / 1; // 1 / 1 = 1

        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}