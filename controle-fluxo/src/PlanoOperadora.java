public class PlanoOperadora 
{
    public static void main(String[] args) 
    {
        String plano = "R";
        
        switch(plano)
        {
            case "B":
            {
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M":
            {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram grátis");
                break;
            }
            case "T":
            {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram grátis");
                System.out.println("5Gb Youtube");
                break;
            }
            default:
            {
                System.out.println("Não há este plano");
                break;
            }
        }


        
        /*if(plano == "B")
        {
            System.out.println("100 minutos de ligação");
        }
        else if(plano == "M")
        {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }
        else if(plano == "T")
        {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }*/
    }
}
