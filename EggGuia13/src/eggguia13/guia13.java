package eggguia13;

public class guia13 {

    public static void main(String[] args) {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("l");
            valor = valor + 1;
            System.out.println("Valor final del try:" + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch:" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
    }

    // Sin excepcion = 44
    // catch = 43
    // finally = 45(sin excepcion), 44 (nf)
    // raturn = 46(sin excepcion), 45 (nf) 
}
