package src.udemy.secao03;
import java.util.Locale;
import java.util.Scanner;

public class EjResueltoEstrucSeque1 {

    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double anchura, largura, metroCuadrado, area, precio; //puedo poner double delante de cada variable para ahorrar espacio también
        anchura = sc.nextDouble();//ese sc.nextDouble() VIP!! el programa tiene que leer!!!!!
        largura = sc.nextDouble();
        metroCuadrado = sc.nextDouble();// poner los números en el terminal después de escribir todo el código
        area = anchura * largura;
        precio = area * metroCuadrado;
        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Precio del terreno = %.2f%n", precio);

        sc.close();
    }
}