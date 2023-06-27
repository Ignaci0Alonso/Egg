
package Servicios;

import java.util.*;

public class PaisService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public static Comparator<String> compararPaises = (String p1, String p2) -> p1.compareTo(p2);
    
    public void mostrarPaises(TreeSet<String> paises) {
        
        for (String pais : paises) {
            System.out.println(pais);
        }
        
    }
    
    public void eliminarPaises(TreeSet<String> paises) {
        System.out.println("Que pais desea eliminar?");
        String op = scan.next();
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(op)) {
              it.remove();
            } 
        }
    }
}
