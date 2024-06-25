public class ResultadoEscolar 
{
    public static void main(String[] args) {
        /*int nota = 8;

        if(nota>= 7)
            System.out.println("Aprovado");

        else if (nota < 7 || nota >= 5)
        {
            System.out.println("Exame");
        }

        else
            System.out.println("Reprovado"); */



        /*IF TERNARIO */

        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "Exame" : "Reprovado";

        System.out.println(resultado);
    }

}
