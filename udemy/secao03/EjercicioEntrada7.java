package udemy.secao03;
import java.util.Scanner;

public class EjercicioEntrada7 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        x = sc.nextInt(); //al escribir un comando diferente a nextLine(), este nextInt se come un espacio que correspondería al s3
        sc.nextLine(); //añadir esto extra antes del siguiente nextLine para solucionarlo
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DATOS INTRODUCIDOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
