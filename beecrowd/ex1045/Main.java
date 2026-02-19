package beecrowd.ex1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, lado;
        A = sc.nextDouble(); 
        B = sc.nextDouble(); 
        C = sc.nextDouble(); 

        // la var auxiliar "lado" es como una cajita donde se guarda el contenido de A para no perderlo con el intercambio.
        // Luego es solo pasar la cantidad de B al A (que está vacía porque su contenido lo tiene lado), y el contenio de lado al B.
        if (B > A) {
            lado = A;
            A = B;
            B = lado;

        }
        if (C > A) {
            lado = A;
            A = C;
            C = lado;
        }
        if (C > B) {
            lado = B;
            B = C;
            C = lado;
        }
        

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (A * A == (B * B) + (C * C)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (A * A > (B * B) + (C * C)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (A * A < (B * B) + (C * C)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        //la condición del && siempre tiene que ir primero. Si pongo la ||, nunca llegará a la del &&.
        if (A == B && B == C && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}
