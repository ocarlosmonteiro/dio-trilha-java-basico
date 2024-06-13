public class Usuario 
{
    public static void main(String[] args) throws Exception 
    {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.diminuirCanal();

        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.mudarCanal(13);
    }
}
