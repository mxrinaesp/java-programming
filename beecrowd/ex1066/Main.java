package beecrowd.ex1066;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, valor4, valor5, totalPar, totalImpar, totalPositivo, totalNegativo;
        valor1 = sc.nextInt(); 
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        valor4 = sc.nextInt();
        valor5 = sc.nextInt();
        totalPar = 0;
        totalImpar = 0;
        totalPositivo = 0;
        totalNegativo = 0;

        if (valor1 % 2 == 0) {
            totalPar += 1;
        }
        if (valor2 % 2 == 0) {
            totalPar += 1;
        }
        if (valor3 % 2 == 0) {
            totalPar += 1;
        }
        if (valor4 % 2 == 0) {
            totalPar += 1;
        }
        if (valor5 % 2 == 0) {
            totalPar += 1;
        }
        
        System.out.println(totalPar + " valor(es) par(es)");

        if (valor1 % 2 != 0) {
            totalImpar += 1;
        }
        if (valor2 % 2 != 0) {
            totalImpar += 1;
        }
        if (valor3 % 2 != 0) {
            totalImpar += 1;
        }
        if (valor4 % 2 != 0) {
            totalImpar += 1;
        }
        if (valor5 % 2 != 0) {
            totalImpar += 1;
        }
        
        System.out.println(totalImpar + " valor(es) impar(es)");

        if (valor1 > 0) {
            totalPositivo += 1;
        }
        if (valor2 > 0) {
            totalPositivo += 1;
        }
        if (valor3 > 0) {
            totalPositivo += 1;
        }
        if (valor4 > 0) {
            totalPositivo += 1;
        }
        if (valor5 > 0) {
            totalPositivo += 1;
        }
 
        System.out.println(totalPositivo + " valor(es) positivo(s)");

        if (valor1 < 0) {
            totalNegativo += 1;
        }
        if (valor2 < 0) {
            totalNegativo += 1;
        }
        if (valor3 < 0) {
            totalNegativo += 1;
        }
        if (valor4 < 0) {
            totalNegativo += 1;
        }
        if (valor5 < 0) {
            totalNegativo += 1;
        }

        System.out.println(totalNegativo + " valor(es) negativo(s)");

        sc.close();
    }
}
