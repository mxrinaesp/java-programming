/**
 * Ex 1: Inverter elementos de um array
 * 
 * Crie um programa que receba um array de inteiros do usuario
 * e inverta a ordem dos elementos. Exiba o array original e o invertido
 * 
 * Ex 2: Encontrar o elemento mais frequente em um array
 * 
 * Desenvolva um programa que receba um array de inteiros e determine
 * qual elemento aparece com maior frequencia. Caso haja empate, exiba
 * todos os elementos empatados
 * 
 * Ex 3: Transpor uma matriz 2D
 * 
 * Crie um programa que receba uma matriz 2D e crie a matriz transposta
 * (troca de linhas por colunas). Exiba a matriz original e a transposta.
 * 
 * Ex 4: Substituir valores em um array com condição
 * 
 * Escreva um programa que receba um array de inteiros e substitua
 * todos os valores negativos por zero. Exiba o array antes e depois da modificação
 * 
 * Ex 5: Remover elementos duplicados de um array
 * 
 * Desenvolva um programa que remova os elementos duplicados de um
 * array de inteiros, mantendo apenas a primeira ocorrência de cada valor.
 * Exiba o array original e o array sem duplicatas.
 */

package udemyPoo.javaBasics.arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {

        // Ex 1: Inverter elementos de um array

        int[] arrayOriginal = {1, 2, 3, 4};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));


        // Ex 2: Encontrar o elemento mais frequente em um array
        int[] arrayInteiros = {1, 2, 2, 3, 4, 4, 4, 5, 6};

        int numFrequente = arrayInteiros[0];
        int maxContagem = 1;

        // esse loop vai contar quantas vezes o numero aparece
        for(int i = 0; i < arrayInteiros.length; i++) {
            int contagem = 0;

            for(int j = 0; j < arrayInteiros.length; j++) {
                if(arrayInteiros[j] == arrayInteiros[i]) {
                    contagem++;
                }
            }

            if(contagem > maxContagem) {
                maxContagem = contagem;
                numFrequente = arrayInteiros[i];
            }
        }
        System.out.println("O numero mais frequente é: " + numFrequente);


        // Ex 3: Transpor uma matriz 2D
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
        };

        int[][] matrizTransposta = new int[matrizOriginal[0].length][matrizOriginal.length];

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }

        for(int i = 0; i < matrizOriginal.length; i++) {
            for(int j = 0; j < matrizOriginal[0].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }


        // Ex 4: Substituir valores em um array com condição
        int[] arrayNovo = {-1, 1, -2, 2, -3, 3};

        System.out.println(Arrays.toString(arrayNovo));

        for(int i = 0; i < arrayNovo.length; i++) {
            if(arrayNovo[i] < 0) {
                arrayNovo[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arrayNovo));


        // Ex 5: Remover elementos duplicados de um array
        int[] arrayComDuplicados = {1, 1, 2, 3, 4, 4, 5, 6}; 

        // array numerico sem qtd de elementos definida
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>();

        for(int numero : arrayComDuplicados) {
            if(!arraySemDuplicados.contains(numero)) {
                arraySemDuplicados.add(numero);
            }
        }
        System.out.println(Arrays.toString(arrayComDuplicados));
        System.out.println(arraySemDuplicados);
    }
    
}

/* Desenvolva um programa que remova os elementos duplicados de um
 * array de inteiros, mantendo apenas a primeira ocorrência
 * de cada valor. Exiba o array original e o array sem duplicatas.*/