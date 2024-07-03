public class ExemploDoWhile 
{
    /*public static void main(String[] args) {
        int numero = 0;
        int fim = 10;

        do
        {
            numero++;
            System.err.println("Número é: " + numero);
            
        }
        while (numero < fim);

        System.out.println("Se encerrou o Do While");
    }*/


    public static void main(String[] args) {
        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}
