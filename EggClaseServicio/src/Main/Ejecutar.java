package Main;

import Entidades.*;
import Servicio.*;
import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {

//        Scanner consola = new Scanner(System.in).useDelimiter("\n");
//
//        Servicio cuenta = new Servicio();
//
//        System.out.println("Bienvenido, para continuar cree una cuenta.");
//
//        Entidades cc = cuenta.crearCuenta();
//        String end = "";
//        do {
//            System.out.println("Menu: \n 1- Ingresar \n 2- Retirar \n 3- Retiro rapido \n 4- Consultar saldo  \n 5- Consultar datos \n 6- Salir");
//            int num = consola.nextInt();
//
//            switch (num) {
//                case 1:
//                    cuenta.ingresar(cc);
//                    break;
//                case 2:
//                    cuenta.retirar(cc);
//                    break;
//                case 3:
//                    cuenta.retiroRapido(cc);
//                    break;
//                case 4:
//                    cuenta.consultarSaldo(cc);
//                    break;
//                case 5:
//                    cuenta.consultarDatos(cc);
//                    break;
//                case 6:
//                    System.out.println("Desea salir? s/S");
//                    end = consola.next();
//                default:
//                    System.out.println("Opcion no valida.");
//
//            }
//        } while (!end.equalsIgnoreCase("s"));
//
//        System.out.println(cc.toString());
        //---------------- Ej 2 cafetera--------------------//
//    Servicio cafetera = new Servicio();
//    Entidades cafe = cafetera.llenarCafetera();
//        Scanner consola = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Bienvenido a la cafetera electronica.");
//        int op;
//        int tamaño;
//        String salir = "";
//        do {
//            System.out.println("Que desea? \n 1- Servir una taza de cafe. \n 2- Vaciar la cafetera. \n 3- Agregar cafe a la cafetera \n 4- Salir.");
//            op = consola.nextInt();
//            switch (op) {
//                case 1:
//                    do {
//                        System.out.println("Que tamaño sera el de la taza? \n 1- Chica(100ml) \n 2- Mediana(250ml) \n 3- Grande(500ml)");
//                        tamaño = consola.nextInt();
//                        if (tamaño < 1 || tamaño > 3) {
//                            System.out.println("Opcion no valida.");
//                        }
//                    } while (tamaño < 1 || tamaño > 3);
//                    int taza = cafetera.servirCafe(cafe, tamaño);
//                    System.out.println("Su taza tiene: " + taza + "ml");
//                    System.out.println("Cafe en la cafetera: " + cafe.getCapActual() + "ml");
//                    break;
//                case 2:
//                    cafetera.vaciarCafetera(cafe);
//                    System.out.println("Cafe en la cafetera: " + cafe.getCapActual() + "ml");
//                    break;
//                case 3:
//                    cafetera.agregarCafe(cafe);
//                    System.out.println("Cafe en la cafetera: " + cafe.getCapActual() + "ml");
//                    break;
//                case 4:
//                    System.out.println("Desea salir? \n s/S = Si \n otra letra = No");
//                    salir = consola.next();
//                default:
//                    System.out.println("Opcion no valida.");
//            }
//        } while (!salir.equalsIgnoreCase("s"));
      


    //-----------------EJ 3 Perona--------------------//
        Servicio personaServicio = new Servicio();
        int[] imc = new int[4];
        boolean[] mame = new boolean[4];
        Entidades[] persona = new Entidades[4];

        for (int i = 0; i < 4; i++) {
            persona[i] = personaServicio.crearPersona((i + 1));
        }
        for (int i = 0; i < 4; i++) {
            imc[i] = personaServicio.calcularIMC(persona[i]);
            mame[i] = personaServicio.mayorMenor(persona[i]);
        }

        pesoPorcentaje(imc);
        edadPorcentaje(mame);
    }

    public static void pesoPorcentaje(int[] imc) {
        int cont1 = 0, cont2 = 0, cont3 = 0;

        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;

            }
        }

        System.out.println("El porcentaje de personas en su peso ideal es: " + ((cont2 * 100) / 4) + "%");
        System.out.println(cont2 + "/4 estan en su peso ideal.");
        System.out.println("El porcentaje de personas por debajo de su peso es: " + ((cont1 * 100) / 4) + "%");
        System.out.println(cont1 + "/4 estan por debajo su peso ideal.");
        System.out.println("El porcentaje de personas con sobrepeso es: " + ((cont3 * 100) / 4) + "%");
        System.out.println(cont3 + "/4 estan por encima de su peso ideal.");
    }

    public static void edadPorcentaje(boolean[] mame) {
        int contv = 0, contf = 0;

        for (int i = 0; i < 4; i++) {
            if (mame[i] == true) {
                contv++;
            } else {
                contf++;
            }
        }

        System.out.println("El porcentaje de mayores de edad es: " + ((contv * 100) / 4) + "%");
        System.out.println(contv + "/" + 4 + "son mayores.");
        System.out.println("El porcentaje de menores de edad es: " + ((contf * 100) / 4) + "%");
        System.out.println(contf + "/" + 4 + "son menores.");



    //----------------EJ 1 Extra-------------------//
    
    Servicio ecuacionServicio = new Servicio();
    Entidades ecuacion = ecuacionServicio.crearEcuacion();
    
    ecuacionServicio.calcular(ecuacion, ecuacionServicio.getDiscriminante(ecuacion));

    //-----------------EJ 2 Extra---------------------//
    
//    Servicio verificar = new Servicio();
//    Entidades dninif = verificar.crearNIF();
//    verificar.mostrar(dninif);

    }

}
