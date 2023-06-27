
import Entidades.Entidad;
import Servicio.Servicios;
import java.util.Date;
import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {

        //----------------------Ej 1 Cadena-----------------//
//        Scanner consola = new Scanner(System.in).useDelimiter("\n");
//        
//        Servicios cs = new Servicios();
//        
//        System.out.println("Ingrese una frase.");
//        
//        Entidad cad = new Entidad(consola.next());
//        
//        cs.mostrarVocales(cad);
//        cs.invertirFrase(cad);
//        System.out.println("Que caracter desea buscar?");
//        String letra;
//        do {
//            letra = consola.next();
//            if (letra.length()!=1) {
//                System.out.println("Solamente puede ser una letra");
//            }
//        } while (letra.length()!=1);
//        cs.vecesRepetido(cad, letra);
//        
//        System.out.println("Ingrese una frase para comparar la longitud y  unir.");
//        
//        String nf = consola.next();
//        cs.compararLongitud(cad, nf);
//        cs.unirFrases(cad, nf);
//        
//        
//        String cara;
//        do {
//            System.out.println("Ingrese un caracter para remplazar a la letra 'a' ");
//            cara = consola.next();
//        } while (cara.length()!=1);
//        cs.remplazar(cad, cara);
//        
//       
//        String letra1;
//        do {
//             System.out.println("Ingrese una letra para saber si esta en la frase.");
//            letra1 = consola.next();
//        } while (letra1.length()!=1);
//        System.out.println(cs.contiene(cad, letra1));
        //----------------------Ej 2 Par de Numeros--------------------//
//    Servicios ns = new Servicios();
//    Entidad ne = new Entidad();
//    
//    ns.mostrarVocales(ne);
//    double mayor = ns.devolverMayor(ne);
//        System.out.println("El mayor es: " + mayor);
//    ns.potencia(mayor, ne);
//    ns.raiz(ne);
        //---------------------Ej 3-------------------//
//    Servicios as = new Servicios();
//    
//    int[] a = new int[50];
//    double[] b = new double[20];
//
//    as.iniciarA(a);
//    as.mostrar(a);
//    as.ordenar(a);
//    as.llenarB(a, b);
        //-----------------------Ej 4 fecha-----------------//
//    Servicios cs = new Servicios();
//    Date ce = cs.fechaNacimiento();
//    Date ca = cs.fechaActual();
//    cs.diferencia(ce,ca);
        //------------------Ej 5 ------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    Servicios os = new Servicios();
//    Entidad pf = os.crearPersona();
//    System.out.println("Ingrese la edad minima permitida.");
//    int edad = consola.nextInt();
//    os.mostrar(pf, edad);
        //---------------Ej 6----------------------//
//    Servicios cs = new Servicios();
//    Entidad curso = cs.crearCurso();
//    cs.calcularGananciaSemanal(curso);
        //---------------Ej 1 extra-----------------//
//    Servicios ms = new Servicios();
//    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
//    ms.adivinar(mes);
        //--------------Ej 2 extra---------------//
//    Servicios ps = new Servicios();
//    Entidad ahorcado =  ps.crearJuego();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Sin trampas!");
//        }
//    ps.juego(ahorcado);
        //-------------Ej integrador------------//
        
        Servicios cs = new Servicios();
        Entidad[] em = new Entidad[6];
        for (int i = 0; i < em.length; i++) {
            em[i] = cs.crearEmpleado(i+1);
        }
        System.out.println("El promeadio es: " + cs.promedio(em));
        for (int i = 0; i < cs.mayores(em).length; i++) {
            System.out.println(cs.mayores(em)[i] + " esta por encima del promedio.");
        }
    }

}
