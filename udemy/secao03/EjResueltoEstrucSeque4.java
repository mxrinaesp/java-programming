package udemy.secao03;
import java.util.Scanner;

public class EjResueltoEstrucSeque4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N, resto, horas, minutos, segundos;

        N = sc.nextInt();

        horas = N / 3600;
        resto = N % 3600; // el operador mod (%) devuelve el resto de una división
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
