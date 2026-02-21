package udemy.secao05;

import java.util.Locale;
import java.util.Scanner;

public class EjeResuWhile2 {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma, qtd;
        idade = sc.nextInt();
        soma = 0;
        qtd = 0;
        
        if (idade >= 0) {
            while (idade >= 0) {
                soma += idade;
                qtd++;
                idade = sc.nextInt();
            }
            
            double media = (double) soma / qtd;
            System.out.printf("%.2f%n", media);
            
        } else {
            System.out.println("impossivel calcular");
        }

        sc.close();
    }
}
