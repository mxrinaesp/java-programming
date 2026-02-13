import java.util.Scanner;

public class EjercicioEntrada6 {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        s1 = sc.nextLine(); // para leer frases 
        s2 = sc.nextLine();
        s3 = sc.nextLine(); // escribirlas separadas con intro
        System.out.println("DATOS INSTRODUCIDOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close();
    }
}