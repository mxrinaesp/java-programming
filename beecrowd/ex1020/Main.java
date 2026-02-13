package beecrowd.ex1020;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade / 365;
        int resto1 = idade % 365;

        int mes = resto1 / 30;
        int resto2 = resto1 % 30;
        
        int dia = resto2;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
