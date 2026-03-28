/**
 * Ex 1: Somatório com for
 * 
 * Crie un programa que use um loop for para calcular o somatorio dos
 * numeros de 1 ate 100 e exiba o resultado
 * 
 * Ex 2: Impressao de numeros pares com while
 * 
 * Desemvolva um programa que use um loop while para imprimir 
 * todos os numeros pares de 1 a 20
 * 
 * Ex 3: Verificacao de numero primo con for
 * 
 * Escreva um programa que receba um numero do usuario
 * e use um loop for para verificar se ele é primo
 * 
 * Ex 4 : Menu interativo com do-while
 * 
 * Crie um programa que exiba um menu interativo usando do-while,
 * permitindo ao usuario escolher opçoes até que ele decida sair
 * 
 * Ex 5: Fatorial de um numero con for
 * 
 * Desenvolva um programa que calcule o fatorial de um numero inteiro positivo
 * usando um loop for
 * 
 * Ex 6: Contagem de digitos de um numero com while
 * 
 * Crie um programa que conte quantos digitos ha em um numero
 * inteiro positivo usando um loop while 
 */

package udemyPoo.javaBasics.estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ex 1
        int somatorio = 0;

        for (int i = 1; i <= 100; i++) {
            somatorio += i;
        }

        System.out.println("O somatorio de 1 a 100 é: " + somatorio);


        // Ex 2
        int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println("Número par: " + n);
            }

            n++;
        }
        

        // Ex 3
        
        System.out.println("Digite um número: ");
        int numPrimo = sc.nextInt();

        boolean isPrimo = true;
        for (int i = 2; i < numPrimo; i++) {
            if (numPrimo % i == 0)  {
                isPrimo = false;
                break;
            }
        }
        
        if (isPrimo) {
            System.out.println("O número " + numPrimo + " é primo.");
        } else {
            System.out.println("O número " + numPrimo + " não é primo.");
        }


        // Ex 4

        
        int escolhaUsuario;
        
        do {
            System.out.println("Escolha uma fruta:");
            System.out.println("1 - maçã");
            System.out.println("2 - banana");
            System.out.println("3 - mamão");
            System.out.println("4 - abacaxi");
            System.out.println("5 - sair");
            
            escolhaUsuario = sc.nextInt();


            System.out.println("Sua escolha foi: " + escolhaUsuario);

        } while (escolhaUsuario != 5);


        // Ex 5

        int numeroFatorial = 8;
        int fatorial = 1;
        
        for (int i = numeroFatorial; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);


        // Ex 6

        int numPositivo = 234569;
        int contador = 0;

        while (numPositivo != 0) { 
            numPositivo /= 10;

            contador++;
        }

        System.out.println("Número de digitos: " + contador);


        
        sc.close();
    }
}
