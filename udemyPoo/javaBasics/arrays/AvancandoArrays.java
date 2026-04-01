package udemyPoo.javaBasics.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class AvancandoArrays {
    public static void main(String[] args) {
        
        // 1 - Ordenação

        // ordenação array de inteiros
        int[] numbers = {3, 4, 2, 5, 1, 7, 6};

            // modifica o array original
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // ordenação com comparator
        String[] names = {"Lucas", "Marina", "Belén", "Alba"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        // ordenação de matriz
        int[][] matriz = {
            {4, 8, 1},
            {3, 5, 9},
            {2, 3, 1}
        }; 

            // ordenação de linhas por um valor de coluna a[0], a[1] ou a[2]
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        // imprimir matriz sem for-each
        System.out.println(Arrays.deepToString(matriz));


        // 2 - Manipulação avançada

        // copia
        int[] original = {1, 2, 3, 4};

            //o array e o números de elementos que queremos copiar
        int[] copia = Arrays.copyOf(original, 3);

        System.out.println(Arrays.toString(copia));

        // fill - preenchimento
        int[] numeros = new int[5];
            // todos os elementos sao 0 porque criamos ele mas nao enchemos
        System.out.println(Arrays.toString(numeros));

    
        Arrays.fill(numeros, 2);
            //todos os elementsoa gora sao 2
        System.out.println(Arrays.toString(numeros));

        // transformação de arrays to stream
        int[] values = {1, 2, 3, 4, 5, 6};

            // fazer uma soma dos elementos
        int sum = Arrays.stream(values).sum();

        System.out.println(sum);


        // arrays dinámicos
        ArrayList<String> frutas = new ArrayList<>();
        System.out.println(frutas);

        frutas.add("Mamão");
        frutas.add("Jaca");
        frutas.add("Morango");

        System.out.println(frutas);

        frutas.remove("Jaca");

        System.out.println(frutas);
        
    }
}
