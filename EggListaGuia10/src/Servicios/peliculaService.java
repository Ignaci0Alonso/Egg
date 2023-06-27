package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class peliculaService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {

        System.out.println("Introduzca los siguientes datos:");
        System.out.println("-Titulo:");
        String titulo = scan.next();
        System.out.println("-Director:");
        String director = scan.next();
        System.out.println("-Duracion:");
        float duracion = scan.nextFloat();

        return new Pelicula(titulo, director, duracion);
    }

    public void mostrarPeliculas(ArrayList po) {
        for (Object peli : po) {
            System.out.println(peli.toString());
        }
    }

    public void mostrarMasUnaHora(ArrayList<Pelicula> po) {
        for (Pelicula pelicula : po) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo() + ": " + pelicula.getDuracion());
            }
        }

    }

    public void mostrarMayorHora(ArrayList<Pelicula> po) {
        System.out.println("Organizado de mayor duracion a menor.");
        po.sort(Pelicula.compararDuracionMayor);
        for (Pelicula pelicula : po) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarMenorHora(ArrayList<Pelicula> po){
        System.out.println("Organizado de menor duracion a mayor.");
        po.sort(Pelicula.compararDuracionMenor);
        for (Pelicula pelicula : po) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarTitulo(ArrayList<Pelicula> po) {
        System.out.println("Organizado por titulo Alfabeticaente.");
        po.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula : po) {
            System.out.println(pelicula.toString());
        }
        //Integer.compare(0, 0);
        //Double.compare(0, 0);
    }
    
    public void mostrarDirector(ArrayList<Pelicula> po) {
        System.out.println("Organizado por Director Alfabeticamente.");
        po.sort(Pelicula.compararDirector);
        for (Pelicula pelicula : po) {
            System.out.println(pelicula.toString()); 
        }
    }
    
}
