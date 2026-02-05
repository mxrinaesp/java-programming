public class EjercicioAtribuicao {
    public static void main (String [] args) {

        /*el comando de atribuición implica que una variable (b, area) recibe (=)
        una expresión (6.0) o el resultado de la operación y por tanto es dicho resultado
        lo que se guarda en esa variable (area recibe 35.0)*/
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;

        /*
        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (b + B) / 2f * h; 
        */

        System.out.println(area);
    }
}