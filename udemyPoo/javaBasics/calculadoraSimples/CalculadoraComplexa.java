package udemyPoo.javaBasics.calculadoraSimples;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraComplexa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char continuar;
        
        do {
            System.out.println("Insira um número:");
            double numInicio = sc.nextDouble();
    
            char operacao = '+';
            double resultado = numInicio;
            
            while (operacao != '=') {
                operacao = sc.next().charAt(0);
    
                if (operacao != '=') {
                    double numAdicionado = sc.nextDouble();
    
                    switch (operacao) {
                        case '+':
                            resultado += numAdicionado;
                            break;
                        case '-':
                            resultado -= numAdicionado;
                            break;
                        case '*':
                            resultado *= numAdicionado;
                            break;
                        case '/':
                            resultado /= numAdicionado;
                            break;
                        default:
                            System.out.println("Erro: operação escolhida inválida!");
                            break;
                    }
                }
            }
            
            System.out.println(resultado);

            System.out.println("Fazer outro cálculo? s / n");
            continuar = sc.next().charAt(0);


        } while (continuar == 's');

        sc.close();
    }
}
