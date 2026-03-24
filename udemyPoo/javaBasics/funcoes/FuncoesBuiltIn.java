package udemyPoo.javaBasics.funcoes;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        // 10 - Funções Built In de String
        String frase = "Java é muito bom!";

            // length => qtd de carateres
            System.out.println(frase.length());

            // substring => uma parte da String
            System.out.println(frase.substring(0, 7));

            // to.UpperCase => maiusculo to.LowerCase => minusculo
            System.out.println(frase.toUpperCase());

            // replace => troca todos os caracteres por outros
            System.out.println(frase.replace("a", "e"));

        String fraseModificada = frase.toUpperCase();
        System.out.println(fraseModificada);

        // 11 - Funções de Math
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));
        System.out.println(Math.max(100, 9));
    }   
}
