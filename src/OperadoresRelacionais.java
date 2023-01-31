public class OperadoresRelacionais {

    public static void main(String[] args) {

        String nomeUm = "GLEYSON";
        String nomedOIS = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomedOIS));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else
            System.out.println("A condição é falsa");

        System.out.println("Número é igual a numero Dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número é diferente do numero Dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Número é maior do que o numero Dois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Número é menor do que o numero Dois? " + simNao);
    }
}
