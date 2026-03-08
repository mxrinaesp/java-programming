package udemy.secao06;

import java.util.Scanner;

public class EstruForEach {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //declaración + instancia
        String[] nomes = new String[N];

        //guardar y leer los elementos en el vector
        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");

        //imprimir todos los elementos del vector nomes
        for (String n : nomes) {
            System.out.println(n);
        }

        sc.close();
    }
}
