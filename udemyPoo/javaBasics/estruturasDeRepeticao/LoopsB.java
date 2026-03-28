package udemyPoo.javaBasics.estruturasDeRepeticao;

public class LoopsB {
    public static void main(String[] args) {
        
        // 8 - Loops com labels

            // label externa e interna

        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( i == 1 && j == 1) {
                    break externo;
                }

                System.out.println("i" + i + ", j" + j);
            }
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Externo: " + i);

            interno:
            for (int j = 0; j < 5; j++) {
                
                if (j == 2) {
                    System.out.println("Parou interno");
                    break interno;
                }

                System.out.println("i" + i + ", j" + j);
            }
        }

        // 9 - Off by one

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }


    }
}
