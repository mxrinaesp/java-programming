package udemyPoo.javaBasics.estruturasDeRepeticao;

public class Loops {
    public static void main(String[] args) {
        
        // 1 - For

            // loop que vai rodar de 1 a 5

            // var inicialização = i, j ...
            // condição -> determina até quando o quantas vezes o loop vai rodar
            // incremento -> a variavel vai chegar na condição
            for (int i = 1; i <= 5; i++) {
                System.out.println("Contador: " + i);
            }

            // cada caractere de uma string

            // em arrays e strings, a primeira posição é 0 -> J (0), A (1), V (2), A (3)
            String palavra = "Java";
            for (int i = 0; i < palavra.length(); i++) {
                System.out.println("Caractere: " + palavra.charAt(i));
            }

            // contagem regressiva
            for (int i = 4; i > 0; i--) {
                System.out.println("Contador: " + i);
            }

        // 2 - While

        int j = 0;
        while (j <= 5) {
            System.out.println("While contador: " + j);
            j++;
        }

        int valor = 0;
        while (valor != 7) {
            // Math.random() * x -> vai mostrar números random até o número x 
            valor = (int) (Math.random() * 10);
            System.out.println("Valor aleatorio: " + valor);
        }

        // 3 - Loop infinito
        
        /* while (true) {
            System.out.println("Infinito!");
        } */
 
        /* for (int i = 0; i <= 5; i--){
            System.out.println(i);
        } */


        // 4 - Do while

        int i = 10;

        do {
            System.out.println("O valo de i é: " + i);

            i--;
        } while (i > 0);

        // 5 - Break

            // break pode ser utilizado com qualquer estrutura de loop

        for (int x = 0; x <= 10; x++) {
            System.out.println("O valor de x é: " + x);

            if (x == 5) {
                System.out.println("Parando o loop!");
                // isso aqui pula completamente a ação do for 
                break;
            }
        }

        // 6 - Continue

        for (int x = 10; x > 0; x--) {

            if (x % 2 == 0) {
                System.out.println("par!");
                continue;
            }

            // quando ele pula por o continue, isso aqui não executa y volta para o inicio do for
            System.out.println("Contador: " + x);
        }

        // 7 - Nested loops -> usado em matrizes

        for (int m = 1; m <= 3; m++) {
            System.out.println("Externo!!");

            for (int n = 1; n <= 3; n++) {
                System.out.println(m + "x" + n + " = " + (m * n));
            }
        }

        // Padrão de estrelas

        for (int r = 1; r <= 5; r++) {
            for (int s = 1; s <= r; s++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }
    
}
