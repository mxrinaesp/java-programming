package udemyPoo.javaBasics.funcoes;

public class Funcoes {
    public static void main(String[] args) {
        
        // 1 - Criando a primeira função
        // tanto funções como variáveis, a gente nomeia
        saudacao();

        // 2 - Parâmetros
        soma(3, 8);

        // 3 - Return -- retorna para o código, não para a tela
        dobrar(10);
        System.out.println(dobrar(10));

        int numero = 5;
        int numeroDobrado = dobrar(numero);
        System.out.println("O número dobrado é: " + numeroDobrado);

        // 4 - Retorno em variável
        String retorno1 = verificarPar(numero);

        String retorno2 = verificarPar(3);

        System.out.println(retorno1);
        System.out.println(retorno2);


    }



    // NIVEL DE ACESSO, STATIC => não preciso instancoar classe para executar, TIPO RETORNO
    // NOME, OS PARENTESES (ARGS), BLOCO {}

    public static void saudacao() {
        System.out.println("Olá, esta é minha primeira função!");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    // Parâmetros de funções diferentes podem ter o mesmo nome
    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n) {
        if(n % 2 == 0) {
            return "O número " + n + " é par!";
        } else {
            return "O número " + n + " NÃO é par!";
        }
    }

}