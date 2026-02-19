package beecrowd.ex1047;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracao, hora, minuto;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        int totalMinInicial = (horaInicial * 60) + minutoInicial;
        int totalMinFinal = (horaFinal * 60) + minutoFinal;
        duracao = totalMinFinal - totalMinInicial;

        // para que no dé error al pasar la medianoche en el 24h, hay que sumar 1440 que son los minutos en un día
        if (totalMinFinal <= totalMinInicial) {
            duracao = (totalMinFinal + 1440) - totalMinInicial;
        }

        hora = duracao / 60;
        duracao = duracao % 60;

        minuto = duracao;
        
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");

        sc.close();
    }
}
