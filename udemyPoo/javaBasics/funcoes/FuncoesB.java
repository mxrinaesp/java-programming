package udemyPoo.javaBasics.funcoes;

public class FuncoesB {

        // escopo global
       static int globalVar = 20;

    public static void main(String[] args) {
        
        // 5 - Funções com condicionais
        String retorno1 = verificarAcesso(19, true, true);
        System.out.println(retorno1);

        String retorno2 = verificarAcesso(25, false, true);
        System.out.println(retorno2);

        // 6 - Funções com switch
        String r1 = obterDiaSemana(4);
        System.out.println(r1);

        System.out.println(obterDiaSemana(12));

        // 7 - System exit
        verificarAutenticacao("admin", "SenhaSegura");
        System.out.println("Oi!");

        // 8 - Documentação função
        System.out.println(calcularMedia(5, 6, 7));

        // 9 - Escopos
            // escopo local
        int localVar = 10;
        
        if (true) {
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        int testeEscopo = escopoLocal(localVar);
        System.out.println(testeEscopo);
    }

    public static String verificarAcesso(
        int idade,
        boolean temCarteira,
        boolean temHistoricoNegativo) {

            if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
                return "Acesso permitido: todos los critérios atendidos.";
            } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado: histórico negativo detectado.";
            } else {
                return "Acesso negado: critérios não atendidos.";
            }
    }

    // quando tem return, o switch não precisa de break
    public static String obterDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Dia inválido";
        }
    }

    public static void verificarAutenticacao(String usuario, String senha) {
        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
    }

    /**
     * 
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     * 
     */

    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static int escopoLocal(int a) {
        System.out.println(globalVar);

        System.out.println(a);

        int testeFnEscopo = 1;
        return testeFnEscopo;
    }
}
