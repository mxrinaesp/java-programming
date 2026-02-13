package src.udemy.secao03;
import java.util.Scanner;

public class EjercicioEntrada3 {
    
    public static void main (String [] args) {
        //iniciar la entrada de datos (teclado)
        Scanner sc = new Scanner(System.in);

        double a;
        a = sc.nextDouble(); //para leer un números decimales
        System.out.println("Você digitou: " + a); //.printf("Você...%.4f%n", a) si quiero más decimales
        //escribir javac NombreArchivo.java y java NombreArchivo.java en terminal
        //escribir lo que queramos que reciba la a

        sc.close();
        //hacer sc.close() cuando no necesite más el objeto/instancia "sc"
    }
}