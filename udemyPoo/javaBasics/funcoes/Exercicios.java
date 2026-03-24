package udemyPoo.javaBasics.funcoes;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ex 1: Função para converter temperatura
        System.out.println("Digite a temperatura em Celsius: ");

        double celsiusTemp = sc.nextDouble();
        double fahrenheitTemp = converterTemp(celsiusTemp);

        System.out.println("O resultado é: " + fahrenheitTemp + " ºF");

        
        // Ex 2: Função para calcular o fatorial de um número
        System.out.println("Digite o número que deseja calcular: ");
        int numero = sc.nextInt();
        System.out.println("O fatorial é: " + calcularFatorial(numero));


        // Ex 3: Função if-else para verificar paridade
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("O número digitado é " + verificarParidade(num));


        // Ex 4: Função com switch para classificar notas
        System.out.println("Digite uma nota: ");
        int nota = sc.nextInt();
        System.out.println(classificarNotas(nota));


        // Ex 5: Função con System.exit para verificar idade
        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        verificarIdade(idade);


        // Ex 6: Função que receba un array e retorna o maior número
        int[] numeros = {5, 100, 22, 44, 6};

        System.out.println("O maior número é: " + retornarMaior(numeros));


        
        sc.close();
    }

    // FUNÇÕES
    
    public static double converterTemp(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static String verificarParidade(int num) {
        if (num % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }

    public static String classificarNotas(int nota) {
        if (nota > 10 || nota < 0) {
            return "A nota é inválida!";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A nota é A";
            case 8:
                return "A nota é B";
            case 7:
                return "A nota é C";
            case 6:
                return "A nota é D";
            default:
                return "A nota é F";
        }
    }

    public static void verificarIdade(int idade) {
        if (idade < 18) {
            System.out.println("Acesso negado");
            System.exit(0);
        } else {
            System.out.println("Acesso permitido");
        }
    }

    public static int retornarMaior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    
    
}
