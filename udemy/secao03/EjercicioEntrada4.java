package udemy.secao03;
import java.util.Scanner;

public class EjercicioEntrada4 {
    
    public static void main (String [] args) {
        //iniciar la entrada de datos (teclado)
        Scanner sc = new Scanner(System.in);

        char b;
        b = sc.next().charAt(0); //para leer un caracter
        System.out.println("Você digitou: " + b);
        //escribir javac NombreArchivo.java y java NombreArchivo.java en terminal
        //escribir lo que queramos que reciba la b

        sc.close();
        //hacer sc.close() cuando no necesite más el objeto/instancia "sc"
    }
}