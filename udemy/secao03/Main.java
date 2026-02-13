package udemy.secao03;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        String nombre = "Maria";
        int edad = 31;
        double renta = 4000.0;

        System.out.println(y);
        System.out.println(x);

        // .printf para imprimir algo formatado y que acepte el %.2f y el x
        // "%.2f" o "%.4f" para redondear a 2 o 4 decimales
        // "\n" o "%n" para saltar de línea
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        // esto permite cambiar la coma del decimal por un punto
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);

        // para concatenar varios elementos en .print o .println usamos +
        System.out.println("RESULTADO = " + x + " METROS.");

        /* para concatenar varios elementos en .printf usamos 
        ("text %f text %f", variable1, variable2) */
        System.out.printf("RESULTADO = %.2f metros%n", x);

        /* y cuando hay variables diferentes, usamos los marcadores:
            %s para texto
            %d para enteros
            %f para decimales
            %n para saltar de línea */
        System.out.printf("%s tiene %d años y gana %.2f euros%n", nombre, edad, renta);
    }
}