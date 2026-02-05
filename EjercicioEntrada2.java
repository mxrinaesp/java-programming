import java.util.Scanner;

public class EjercicioEntrada2 {
    
    public static void main (String [] args) {
        //iniciar la entrada de datos (teclado)
        Scanner sc = new Scanner(System.in);

        int y;
        y = sc.nextInt(); //para leer un número entero
        System.out.println("Você digitou: " + y);
        //escribir javac NombreArchivo.java y java NombreArchivo.java en terminal
        //escribir lo que queramos que reciba la y

        sc.close();
        //hacer sc.close() cuando no necesite más el objeto/instancia "sc"
    }
}