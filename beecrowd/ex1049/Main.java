package beecrowd.ex1049;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String palavra1, palavra2, palavra3;
        palavra1 = sc.nextLine();
        palavra2 = sc.nextLine();
        palavra3 = sc.nextLine();

        // al ser String, hay que poner "". Y el == en String es .equals("")
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                }

                if (palavra3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            }

            if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                }

                if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }

        if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                }

                if (palavra3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            }

            if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }

                if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}
