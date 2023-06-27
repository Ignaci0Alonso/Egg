
package Main;

import java.util.*;
import Entidades.*;
import Servicios.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Servicio ms = new Servicio();
        List<Entidad> mascotas = new ArrayList();
        
        System.out.println("Cuantas mascotas desea añadir?");
        int cant = scan.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Mascota " + (i+1));
            mascotas.add(ms.crearMascota());
        }
        ms.mostrarMascota(mascotas);
        ms.editarMascota(mascotas);
        ms.mostrarMascota(mascotas);
        ms.eliminarMascota(mascotas);
        ms.mostrarMascota(mascotas);
    }

}



