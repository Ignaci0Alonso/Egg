package ServiciosExtra1;

import EntidadesExtra1.*;
import java.util.*;

public class AlquilerService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(int posBarco, Barco barco) {
        
        System.out.println("Nombre:");
        String nombre = scan.next();
        System.out.println("DNI:");
        long dni = scan.nextLong();
        System.out.println("Fecha de alquier:");
        System.out.println("Dia:");
        int dia = scan.nextInt();
        System.out.println("Mes:");
        int mes = scan.nextInt() - 1;
        System.out.println("Año(completo, ej, 2000):");
        int anio = scan.nextInt() - 1900;
        Date fechaAlquiler = new Date(anio, mes, dia);
        System.out.println("Fecha de devolucion:");
        System.out.println("Dia:");
        int dia1 = scan.nextInt();
        System.out.println("Mes:");
        int mes1 = scan.nextInt() - 1;
        System.out.println("Año(completo, ej, 2000):");
        int anio1 = scan.nextInt() - 1900;
        Date fechaDevolucion = new Date(anio1, mes1, dia1);
        
        return new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, posBarco, barco);
    }

    public Barco crearBarco() {
        
//        System.out.println("Matricula:");
        int matricula = 242;
//        System.out.println("Metros de eslora:");
        int metrosEslora = 6;
//        System.out.println("Fecha de fabricacion:");
//         System.out.println("Dia:");
        int dia1 = 1;
//        System.out.println("Mes:");
        int mes1 = 11 - 1;
//        System.out.println("Año(completo, ej, 2000):");
        int anio1 = 2000 - 1900;
        Date fechaFabricacion = new Date(anio1, mes1, dia1);
        
        return new Barco(matricula, metrosEslora, fechaFabricacion);
    }
    
    // 2002 - 2001 = 1 -1=0
    // 5 - 9 = -4 + 12 = 8 - 1 = 7 * 30 = 210
    // 29 - 30 = -1 + 30 = 29
    
    public int diasDeAlquiler(Alquiler alquiler) {
        
        int dias = alquiler.getFechaDevolucion().getDate() - alquiler.getFechaAlquiler().getDate();
        int meses = alquiler.getFechaDevolucion().getMonth() - alquiler.getFechaAlquiler().getMonth();
        int anios = alquiler.getFechaDevolucion().getYear() - alquiler.getFechaAlquiler().getYear();
        if (dias<0) {
            dias+=30;
        }
        if (alquiler.getFechaDevolucion().getDate() < alquiler.getFechaAlquiler().getDate()) {
            meses -= 1;
        }
        if (meses<0) {
            meses += 12;
        }
        if (alquiler.getFechaDevolucion().getMonth() < alquiler.getFechaAlquiler().getMonth()) {
            anios -= 1;
        }
        meses *= 30;
        anios *= 360;
        
        return meses + anios + dias;
    }
    
    public double precioFinal(Alquiler alquiler) {
        return diasDeAlquiler(alquiler) * (alquiler.getBarco().getMetrosEslora() * 10);
    }
    
    
    
}
