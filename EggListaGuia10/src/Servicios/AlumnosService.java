package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosService {

    ArrayList<Alumnos> listaAlumnos = new ArrayList();
    Scanner leer = new Scanner(System.in);
    String Nombres;

    public void cargarAlumnos() {
        ArrayList<Double> notas;
        String op;
        do {
            notas = new ArrayList<>();
            System.out.println("ingrese nombre del alumno");
            Nombres = leer.next();
            System.out.println("ingrese las 3 notas del alumno");
            for (int i = 0; i < 3; i++) {
                notas.add(i, leer.nextDouble());

            }
            listaAlumnos.add(new Alumnos(Nombres, notas));
            do {
                System.out.println("desea ingresar otro alumno? si/no");
                op = leer.next();
                if (!op.equalsIgnoreCase("no") && !op.equalsIgnoreCase("si")) {
                    System.out.println("Error, opcion no valida: "+ op +". si/no");
                }
            } while (!op.equalsIgnoreCase("no") && !op.equalsIgnoreCase("si"));
            
        } while (!op.equalsIgnoreCase("no"));
    }

    public double notaFinal() {

        System.out.println("ingrese el nombre del alumno que desea saber la nota final");
        String alumnoFinal = leer.next();
        double notaFinal = 0;
        double promedioFinal = 0;
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(alumnoFinal)) {
                for (Double nota : alumno.getNotas()) {
                    notaFinal += nota;
                }
                promedioFinal = notaFinal / 3;
            }

        }
        return promedioFinal;
    }
}
