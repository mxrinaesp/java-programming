package beecrowd.ex1046;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int duracao;
        
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (horaInicio > horaFim) {
            duracao = (24 - horaInicio) + horaFim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else {
            duracao = 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

        sc.close();
    }
}
