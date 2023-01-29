public class Main {
    public static void main(String[] args) {
        double salarioMinimo = 2.5; // é igual a 2,5 e não ígual a 2500 reais.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // isso é um cast

        int numero = 1;
        numero = 2;

        //VALOR NUNCA MUDA QUANDO O TORNAMOS UMA CONSTANTE

        final double VALOR_DE_PI = 3.14;
    }
}