package src.udemy.secao03;
public class EjercicioAtribuicao {
    public static void main (String [] args) {
        /*
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = a / b;

        System.out.println(resultado);

        // El resultado recibe 2.0 porque las variables a y b son números enteros. MAL. 
        */

        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b;

        System.out.println(resultado);

        //Hacemos casting (convertir un tipo de dato en otro) al poner double entre paréntesis para que el resultado sea decimal 2.5. BIEN.
    }
}