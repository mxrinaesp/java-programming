package udemyPoo.javaBasics.projetoConversorTemperatura;

import java.util.Locale;
import java.util.Scanner;

/**
 * Objetivo: criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 * 
 * Etapas do projecto
 * 
 * 1 - Obter do usuário se ele quer converter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhida
 * 4 - Exibir uma mensagem com a temperatura. Ex: De x ºC para y ºF 
*/

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Você quer converter Celsius ou Fahrenheit?: ");
        String escolhaUsuario = sc.nextLine();
        
        if (escolhaUsuario.equalsIgnoreCase("Celsius")) {
            System.out.println("Digite a temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();

            System.out.println("De " + tempCelsius + " ºC para " + converterCelsius(tempCelsius) + " ºF");
        } else if (escolhaUsuario.equalsIgnoreCase("Fahrenheit")) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double tempFahrenheit = sc.nextDouble();

            System.out.println("De " + tempFahrenheit + " ºF para " + converterFahrenheit(tempFahrenheit) + " ºC");
        } else {
            System.out.println("Escolha inválida!");
        }

        sc.close();
    }

    public static double converterCelsius(double tempCelsius) {

        return (tempCelsius * 9 / 5) + 32;

    }

    public static double converterFahrenheit(double tempFahrenheit) {

        return (tempFahrenheit - 32) * 5 / 9;

    }

}
