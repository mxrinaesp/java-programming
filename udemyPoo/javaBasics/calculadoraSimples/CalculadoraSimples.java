/**
 * 
 * Objetivo: criar uma calculadora que faz soma, multiplicação, divisão e subtração.
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela / texto para escolher a operação
 * 3 - Resgatar a operação que o usuário seleciou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida foi inválida, exibir mensagem de erro
 * 
 */

package udemyPoo.javaBasics.calculadoraSimples;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois números:");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("Soma: +");
        System.out.println("Subtração: -");
        System.out.println("Multiplicação: *");
        System.out.println("Divição: /");

        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                double soma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + soma);
                break;
            case '-':
                double subtracao = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + subtracao);
                break;
            case '*':
                double multiplicacao = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
                break;
            case '/':
                double divicao = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + divicao);
                break;
            default: 
                System.out.println("Erro: operação escolhida inválida!");
                break;
        }

        /* if (operacao == '+') {
            double soma = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + soma);
        } else if (operacao == '-') {
            double subtracao = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + subtracao);
        } else if (operacao == '*') {
            double multiplicacao = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + multiplicacao);

        } else if (operacao == '/') {
            double divicao = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divicao);

        } else {
            System.out.println("Erro: operação escolhda inválida!");
        } */


        sc.close();
    }
}
