package udemyPoo.javaBasics.arrays;

import java.util.Arrays;

public class Listas2D {
    public static void main(String[] args) {
        // 9 - Arrays 2D ou Matrizes
        // [[1, 2], [3, 4]] -- o num 2 -> array[0][1]
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matriz[1][2]);

        // criando matriz vazia e preenchendo
        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for(int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }

        //para preencher todos os elementos, preciso de um loop aninhado
        int[][] grade = new int[4][5];

        for(int i = 0; i < grade.length; i++) {
            for(int j = 0; j < grade[i].length; j++) {
                grade[i][j] = i * j;
            }
        }

        for(int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
