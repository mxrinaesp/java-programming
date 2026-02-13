package beecrowd.ex1017;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tiempo, velocidade;
        double qtdlitros;

        tiempo = sc.nextInt();
        velocidade = sc.nextInt();
        qtdlitros = (tiempo * velocidade) / (double) 12;

        System.out.printf("%.3f%n", qtdlitros);

        sc.close();
    }
}