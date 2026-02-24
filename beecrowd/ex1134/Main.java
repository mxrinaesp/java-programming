package beecrowd.ex1134;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int combustivel, alcool, gasolina, diesel;
        combustivel = sc.nextInt();
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        //sea el número que sea(1, 3 u 8), el loop va a funcionar hasta que ponga 4, por eso != 4
        while (combustivel != 4) {
            switch (combustivel) {
            case 1:
                alcool++;
                break;
            case 2:
                gasolina++;
                break;
            case 3:
                diesel++;
                break;
            default:
                break;
            }            

            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
