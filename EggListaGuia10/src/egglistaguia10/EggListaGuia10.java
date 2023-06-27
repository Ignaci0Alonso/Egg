package egglistaguia10;

import Entidades.*;
import Servicios.*;

import java.util.*;


public class EggListaGuia10 {

    public static void main(String[] args) {
        //------------EJ 3 Alumnos----------------//
//        AlumnosService as = new AlumnosService();
//        as.cargarAlumnos();
//        System.out.println("El promedio del alumno es: " + as.notaFinal() );
                                                            //promedioFinal
        //------------Ej 4 CINE------------------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        peliculaService ps = new peliculaService();
//        ArrayList<Pelicula> po = new ArrayList();
//        String continuar;
//        do {
//            po.add(ps.crearPelicula());
//            System.out.println("Desea agregar otra pelicula? si/no");
//            continuar = scan.next();
//        } while (!continuar.equalsIgnoreCase("no"));
//        ps.mostrarPeliculas(po);
//        ps.mostrarMasUnaHora(po);
//        ps.mostrarMayorHora(po);
//        ps.mostrarMenorHora(po);
//        ps.mostrarTitulo(po);
//        ps.mostrarDirector(po);
        //-------------Ej 5 Paises------------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        PaisService ps = new PaisService();
//        TreeSet<String> paises = new TreeSet(ps.compararPaises);
//        String op;
//        do {
//            System.out.println("Ingresar un pais.");
//            paises.add(scan.next());
//            System.out.println("----------------------------");
//            ps.mostrarPaises(paises);
//            System.out.println("----------------------------");
//            System.out.println("Desea eliminar un pais? si/no");
//            op = scan.next();
//            if (op.equalsIgnoreCase("si")) {
//                ps.eliminarPaises(paises);
//            }
//            System.out.println("Desea continuar? (no/NO para salir)");
//            op = scan.next();
//        } while (!op.equalsIgnoreCase("no"));
//        System.out.println("----------------------------");
//        ps.mostrarPaises(paises);
//        System.out.println("----------------------------");

        //-------------Ej 6 Tienda ---------------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        ProductosService ps = new ProductosService();
//        HashMap<Integer,Productos> po = new HashMap();
//        int cont = 0;
//        String op="";
//        int var;
//        do {
//            System.out.println("Menu: \n 1- Añadir un producto \n 2- Remover un producto por nombre \n 3- Remover un producto por llave \n 4- Modificar producto \n 5- Mostrar catalogo \n 6- Salir");
//            var = scan.nextInt();
//            switch (var) {
//                case 1:
//                    do {
//                    po.put(cont,ps.crearProducto());
//                    cont++;
//                    System.out.println("Desea añadir otro producto? s/S");
//                    op = scan.next();
//                    } while (op.equalsIgnoreCase("s"));
//                    break;
//                case 2:
//                    ps.eliminarProductoPorNombre(po);
//                    break;
//                case 3:
//                    ps.eliminarProductoPorKey(po);
//                    break;
//                case 4:
//                    ps.modificarProducto(po);
//                    break;
//                case 5:
//                    ps.mostrarCatalogo(po);
//                    break;
//                case 6:
//                    System.out.println("Selecciono la opcion para salir. \nPrecione s/S para confirmar.");
//                    op = scan.next();
//                    break;
//                default:
//                    System.out.println("Opcion " + var + " invalida.");;
//            }
//
//        } while (!op.equalsIgnoreCase("s"));

        //------------EJ extra 1----------//
/*
 Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y 
mostrar los contactos ordenados alfabéticamente por nombre.
En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono). 
Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre,
mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.
*/

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    AgendaService as = new AgendaService();
    HashMap<String, Integer> contactos = new HashMap();
    int var;
    String op = "";
        do {
            System.out.println("-------------------");
            System.out.println("Menu: \n1- Agregar un nuevo contacto. \n2- Eliminar un contacto. \n3- Buscar un contacto. \n4- Mostrar contactos. \n5- Mostrar contactos orgenados por nombre. \n6- Salir.");
            var = scan.nextInt();
            switch (var) {
                case 1:
                    as.agregarContacto(contactos);
                    break;
                case 2:
                    as.eliminarContacto(contactos);
                    break;
                case 3:
                    as.buscarContacto(contactos);
                    break;
                case 4:
                    as.mostrar(contactos);
                    break;
                case 5:
                    as.mostrarPorNombre(contactos);
                    break;
                case 6:
                    System.out.println("Presione s/S para salir.");
                    System.out.println("Otra tecla para continuar");
                    op = scan.next();
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
                    
            }
            System.out.println("-------------------");
            
        } while (!op.equalsIgnoreCase("s"));
    
    }

}
