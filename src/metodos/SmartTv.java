package metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuindoCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;//seria igual a volume +1
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;//seria igual a volume  - 1
    }


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
