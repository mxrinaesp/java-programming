package beecrowd.ex1064;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3, valor4, valor5, valor6, media;
        double suma = 0;
        int total = 0;
    
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        valor3 = sc.nextDouble();
        valor4 = sc.nextDouble();
        valor5 = sc.nextDouble();
        valor6 = sc.nextDouble();

        // para hacer media, hay que sumar los valores positivos igual que hemos sumado el total de valores positivos, usando suma +=/++
        if (valor1 > 0) {
            total += 1;
            suma += valor1;
        }
        if (valor2 > 0) {
            total += 1;
            suma += valor2;
        }
        if (valor3 > 0) {
            total += 1;
            suma += valor3;
        }
        if (valor4 > 0) {
            total += 1;
            suma += valor4;
        }
        if (valor5 > 0) {
            total += 1;
            suma += valor5;
        }
        if (valor6 > 0) {
            total += 1;
            suma += valor6;
        }
        
        media = suma / total;

        System.out.println(total + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
