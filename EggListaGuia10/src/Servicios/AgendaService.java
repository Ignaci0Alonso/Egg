package Servicios;

import java.util.*;

public class AgendaService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void agregarContacto(HashMap<String, Integer> contactos) {
        String op;
        do {

            System.out.println("Nuevo contacto.");
            System.out.println("Nombre:");
            String nombre = scan.next();

            System.out.println("Numero:");
            Integer numero = scan.nextInt();
            contactos.put(nombre, numero);

            System.out.println("Presione S/s para salir. \nOtra tecla para agregar otro contacto.");
            op = scan.next();

        } while (!op.equalsIgnoreCase("s"));

    }

    public void eliminarContacto(HashMap<String, Integer> contactos) {
        System.out.println("Ingresar el nombre del contacto que desea remover.");
        String nombre = scan.next();
        Iterator<HashMap.Entry<String, Integer>> it = contactos.entrySet().iterator();
        while (it.hasNext()) {
            if (nombre.equalsIgnoreCase(it.next().getKey())) {
                it.remove();
            }
        }

    }

    public void buscarContacto(HashMap<String, Integer> contactos) {
        System.out.println("Ingresar el nombre del contacto que desea buscar.");
        String nombre = scan.next();
        for (HashMap.Entry<String, Integer> con : contactos.entrySet()) {
            if (con.getKey().equalsIgnoreCase(nombre)) {
                System.out.println("-------------------\nResultado de la busqueda: ");
                System.out.println("- Nombre: " + con.getKey() + "\n- Numero: " + con.getValue());
            }
        }
    }

    public void mostrar(HashMap<String, Integer> contactos) {
        System.out.println("-------------------");
        for (HashMap.Entry<String, Integer> op : contactos.entrySet()) {
            System.out.println("- Nombre: " + op.getKey() + "\n- Numero: " + op.getValue());
        }

    }

    public void mostrarPorNombre(HashMap<String, Integer> contactos) {
        System.out.println("-------------------");
        TreeMap<String, Integer> cont1 = new TreeMap();
//        cont1.putAll(contactos);
        for (Map.Entry<String, Integer> entry : contactos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            cont1.put(key, value);
        }
//        cont1.comparator(compararNumeros);
        for (Map.Entry<String, Integer> c : cont1.entrySet()) {
            System.out.println("- Nombre: " + c.getKey() + "\n- Numero: " + c.getValue());
        }

    }

}
