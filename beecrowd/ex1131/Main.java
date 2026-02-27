package beecrowd.ex1131;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int qtdGrenais = 0, 
            vitoriaInter = 0, 
            vitoriaGremio = 0, 
            empate = 0, 
            x = 1;

        while (x != 2) {
            if (x == 1) {
                int qtdGolsInter = sc.nextInt();
                int qtdGolsGremio = sc.nextInt();

                if (qtdGolsInter > qtdGolsGremio) {
                    vitoriaInter++;
                } else if (qtdGolsInter < qtdGolsGremio) {
                    vitoriaGremio++;
                } else {
                    empate++;
                }

                qtdGrenais++;
            }
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            
            x = sc.nextInt();
        }
        
        System.out.println(qtdGrenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        
        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }

        if (vitoriaInter == vitoriaGremio) {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}