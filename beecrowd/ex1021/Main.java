package beecrowd.ex1021;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        // la var notas tiene que ser entera(hablamos de billetes), por eso casting (int) en el double N
        int nota100 = (int) N / 100;
        // el resto siempre igual, y es double porque N tiene centavos en decimales
        double resto = N % 100;

        int nota50 = (int) resto / 50;
        resto = resto % 50;

        int nota20 = (int) resto / 20;
        resto = resto % 20;

        int nota10 = (int) resto / 10;
        resto = resto % 10;

        int nota5 = (int) resto / 5;
        resto = resto % 5;

        int nota2 = (int) resto / 2;
        resto = resto % 2;

        //el resto * 100 porque son centavos y tengo que pasarlos a enteros, y el resto^ daba 0.73
        int moeda100 = (int) resto;
        resto = (resto % 1) * 100;

        int moeda50 = (int) resto / 50;
        resto = resto % 50;

        int moeda25 = (int) resto  / 25;
        resto = resto % 25;

        int moeda10 = (int) resto / 10;
        resto = resto % 10;

        int moeda5 = (int) resto / 5;
        resto = resto % 5;
        
        int moeda1 = (int) resto;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
