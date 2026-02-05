import java.util.Scanner;

public class EjercicioEntrada5 {
    
    public static void main (String [] args) {
        //iniciar la entrada de datos (teclado)
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next(); //para leer datos diferentes
        y = sc.nextInt();
        z = sc.nextDouble(); // escribirlos separados con espacios
        System.out.println("Datos introducidos: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //escribir javac NombreArchivo.java y java NombreArchivo.java en terminal
        //escribir lo que queramos que reciba las variables

        sc.close();
        //hacer sc.close() cuando no necesite más el objeto/instancia "sc"
    }
}