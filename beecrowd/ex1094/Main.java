package beecrowd.ex1094;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        
        for (int i=0; i<N; i++) {
            int qtd = sc.nextInt();
            char tipo = sc.next().charAt(0);
            
            totalCobaias += qtd;
            
            if (tipo == 'C') {
                totalCoelhos += qtd;
            } else if (tipo == 'R') {
                totalRatos += qtd;
            } else if (tipo == 'S') {
                totalSapos += qtd;
            }
        }
        
        //poner el double solo en el dividendo para que no se redondee a 0 el resultado
        double percentualCoelhos = ((double) totalCoelhos / totalCobaias) * 100.0;
        double percentualRatos = ((double) totalRatos / totalCobaias) * 100.0;;
        double percentualSapos = ((double) totalSapos / totalCobaias) * 100.0;
        
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

        sc.close();
    }
}
