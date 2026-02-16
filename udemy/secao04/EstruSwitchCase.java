package udemy.secao04;

import java.util.Scanner;

public class EstruSwitchCase {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        //funciona como una cadena de if else if. 
        switch (x) {
        case 1: // sería lo mismo que x = 1; podía ser una palabra también
            dia = "domingo";
            break;
        case 2:
            dia = "segunda";
            break;
        case 3:
            dia = "terca";
            break;
        case 4:
            dia = "quarta";
            break;
        case 5:
            dia = "quinta";
            break;
        case 6:
            dia = "sexta";
            break;
        case 7:
            dia = "sabado";
            break;
        default:
            dia = "valor invalido";
            break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
