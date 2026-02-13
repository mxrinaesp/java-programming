package beecrowd.ex1008;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, qtdHoras, NUMBER;
        double valorHoras, SALARY; 
        numFuncionario = sc.nextInt();
        qtdHoras = sc.nextInt();
        sc.nextLine();
        valorHoras = sc.nextDouble();
        NUMBER = numFuncionario;
        SALARY = qtdHoras * valorHoras;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);

        sc.close();
    }
}