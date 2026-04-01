package udemyPoo.javaBasics.arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        
        // 1 - Sintaxe dos arrays
        //tipo[] nomeArray = {valores}
            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println("Acessando primeiro elemento: " + numeros[0]);


            double[] precos = {1.99, 2.45, 4.97};

            precos[2] = 5.0;

            System.out.println(precos[2]);
        
        
        //tipo[] nomeArray = new tipo[tamanho]
            String[] frutas = new String[3]; // o [3] significa que tem 3 elementos, não que existe até o índice 3

            frutas[0] = "Maçã";
            frutas[1] = "Banana";
            frutas[2] = "Mamão";

            System.out.println(frutas[2]);

            //frutas[3] = "teste"; deu erro pq isso aquí sería String[4] mas já declarei que era String[3]



        // 2 - Loops em arrays
        
            //somar elementos de um array -> acessar todos eles e salvar a soma deles em uma variável
            int soma = 0;
            
            //usamos o array de numeros do início
            for(int i = 0; i < numeros.length; i++) {

                // i > 0; i > 1; i > 2...
                // numeros[i] = numeros[0] => 1
                soma += numeros[i];
            }
            System.out.println("Soma dos elementos: " + soma);


            // for each
                // Nomear o item => Array
                // Pessoa => Pessoas
                // Fruta => Frutas
            for(String fruta : frutas) {
                System.out.println("A fruta da vez: " + fruta);
            }

            // encontrar o maior valor de um array
            int[] valores = {10, 25, 811, 22, 1};

            // crio uma var que comence com o primeiro elemento do array
            int maiorValor = valores[0];
            // a var que vai girando
            int j = 0;

            while(j < valores.length) {
                if(valores[j] > maiorValor) {
                    maiorValor = valores[j];
                }

                j++;
            }
            System.out.println("O maior valor é: " + maiorValor);

        
        // 3 - For each
        // for(tipo variavel individual: array) {}
        for(int numero : numeros) {
            System.out.println("O número é: " + numero);
        }

        // concatenar elementos de um array
        String[] palavras = {"Java", "é", "bom!"};

        String frase = "";

        for(String palavra : palavras) {
            frase += palavra + " ";
        }
        System.out.println(frase);

        // verificar se valor está presente em array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for(char letra : letras) {
            if(letra == letraProcurada) {
                System.out.println("Encontramos a letra: " + letra);
                break;
            }
        }

        // 4 - Loops com if

            // filtrar e somar numeros pares
        int somaPares = 0;

        for(int numero : numeros) {

            if(numero % 2 == 0) {
                somaPares += numero;
            }

        }
        System.out.println("Soma pares: " + somaPares);

            // exhibir valores maiores que um determinado valor
        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > limite) {
                System.out.println("Número maior encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "C", "Python", "PHP"};

        String linguagemAlvo = "Python";

        for(String linguagem : linguagens) {

            if(linguagemAlvo == linguagem) {
                System.out.println("Linguagem encontrada. Parando o loop!");
                break;
            } else {
                System.out.println("Linguagem ainda não encontrada");
            }
        }

        // 5 - Atualizar valores

        for(int i = 0; i < numeros.length; i++) {

            numeros[i] *= 2;

        }
        System.out.println(numeros[1]);

        for(int numero : numeros) {
            System.out.println("Numero dobrado: " + numero);
        }


        numeros[2] = 100;
        System.out.println(numeros[2]);


        for(int i = 0; i < frutas.length; i++) {

            if(frutas[i].equals("Maçã")) {
                frutas[i] = "Abacate";
            }
        }
        System.out.println(frutas[0]);


        // 6 - Método toString -- permite ver o conteúdo do array sem precisar fazer um loop

        // clases no Java que vão ter métodos utilitários, o Arrays é uma delas e tem que ser importada
        String dadosNumericos = Arrays.toString(numeros);
        System.out.println(dadosNumericos);

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas);

        int[] teste = new int[3];
        System.out.println(Arrays.toString(teste));
        // para matrizes: System.out.println(Arrays.deepToString(matriz));


        // 7 - Adicionando novos items a arrays
            // opção 1: criando um novo array maior e copiando os elementos
        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 4; // o -1 acessa o último índice do array
        System.out.println(Arrays.toString(novoArray));

            // opção 2: utilizando o arraycopy para copiar os elementos
        String[] novoFrutas = new String[frutas.length + 1];
        //vou copiar o array inicial, desde a posição inicial, para o array final, na posição inicial tmb, até o .length que são todos os elementos
        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Laranja";
        System.out.println(Arrays.toString(novoFrutas));

            // opção 3: usando ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Cereja", "Morango"));
        System.out.println(listaFrutas);

        listaFrutas.add("Manga");
        System.out.println(listaFrutas);


        // 8 - Reference trap
        int[] arrayOriginal = {1, 2, 3};
        // a gente programou bastante coisa...
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10; // modificou arrayCopia e arrayOriginal

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        // cómo evitar?
        int[] arrayClone = arrayOriginal.clone(); // fazer un .clone do array original em vez de usar o original mesmo

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));




    }
    
}
