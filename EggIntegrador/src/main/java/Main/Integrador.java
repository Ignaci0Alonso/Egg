
package Main;

import Service.*;
import Entities.*;

public class Integrador {

    public static void main(String[] args) {
        EstudianteService es = new EstudianteService();
        Estudiante eo[] = new Estudiante[8];
        for (int i = 0; i < eo.length; i++) {
            eo[i] = es.crearEstudiante(i+1);
        }
        System.out.println("---------------------------------------");
        System.out.println("El promedio es: " + es.calcularPromedio(eo));
        System.out.println("---------------------------------------");
        System.out.println("Los estudiantes que estubieron por encima del promedio son: ");
        for (int i = 0; i < es.mayoresQuePromedio(eo).length; i++) {
            System.out.println((i+1) + ") " + es.mayoresQuePromedio(eo)[i] + ": " + es.mayoresNotasQuePromedio(eo)[i]);
        }
    }

}
