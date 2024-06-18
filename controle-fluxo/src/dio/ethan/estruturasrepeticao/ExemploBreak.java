package dio.ethan.estruturasrepeticao;

public class ExemploBreak {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3)
                break;

            System.out.println(numero);
        }

        //muda o fluxo e pula a condição com o "continue"
        /*
         * for(int numero = 1; numero <= 5; numero++) {
         *  if(numero == 3)
         *      continue;
         *
         *   System.out.println(numero);
         *}
         */
    }
}
