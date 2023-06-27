package Servicio;

import Entidades.*;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

//     Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    
//    public Entidades crearCuenta(){
//        
//        System.out.println("Ingrese su dni.");
//        long dni = consola.nextLong();
//        
//        Random aleatorio = new Random();
//        int num = aleatorio.nextInt(5000 - 1 + 1) + 1;
//        System.out.println("Su numero de cuenta es:" + num);
//        
//        System.out.println("Al crear su cuenta su saldo sera de $0 hasta que deposite dinero por primera vez.");
//        double saldo = 0;
//        
//        return new Entidades(num, dni, saldo);
//    }
//    
//    public void ingresar(Entidades cuenta){
//        
//        System.out.println("Cuento desea ingresar?");
//        double cantidad = consola.nextDouble();
//        
//        cuenta.setSaldoActual(cantidad + cuenta.getSaldoActual());
//        System.out.println("Se han ingresado $" + cantidad);
//        
//    }
//    
//    public void retirar(Entidades cuenta){
//        
//        System.out.println("Cuento desea retirar?");
//       
//        double retiro = consola.nextDouble();
//        
//        if (retiro > cuenta.getSaldoActual()){
//            System.out.println("La suma ingresada es mayor a el total del saldo.");
//            System.out.println("Se procedera a retirar el maximo posible.");
//            retiro = cuenta.getSaldoActual();
//            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
//            System.out.println("Se han retirado $" + retiro);
//        }else{
//            System.out.println("Se han retirado $" + retiro);
//            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
//        }
//        
//        
//    }
//    
//    public void retiroRapido(Entidades cuenta){
//        double retiro;
//        do {
//          System.out.println("Cuanto desea retirar?");
//          retiro = consola.nextDouble();
//          
//          if(retiro > (cuenta.getSaldoActual()*0.2)){
//              System.out.println("En retiro rapido solo se puede retirar hasta el 20% del saldo total.");
//              System.out.println("Su maximo seria $" + cuenta.getSaldoActual()*0.2);
//          }
//        } while (retiro > (cuenta.getSaldoActual()*0.2));
//        
//        cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
//        
//    }
//    
//    public void consultarSaldo(Entidades cuenta){
//        System.out.println("Su saldo actual es $" + cuenta.getSaldoActual());
//    }
//    
//    public void consultarDatos(Entidades cuenta){
//        System.out.println("Los datos de su cuenta son: \n DNI: " + cuenta.getDniCliente() + "\n Numero de Cuenta: " + cuenta.getNumeroCuenta());
//    }
    //-----------------EJ 2 cafetera-----------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    
//    public Entidades llenarCafetera(){
//        int maxCap = 1000;
//        int capActual = maxCap;
//        return new Entidades(maxCap, capActual);
//    }
//    
//    public int servirCafe(Entidades cafetera, int cafe){
//        int taza = 0;
//        if (cafe == 1) {
//            if (cafetera.getCapActual() < 100) {
//                System.out.println("La taza no se pudo llenar.");
//                taza = cafetera.getCapActual();
//                cafetera.setCapActual(cafetera.getCapActual()-cafetera.getCapActual());
//                
//            }else{
//                System.out.println("La taza esta llena.");
//                cafetera.setCapActual(cafetera.getCapActual() - 100);
//                taza = 100;
//            }
//        }
//        if (cafe == 2) {
//           if (cafetera.getCapActual() < 250) {
//                System.out.println("La taza no se pudo llenar.");
//                taza = cafetera.getCapActual();
//                cafetera.setCapActual(cafetera.getCapActual()-cafetera.getCapActual());
//                
//            }else{
//                System.out.println("La taza esta llena.");
//                cafetera.setCapActual(cafetera.getCapActual() - 250);
//                taza = 250;
//            }
//        }
//        if (cafe == 3) {
//            if (cafetera.getCapActual() < 500) {
//                System.out.println("La taza no se pudo llenar.");
//                taza = cafetera.getCapActual();
//                cafetera.setCapActual(cafetera.getCapActual()-cafetera.getCapActual());
//                
//            }else{
//                System.out.println("La taza esta llena.");
//                cafetera.setCapActual(cafetera.getCapActual() - 500);
//                taza = 500;
//            }
//        }
//        return taza;
//    }
//    
//    public void vaciarCafetera(Entidades cafetera){
//        cafetera.setCapActual(0);
//    }
//    
//    public void agregarCafe(Entidades cafetera){
//        int cant;
//        do {
//            System.out.println("Cuanto cafe desea agregar(en miililitros)?");
//            cant = consola.nextInt();
//            if (cant + cafetera.getCapActual() > cafetera.getMaxCap()) {
//                System.out.println("La cantidad agregada exede el limite(1000ml).");
//                System.out.println("La cafetera tiene: " + cafetera.getCapActual() + "ml" + "\nLo maximo que se puede agregar es: " + (1000 - cafetera.getCapActual()) + "ml");
//            }
//        } while (cant + cafetera.getCapActual() > cafetera.getMaxCap());
//        
//        cafetera.setCapActual(cant + cafetera.getCapActual());
//    }
    //----------------------------EJ 3 PErona----------------------//
    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public boolean mayorMenor(Entidades persona) {
        boolean prueba = true;
        if (persona.getEdad() < 18) {
            prueba = false;
        }
        return prueba;
    }

    public Entidades crearPersona(int cont) {
        System.out.println("Persona " + cont);
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre:");
        String nombre = consola.nextLine();
        System.out.println("Edad:");
        int edad = consola.nextInt();
        String sexo;
        do {
            System.out.println("Sexo:(H = hombre, M = mujer, O = otro");
            sexo = consola.next();
            if (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
                System.out.println("Opcion no valida.");
            }
        } while (!"h".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo) && !"o".equalsIgnoreCase(sexo));
        System.out.println("Peso(en kg):");
        double peso = consola.nextDouble();
        System.out.println("Altura(en mt):");
        double altura = consola.nextDouble();
        consola.nextLine();
        return new Entidades(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Entidades persona) {
        int res = 0;
        var imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (imc < 20) {
            res = -1;
        } else if (imc > 25) {
            res = 1;
        }
        return res;
    }
    //---------------------EJ 1 Extra------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//
//    public Entidades crearEcuacion() {
//
//        System.out.println("Ingrese el valor de A");
//        double a = consola.nextDouble();
//
//        System.out.println("Ingrese el valor de B");
//        double b = consola.nextDouble();
//
//        System.out.println("Ingrese el valor de C");
//        double c = consola.nextDouble();
//
//        return new Entidades(a, b, c);
//    }
//
//    public double getDiscriminante(Entidades ecuacion) {
//        double disc;
//        disc = (Math.pow(ecuacion.getB(), 2)) - 4 * ecuacion.getA() * ecuacion.getC();
//        
//        return disc;
//    }
//
//    public boolean tieneRaices(double disc) {
//        boolean raices = false;
//        if (disc > 0) {
//            raices = true;
//        }
//        
//        return raices;
//    }
//
//    public boolean tieneRaiz(double disc) {
//        boolean raiz = false;
//        if (disc == 0) {
//            raiz = true;
//        }
//        
//        return raiz;
//    }
//
//    public void obtenerRaiz(Entidades ecuacion) {
//        double respuestamas;
//        
//        respuestamas = (-ecuacion.getB() + Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());
//        System.out.println(respuestamas);
//       
//    }
//    
//    public void obtenerRaices(Entidades ecuacion){
//        double respuestamenos, respuestamas;
//            
//        respuestamas = (-ecuacion.getB() + Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());
//        respuestamenos = (-ecuacion.getB() - Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());
//        System.out.println("Los resultados son: \n " + respuestamas + "\n " + respuestamenos);
//        
//    }
//
//    public void calcular(Entidades ecuacion, double disc) {
//
//        if (tieneRaices(getDiscriminante(ecuacion))) {
//            System.out.println("Posee multiples raices.");
//            obtenerRaices(ecuacion);
//        }else if (tieneRaiz(getDiscriminante(ecuacion))) {
//            System.out.println("Posee solo una raiz.");
//            obtenerRaiz(ecuacion);
//        }else{
//            System.out.println("No tiene raiz.");
//        }
//    }
    
    //-------------------EJ 2 Extra-----------------------//
    
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    
//    public Entidades crearNIF(){
//        String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
//        System.out.println("Ingrese su DNI:");
//        String dnis = consola.next();
//        var dni = Long.parseLong(dnis);
//        String nif = "";
//        var pos = dni % 23;
//        for (int i = 0; i < 22; i++) {
//            if (pos == i) {
//                nif = letra[i];
//            }
//        }
//     
//        
//        return new Entidades(dnis, nif);
//    }
//    
//    public void mostrar(Entidades dninif){
//        System.out.println("Su NIF es: \n" + dninif.getDni() + "-" + dninif.getNif());
//    }
    
}
