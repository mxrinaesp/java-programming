package udemyPoo.javaBasics.funcoes;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        
        // 12 - Função recursiva
        int soma = somaRecursiva(10);
        System.out.println(soma);

        // 13 - method overloading
        System.out.println(soma(2, 3));
        System.out.println(soma(2, 3, 4));
        System.out.println(soma(2.2, 3.3));

        // 14 - Função anónima => é só uma linha, não precisa escrever a função embaixo
        Runnable tarefa = () -> System.out.println("Minha função anónima!");

        tarefa.run();

            // (arg1, arg2) -> {}

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));



    }

    public static int somaRecursiva(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + somaRecursiva(num - 1);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
