package udemy.secao05;

import java.util.Scanner;

public class EstruRepeWhile {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int suma = 0;

        while (x != 0) {
            suma = suma + x; //si la condición se cumple, y partiendo de 0, va a sumar todos los numeros que yo escriba hasta que ponga 0 y pare.
            x = sc.nextInt();
        }

        System.out.println(suma);

        sc.close();
    }
}
