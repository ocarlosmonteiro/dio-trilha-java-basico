public class SmartTv 
{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar()
    {
        ligada = true;
    }

    public void desligar()
    {
        ligada = false;
    }

    public void aumentarVolume()
    {
        volume++;
        System.err.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume()
    {
        volume--;
        System.err.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal()
    {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal()
    {
        if (canal > 1)
        {
            canal--;
            System.err.println("Canal atual: " + canal);
        }
        else
        {
            System.err.println("Não é possivel alterar canal");
        }
    }

    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
        System.err.println("Canal atual: " + canal);
    }
}

