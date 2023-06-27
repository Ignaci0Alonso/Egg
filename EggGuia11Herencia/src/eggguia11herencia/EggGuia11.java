package eggguia11herencia;

import Entidad.*;
import Servicio.*;
import java.util.*;

public class EggGuia11 {

    public static void main(String[] args) {
        //--------------EJ 1 perro-----------------------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        Ej1_Servicio ps= new Ej1_Servicio();
//        ArrayList<Persona_1> p1 = new ArrayList();
//        ArrayList<Perro_1> p2 = new ArrayList();
//        String fin;
//        do {
//            p1.add(ps.crearPersona());
//            p2.add(ps.crearPerro());
//            System.out.println("Desea salir? s/S");
//            fin = scan.next();
//        } while(!fin.equalsIgnoreCase("s"));
//        ps.asignarPerro(p1, p2);
//        for (Persona_1 persona : p1) {
//            System.out.println(persona.toString());
//        }
        //---------------EJ 2 Ruleta Rusa-----------------//
        Juego j = new Juego();
        
        j.llenarJuego();
        j.jugarJuego();
        //---------------Ej 3 Cartas-----------------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        Baraja bj = new Baraja();
//        String salir = "";
//        bj.crearBaraja();
//        bj.setPos(0);
//        do {
//            System.out.println("Menu: \n 1- Mostrar Baraja\n 2- Mostrar Monton\n 3- Cantidad de cartas disponibles\n 4- Dar Cartas\n 5- Barajar\n 6- Salir" );
//            int var = scan.nextInt();
//            switch (var) {
//                case 1:
//                    bj.mostrarBaraja();
//                    break;
//                case 2:
//                    bj.cartasMonton();
//                    break;
//                case 3:
//                    System.out.println(bj.cartasDisponibles());
//                    break;
//                case 4:
//                    bj.darCartas();
//                break;
//                case 5:
//                    bj.barajar();
//                    break;
//                case 6:
//                    System.out.println("Desea salir? s/S");
//                    salir = scan.next();
//                    break;
//                default:
//                    System.out.println("Opcion invalida.");
//            }
//        } while (!salir.equalsIgnoreCase("s"));
        //---------------EJ 2 Extra---------------//

//        ServicioCine sc = new ServicioCine();
//        Cine cine = sc.crearCine();
//        sc.mostrarClientes(cine.getCliente());
//        sc.llenar(cine, cine.getSala());
//        sc.mostrar(cine);
        //-------------------EJ 3 Extra-----------//
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        VehiculosService vs = new VehiculosService();
//        HashSet<Vehiculo> vehiculos = null;
//        ArrayList<Vehiculo> vlist = new ArrayList<>();
//        ArrayList<ClientesVehiculos> clist = new ArrayList<>();
//        ArrayList<Poliza> plist = new ArrayList<>();
//        
//        boolean fin = true;
//        
//        while (fin) {
//            System.out.println("-----------------------------------------");
//            System.out.println("Menu: \n1- Crear clientes/vehiculos/polizas \n2- Mostrar clientes/vehiculos/polizas \n3- Salir.");
//            int op = scan.nextInt();
//            switch (op) {
//                case 1:
//                    System.out.println("HA SELECCIONADO: Crear clientes/vehiculos/polizas.");
//
//                    ClientesVehiculos cv = vs.crearCliente();
//                    clist.add(cv);
//                    System.out.println("Cuantos vehiculos agregara?");
//                    int cant = scan.nextInt();
//                    vehiculos = new HashSet();
//                    for (int i = 0; i < cant; i++) {
//                        Vehiculo v = vs.crearVehiculo();
//                        vehiculos.add(v);
//                        vlist.add(v);
//                    }
//                    Poliza p = vs.crearPoliza(cv, vehiculos);
//                    plist.add(p);
//                break;
//                case 2:
//                    System.out.println("HA SELECCIONADO: Mostrar clientes/vehiculos/polizas");
//                    System.out.println("1- Mostrar clientes. \n2- Mostrar vehiculos. \n3- Mostrar polizas.");
//                    op = scan.nextInt();
//                    switch (op) {
//                        case 1:
//                            vs.mostrarClientes(clist);
//                            break;
//                        case 2:
//                            vs.mostrarTodosVehiculos(vlist);
//                            break;
//                        case 3:
//                            vs.mostrarPolizas(plist);
//                            break;
//                        default:
//                            System.out.println("Opcion invalida.");
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.println("Hasta luego.");
//                    fin = false;
//                    break;
//                default:
//                    System.out.println("Opcion invalida.");
//            }
//        }
        //----------------Ej 4 extra----------------------//
        
//        Simulacion sm = new Simulacion();
//        ArrayList<Alumno> alumnos = sm.crearAlumnos();
//        sm.votacion(alumnos);
//        sm.mostrarAlumnos(alumnos);
        
    }
}
