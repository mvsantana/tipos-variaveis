package metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanal(10);

        System.out.println("Volume atual : " + smartTv.canal);

        System.out.println("Volume atual : " + smartTv.volume);

        System.out.println("TV LIGADA ?" + smartTv.ligada);
        System.out.println("CANAL ATUAL :" + smartTv.canal);
        System.out.println("VOLUME ATUAL :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status-> TV lIGADA " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status-> TV LIGADA " + smartTv.ligada);
    }
}
