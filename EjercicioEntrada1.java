import java.util.Scanner;

public class EjercicioEntrada1 {

    public static void main (String [] args) {
        //iniciar la entrada de datos (teclado)
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next(); //para leer una palabra
        System.out.println("Você digitou: " + x);
        //escribir javac NombreArchivo.java y java NombreArchivo.java en terminal
        //escribir lo que queramos que reciba la x


        sc.close();
        //hacer sc.close() cuando no necesite más el objeto/instancia "sc"
    }
}