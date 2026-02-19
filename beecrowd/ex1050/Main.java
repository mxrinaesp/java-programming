package beecrowd.ex1050;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();

        /* if (codigo == 61) {
            System.out.println("Brasilia");
        }
        else if (codigo == 71) {
            System.out.println("Salvador");
        }
        else if (codigo == 11) {
            System.out.println("Sao Paulo");
        }
        else if (codigo == 21) {
            System.out.println("Rio de Janeiro");
        }
        else if (codigo == 32) {
            System.out.println("Juiz de Fora");
        }
        else if (codigo == 19) {
            System.out.println("Campinas");
        }
        else if (codigo == 27) {
            System.out.println("Vitoria");
        }
        else if (codigo == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        } */

        String lugar;

        switch (codigo) {
        case 61:
            lugar = "Brasilia";
            break;
        case 71:
            lugar = "Salvador";
            break;
        case 11:
            lugar = "Sao Paulo";
            break;
        case 21:
            lugar = "Rio de Janeiro";
            break;
        case 32:
            lugar = "Juiz de Fora";
            break;
        case 19:
            lugar = "Campinas";
            break;
        case 27:
            lugar = "Vitoria";
            break;
        case 31:
            lugar = "Belo Horizonte";
            break;
        default:
            lugar = "DDD nao cadastrado";
            break;
        }

        System.out.println(lugar);

        sc.close();
    }
}
