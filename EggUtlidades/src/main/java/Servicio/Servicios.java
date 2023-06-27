package Servicio;

import Entidades.Entidad;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Servicios {

    //--------------EJ 1 Cadena------------------//
//    public void mostrarVocales(Entidad frase) {
//        int cont = 0;
//
//        for (int i = 0; i < frase.getLongitud(); i++) {
//            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {
//                case "a" ->
//                    cont++;
//                case "e" ->
//                    cont++;
//                case "i" ->
//                    cont++;
//                case "u" ->
//                    cont++;
//                case "o" ->
//                    cont++;
//            }
//
//        }
//        System.out.println("Tiene " + cont + " vocales.");
//
//    }
//
//    public void invertirFrase(Entidad frase) {
//        for (int i = frase.getLongitud(); i > 0; i--) {
//            System.out.print(frase.getFrase().substring(i - 1, i));
//        }
//        System.out.println("");
//    }
//
//    public void vecesRepetido(Entidad frase, String letra) {
//        int cont = 0;
//        for (int i = 0; i < frase.getLongitud(); i++) {
//            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
//                cont++;
//            }
//        }
//        System.out.println("El caracter " + letra + " se repite " + cont + " veces.");
//    }
//
//    public void compararLongitud(Entidad frase, String nf) {
//
//        if (frase.getLongitud() == nf.length()) {
//            System.out.println("La longitud de ambas frases es la misma.");
//        } else if (frase.getLongitud() > nf.length()) {
//            System.out.println("La longitud de la segunda frase es menor.");
//        } else {
//            System.out.println("La longitud de la segunda frase es mayor.");
//        }
//    }
//
//    public void unirFrases(Entidad frase, String nf) {
//        String fraseUnidas = frase.getFrase() + " " + nf;
//        System.out.println(fraseUnidas);
//    }
//
//    public void remplazar(Entidad frase, String cara) {
//        for (int i = 0; i < frase.getLongitud(); i++) {
//
//            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
//                System.out.print(cara);
//            } else {
//                System.out.print(frase.getFrase().substring(i, i + 1));
//
//            }
//        }
//        System.out.println("");
//    }
//    
//    public boolean contiene(Entidad frase, String letra) {
//        return frase.getFrase().contains(letra);
//    }
    //----------------------Ej 2 Par de Numeros----------------------//
//    public void mostrarVocales(Entidad ne) {
//        System.out.println("El primer numero es: " + ne.getNum1());
//        System.out.println("El segundo numero es: " + ne.getNum2());
//    }
//
//    public double devolverMayor(Entidad ne) {
//        return Math.max(ne.getNum1(), ne.getNum2());
//    }
//
//    public void potencia(double mayor, Entidad ne) {
//        System.out.println("La potencia de " + Math.round(mayor) + "(redondeado) elevado a " + Math.round(Math.min(ne.getNum1(), ne.getNum2())) + "(redondeado) es: ");
//        System.out.println((int)Math.pow(mayor,Math.min(ne.getNum1(), ne.getNum2())));
//    }
//
//    public void raiz(Entidad ne) {
//        System.out.println("La raiz cuadrada de " + Math.min(ne.getNum1(), ne.getNum2()) + " es: ");
//        System.out.println((int)Math.sqrt(Math.abs(Math.min(ne.getNum1(), ne.getNum2()))));
//    }
    //----------------Ej 3 ---------------------//
//    Random aleatorio = new Random();
//    
//    public int[] iniciarA(int[] a){
//        for (int i = 0; i < a.length; i++) {
//            a[i] = aleatorio.nextInt(50 - 0 + 1) + 0;
//        }
//        return a;
//    }
//    
//    public void mostrar(int[] a){
//        for (int i = 0; i < a.length; i++) {
//            if (i<a.length-1) {
//                System.out.print(a[i] + ", ");
//            }else{
//                System.out.println(a[i]);
//            }
//            
//        }
//        
//    }
//   
//    public void ordenar(int[] a){
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("(" + a[i] + ") ");
//        }
//        System.out.println("");
//    }
//    
//    public void llenarB(int[] a, double[] b){
//        for (int i = 0; i < 10; i++) {
//            b[i] = a[i];
//        }
//        Arrays.fill(b, 10,20, 0.5);
//        for (int i = 0; i < b.length; i++) {
//            System.out.print("(" + b[i] + ") ");
//        }
//    }
    //----------------------Ej 4 fechas-------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    public Date fechaNacimiento(){
//        System.out.println("Ingresar fecha de nacimiento (año/mes/fecha):");
//        System.out.println("EJ: \n 2001 \n 10(octubre) \n 23");
//        System.out.println("Año: ");
//        int anio = consola.nextInt()-1900;
//        System.out.println("Mes: ");
//        int mes =consola.nextInt()-1;
//        System.out.println("Dia: ");
//        int dia = consola.nextInt();
//        return new Date(anio, mes, dia);
//    }
//    
//    public Date fechaActual(){
//        return new Date();
//    }
//    
//    public void diferencia(Date fechaN, Date fechaA){
//        int difanio = fechaA.getYear() - fechaN.getYear();
//        int difmes = fechaA.getMonth() - fechaN.getMonth();
//        int difdia = fechaA.getDate() - fechaN.getDate();
//        if (difmes < 0 || (difmes == 0 && difdia < 0)) {
//            difanio = difanio - 1;
//        }
//        System.out.println("Su edad es: " + difanio + " años");
//    }
    //------------------Ej 5 ------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    public Entidad crearPersona(){
//        
//        System.out.println("Ingrese los siguientes datos: \n - Nombre: " );
//        String nombre = consola.nextLine();
//        System.out.println(" - Fecha de Nacimiento: (año/mes/dia");
//        int anio = consola.nextInt()-1900;
//        int mes = consola.nextInt()-1;
//        int dia = consola.nextInt();
//        Date fechaN = new Date(anio, mes, dia);
//        return new Entidad(nombre, fechaN);
//    }
//    
//    public int calcularEdad(Entidad persona){
//        Date fechaA = new Date();
//        int anio = fechaA.getYear() - persona.getFechaN().getYear();
//        int mes = fechaA.getMonth() - persona.getFechaN().getMonth();
//        int dia = fechaA.getDay() - persona.getFechaN().getDay();
//        if (mes < 0 || (mes == 0 && dia < 0)) {
//            anio -= 1;
//        }
//       
//        return anio;
//    }
//    
//    public boolean menorQue(Entidad persona, int edad){
//        return edad > calcularEdad(persona);
//    }
//    
//    public void mostrar(Entidad persona, int edad){
//        System.out.print("Datos recolectados de la persona: \n - Nombre: " + persona.getNombre() + "\n - Fecha de Nacimiento: " + persona.getFechaN() + "\n - Edad: " + calcularEdad(persona) + "\n - Es menor que " + edad + "? " + menorQue(persona, edad));
//    }
    //------------------Ej 6 ---------------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    public Entidad crearCurso(){
//        System.out.println("Ingrese los siguientes datos: \n - Nombre del curso: "  );
//        String nombreCurso = consola.nextLine();
//        System.out.println(" - Cantidad de horas por dia:");
//        int horasDia = consola.nextInt();
//        System.out.println(" - Cantidad de dias por semana:");
//        int diaSemana = consola.nextInt();
//        String turno = "";
//        do {
//            System.out.println(" - Turno: 'mañana = m' o 'tarde = t");
//            turno = consola.next();
//            if (turno.equalsIgnoreCase("t")) {
//                turno = "tarde";
//            }else if(turno.equalsIgnoreCase("m")){
//                turno = "mañana";
//            }else{
//                System.out.println("Opcion no valida.");
//            }
//        } while (!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde"));
//        System.out.println(" - Precio por hora:");
//        double precio = consola.nextDouble();
//        
//        return new Entidad(nombreCurso, horasDia, diaSemana, turno, precio, cargarAlumnos());
//    }
//    
//    public String[] cargarAlumnos(){
//        String[] alumnos = new String[5];
//        System.out.println("Ingrese los nombres de los alumnos.");
//        consola.nextLine();
//        for (int i = 0; i < alumnos.length; i++) {
//            System.out.println("Alumno numero " + (i+1));
//            alumnos[i] = consola.nextLine();
//        }
//        return alumnos;
//    }
//    
//    public void calcularGananciaSemanal(Entidad curso){
//        System.out.println("La ganancia semanal del curso " + curso.getNombreCurso() + " del turno " + curso.getTurno() + " es:");
//        System.out.println("$" + ((curso.getCantidadHorasDia()*curso.getCantidadDiaSemana())*curso.getPrecioHora())*curso.getAlumnos().length);
//        System.out.println(" ");
//        System.out.println("La ganancia por dia del curso " + curso.getNombreCurso() + " del turno " + curso.getTurno() + " es:");
//        System.out.println("$" + (curso.getCantidadHorasDia()*curso.getPrecioHora())*curso.getAlumnos().length);
//        System.out.println(" ");
//        System.out.println("La ganancia semanal por alumno es:");
//        System.out.println("$" + (curso.getCantidadHorasDia()*curso.getCantidadDiaSemana())*curso.getPrecioHora());
//    }
    //----------------Ej 1 extra----------------//
//    public void adivinar(String[] mes){
//        Scanner consola = new Scanner(System.in).useDelimiter("\n");
//        Random aleatorio = new Random();
//        int mesSecreto = aleatorio.nextInt(11 - 0 + 1) + 1;
//        System.out.println(mes[mesSecreto]);
//        //mes[0} = "enero"
//        String adivina;
//        do {
//            System.out.println("Ingrese un mes:");
//            adivina = consola.next();
//            if (!adivina.equalsIgnoreCase(mes[mesSecreto])) {
//                System.out.println("Incorrecto!");      
//            }
//        } while (!adivina.equalsIgnoreCase(mes[mesSecreto]));
//        
//        System.out.println("Correcto, el mes era:" + mes[mesSecreto]);
//        
//    }
    //-----------------Ej 2 extra---------------//
//    Scanner consola = new Scanner(System.in).useDelimiter("\n");
//    public Entidad crearJuego(){
//        System.out.println("Ingrese una palabra para jugar");
//        String palabra = consola.next();
//        char[] vp = palabra.toCharArray(); 
//        int cantLetras = palabra.length();
//        char[] ad = new char[palabra.length()];
//        for (int i = 0; i < palabra.length(); i++) { 
//            ad[i] = '-'; // comillas simples para char.
//        }
//        int pifios = 6;
//        return new Entidad(vp, ad, cantLetras, pifios);
//    }
//    // pa.longitud(palabra.getCantLetras);
//    public void longitud(int cantLetras){
//        System.out.println("La longitud de la palabra a adivinar es: " + cantLetras);
//    }
//    
//    public char buscar(Entidad ahorcado){
//        char ad ='-';
//        String letraString;
//            System.out.println("Ingrese una letra: ");
//            char letra = consola.next().charAt(0);
//        int cont=0;
//        
//        for (int i = 0; i < ahorcado.getCantLetras(); i++) {
//            if (letra != ahorcado.getPalabra()[i]) {
//                cont++;
//        }
//        }    
//        if (cont == ahorcado.getCantLetras()) {
//            System.out.println("La letra no se encuentra en la palabra.");
//            ahorcado.setPifios(ahorcado.getPifios()-1);
//        }else{
//            System.out.println("La letra si esta en la palabra.");
//            ad = letra;
//        }
//        
//    
//    return ad;
//   
//    }
////    public void encontrar(char ad,Entidad ahorcado){
////        char[] rem = new char[ahorcado.getCantLetras()];
////        System.arraycopy(ahorcado.getAdivinados(), 0, rem, 0, ahorcado.getCantLetras());
////        
////        for (int i = 0; i < ahorcado.getCantLetras(); i++) {
////            if (ad == ahorcado.getPalabra()[i]) {
////                rem[i]=ad;
////            }
////        }
////        ahorcado.setAdivinados(rem);
////        System.out.println("Asi queda:");
////        for (int i = 0; i < ahorcado.getCantLetras(); i++) {
////            System.out.print(ahorcado.getAdivinados()[i]); //a-a || ---
////        }
////        System.out.println("");
////    }
//    
//    
//    public void encontrar(Entidad ahorcado, char ad){
//        for (int i = 0; i < ahorcado.getCantLetras(); i++) {
//           if (ad == ahorcado.getCantLetras()){
//               ahorcado.setAdivinadosPos(ad,i);
//           } 
//        }
//    }
//    
//    public void intentos(Entidad ahorcado){
//        System.out.println("Intentos restantes: " + ahorcado.getPifios());
//    }
//    
//    public void juego(Entidad ahorcado){
//       longitud(ahorcado.getCantLetras());
//        do {
//            encontrar(buscar(ahorcado),ahorcado);
//            intentos(ahorcado);
//            
//        } while (ahorcado.getPifios()!=0 && !Arrays.equals(ahorcado.getAdivinados(), ahorcado.getPalabra()));
//        
//        if (ahorcado.getPifios()!=0) {
//            System.out.println("Felicidades!");
//        }else {
//            System.out.println("Nop");
//        }  
//    }
    //---------------Ej Integrador-------------//
    
    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    
    public Entidad crearEmpleado(int num){
        System.out.println("Ingresar el nombre del empleado " + num);
        String nombre = consola.nextLine();
        System.out.println("Ingresar el salario del empleado " + num);
        double salario = consola.nextDouble();
        consola.nextLine();
        return new Entidad(nombre, salario);
    }
    
    public double promedio(Entidad[] empleado){
        int suma=0;
        for (int i = 0; i < empleado.length; i++) {
            suma+=empleado[i].getSalario();
        }
        double prom = suma/empleado.length;
        return prom;
    }
    
    public String[] mayores(Entidad[] empleado){
        int cont=0;
        for (int i = 0; i < empleado.length; i++) {
            if (empleado[i].getSalario()>promedio(empleado)) {
                cont++;
            }
        }
        String[] mayores = new String[cont];
        int cont1=0;
        for (int i = 0; i < empleado.length; i++) {
            if (empleado[i].getSalario()>promedio(empleado)) {
                mayores[cont1] = empleado[i].getNombre();
                cont1++;
            }
        }
        return mayores;
    }
}

