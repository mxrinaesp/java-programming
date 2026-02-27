package udemy.secao05;

import java.util.Scanner;

public class EjeResuFor2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

        // como a veces x puede ser el número mayor o viceversa, es bueno crear esta variable
        int min, max;        
        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }

        // aquí nos aseguramos que no se incluyan los números x e y, y que solo se cuenten los impares
        for (int i=min+1; i<max; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
