/**
 * 1 - Importar Scanner
 * 
 * 2 - Definir palavra secreta: criar uma variavel palavraSecreta com a palavra
 * a ser adivinhada e inicializar um array palavraOculta com caracteres de sublinhado _
 * para representar a palavra oculta
 * 
 * 3 - Configurar tentativas: definir o numero máximo de tentativas e uma variável
 * para verificar se o usuario venceu.
 * 
 * 4 - Loop principal: criar um loop que continua enquanto houver tentativas restantes;
 * 
 * 5 - Exibir status: mostrar a palavra oculta e o numero de tentativas restantes.
 * Solicitar a entrada o usuario para uma letra.
 * 
 * 6 - Verificar letra: comparar a letra inserida com a palavra secreta.
 * Atualizar a palavra oculta se a letra for correta.
 * Diminuir o numero de tentativas se a letra for incorreta.
 * 
 * 7 - Verificar vitoria: verificar se a palavra oculta corresponde a palavra secreta e sair do loop
 * se o usuario vencer.
 * 
 * 8 - Finalizar jogo:  exibir mensagem  de vitoria ou derrota e mostrar a palavra secreta.
 * 
 * 9 - Fechar Scanner
 */


package udemyPoo.javaBasics.jogoDaForca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palavraSecreta = {"p", "o", "r", "t", "a"};

        String[] palavraOculta = new String[] {"_", "_", "_", "_", "_"};

        int tentativasMax = 6;

        boolean isWinner = false;
        
        while (tentativasMax > 0) {
            
            System.out.println(Arrays.toString(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativasMax);

            System.out.print("Digite uma letra: ");
            String letra = sc.nextLine();

            boolean letraCorreta = false;

            for (int i = 0; i < palavraSecreta.length; i++) {
                if (palavraSecreta[i].equals(letra)) {
                    palavraOculta[i] = letra;
                    letraCorreta = true;
                }
            }
            
            if (Arrays.equals(palavraSecreta, palavraOculta)) {
                isWinner = true;
                tentativasMax = 0;
            }

            if (!letraCorreta) {
                tentativasMax--;
            }
        }

        if (isWinner) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        System.out.println(Arrays.toString(palavraSecreta));

        sc.close();
    }
}
