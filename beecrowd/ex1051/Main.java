package beecrowd.ex1051;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;
        salario = sc.nextDouble();

        imposto = 0;

        // como hay que ir sumando los impuestos por tramos, hay que empezar por el trecho más alto
        if (salario > 4500) {
            imposto += (salario - 4500) * 0.28; // impuesto + diferencia de salario desde el tramo bc tiene que ser mayor ej:5200 * impuesto
            salario = 4500; // así se quedaría el salario para el siguiente tramo
        }

        if (salario > 3000) {
            imposto += (salario - 3000) * 0.18;
            salario = 3000;
        }

        if (salario > 2000) {
            imposto += (salario - 2000) * 0.08;
            salario = 2000;
        }

        if (imposto == 0) { // si no hay impuesto, está absento
            System.out.println("Isento");
        }
        else { // si sí, se calcula 
            System.out.printf("R$ %.2f%n", imposto);
        }            

        sc.close();
    }
}
