package beecrowd.vectores_ex09;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nome = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];

        double somaLucros = 0;
        double somaCompras = 0;
        double somaVendas = 0;
        double lucro = 0;
        double lucroPorcentagem = 0;
        int qtdLucroAbaixo = 0;
        int qtdLucroEntre = 0;
        int qtdLucroAcima = 0;

        for (int i=0; i<N; i++) {
            nome[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();

            lucro = precoVenda[i] - precoCompra[i];
            lucroPorcentagem = lucro * 100 / precoCompra[i];

            if (lucroPorcentagem < 10) {
                qtdLucroAbaixo++;
            } else if (lucroPorcentagem >= 10 && lucroPorcentagem <= 20) {
                qtdLucroEntre++;
            } else {
                qtdLucroAcima++;
            }

            somaCompras += precoCompra[i];
            somaVendas += precoVenda[i];
            somaLucros += lucro;
        }

        System.out.println("Lucro abaixo de 10%: " + qtdLucroAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + qtdLucroEntre);
        System.out.println("Lucro acima de 20%: " + qtdLucroAcima);
        System.out.printf("Valor total de compra: %.2f%n", somaCompras);
        System.out.printf("Valor total de venda: %.2f%n", somaVendas);
        System.out.printf("Lucro total: %.2f%n", somaLucros);

        sc.close();
    }
}
