package operadores;

public class OperadoreLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("As duas é condições são verdadeiras");
        }

        System.out.println("fim");

    }
}
