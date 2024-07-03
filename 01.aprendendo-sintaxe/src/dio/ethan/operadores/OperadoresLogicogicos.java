package dio.ethan.Operadores;

public class OperadoresLogicogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}