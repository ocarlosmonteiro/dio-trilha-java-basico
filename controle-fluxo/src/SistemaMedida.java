public class SistemaMedida 
{
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla)
        {
            case "P":
            {
                System.out.println("PEQUENO");
                break;
            }
            case "M":
            {
                System.err.println("MÉDIO");
                break;
            }
            case "G":
            {
                System.out.println("GRANDE");
                break;
            }
            default:
            {
                System.out.println("INDEFINIDO");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*if(sigla == "P")
        {
            System.err.println("PEQUENO");
        }
        else if (sigla == "M")
        {
            System.out.println("MÉDIO");
        }
        else if (sigla == "G")
        {
            System.out.println("Grande");
        }
        else
        {
            System.err.println("INDEFINIDO");
        }*/
    }
}
