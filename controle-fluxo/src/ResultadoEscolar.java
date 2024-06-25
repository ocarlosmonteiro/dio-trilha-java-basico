public class ResultadoEscolar 
{
    public static void main(String[] args) {
        int nota = 8;

        if(nota>= 7)
            System.out.println("Aprovado");

        else if (nota < 7 || nota >= 5)
        {
            System.out.println("Exame");
        }

        else
            System.out.println("Reprovado");
    }
}
