package Servicios;

import Entidades.Productos;
import java.util.*;

public class ProductosService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Productos crearProducto() {

        System.out.println("Ingrese los datos del producto:");
        System.out.println("Nombre:");
        String nombre = scan.next();
        System.out.println("Precio:");
        double precio = scan.nextDouble();

        return new Productos(precio, nombre);
    }

    public void mostrarCatalogo(HashMap<Integer, Productos> po) {

        System.out.println("El catalogo actual:");

        for (Map.Entry<Integer, Productos> producto : po.entrySet()) {
            System.out.println(" - Llave: " + producto.getKey() + "\n - Nombre: " + producto.getValue().getNombre() + "\n - Precio: $" + producto.getValue().getPrecio());
        }

    }

    public void eliminarProductoPorNombre(HashMap<Integer, Productos> po) {

        System.out.println("Ingrese el nombre del producto que desea eliminar.");
        mostrarCatalogo(po);
        String nombre = scan.next();

        Iterator<HashMap.Entry<Integer, Productos>> it = po.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }
        }
    }

    public void eliminarProductoPorKey(HashMap<Integer, Productos> po) {

        System.out.println("Ingrese la llave del producto a eliminar.");
        mostrarCatalogo(po);
        int op = scan.nextInt();
        po.remove(op);
    }

    public void modificarProducto(HashMap<Integer, Productos> po) {
        String salir;
        System.out.println("Ingrese la llave del producto a modificar.");
        mostrarCatalogo(po);
        int op = scan.nextInt();
        int var;
        do {
            do {
                System.out.println("Que desea modificar? \n 1- Nombre \n 2- Precio");
                var = scan.nextInt();
                if (var != 1 && var != 2) {
                    System.out.println("Opcion " + var + " no se valida.");
                }
            } while (var != 1 && var != 2);
            Productos r = new Productos(po.get(op).getPrecio(), po.get(op).getNombre());
            switch (var) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del producto.");
                    r.setNombre(scan.next());
                    po.replace(op, po.get(op), r);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo precio del producto.");
                    r.setPrecio(scan.nextDouble());
                    po.replace(op, po.get(op), r);
                    break;
            }
            System.out.println("Desea salir? s/s");
            salir = scan.next();
        } while (salir.equalsIgnoreCase("s"));

    }
}
