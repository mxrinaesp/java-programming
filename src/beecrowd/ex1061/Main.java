package src.beecrowd.ex1061;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String comodin; // para cualquier palabra o simbolo que vaya a repetir

        comodin = sc.next(); // aquí es la palabra dia
        int diaInicio = sc.nextInt();

        int horaInicio = sc.nextInt();
        comodin = sc.next(); // aqui son :
        int minutoInicio = sc.nextInt();
        comodin = sc.next(); // aqui igual y así...
        int segundoInicio = sc.nextInt();

        comodin = sc.next();
        int diaFim = sc.nextInt();

        int horaFim = sc.nextInt();
        comodin = sc.next();
        int minutoFim = sc.nextInt();
        comodin = sc.next();
        int segundoFim = sc.nextInt();
        
        // me dan un día, unas horas, unos minutos y unos segundos; tengo que pasar todo a la menor unidad (segundos) y restar la diferencia
        int totalSegInicio = (diaInicio * 86400) + (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
        int totalSegFim = (diaFim * 86400) + (horaFim * 3600) + (minutoFim * 60) + segundoFim;
        int duracion = totalSegFim - totalSegInicio;

        int W = duracion / 86400;
        duracion = duracion % 86400;

        int X = duracion / 3600;
        duracion = duracion % 3600;

        int Y = duracion / 60;
        duracion = duracion % 60;

        int Z = duracion;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        sc.close();
    }
}