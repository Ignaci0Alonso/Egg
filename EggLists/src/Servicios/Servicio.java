package Servicios;

import java.util.*;
import Entidades.*;

public class Servicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Entidad crearMascota() {

        System.out.println("Ingrese los siguientes datos: \n-Nombre:");
        String nombre = scan.nextLine();
        System.out.println("-Apodo:");
        String apodo = scan.nextLine();
        System.out.println("-Tipo:");
        String tipo = scan.nextLine();
        System.out.println("-Edad:");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("-Raza:");
        String raza = scan.nextLine();
        System.out.println("-Color");
        String color = scan.nextLine();
        return new Entidad(nombre, apodo, tipo, edad, raza, color);
    }

    public void mostrarMascota(List mascotas) {
        for (Object mascota : mascotas) {
            System.out.println("----------- Mascotas -----------");
            System.out.println(mascota.toString());
        }
    }

    public void eliminarMascota(List mascotas) {
        int index;
        System.out.println("----------- Eliminando -----------");
        do {
            System.out.println("Que numero de mascota desea eliminar?");
            index = scan.nextInt() - 1;
            scan.nextLine();
            if (index <= mascotas.size() && index >= 0) {
                mascotas.remove(index);
            } else {
                System.out.println("Error al eliminar mascota, numero de indice no valido.");
            }
        } while (index > mascotas.size() && index < 0);

    }
    
    public void editarMascota(List mascotas){
        int index;
        System.out.println("----------- Editando -----------");
        do {
            System.out.println("Que numero de mascota desea editar?");
            index = scan.nextInt() - 1;
            scan.nextLine();
            if (index <= mascotas.size() && index >= 0) {
                mascotas.set(index, crearMascota());
            } else {
                System.out.println("Error al editar la mascota, numero de indice no valido.");
            }
        } while (index > mascotas.size() && index < 0);
    }public class servicioAlumnos {
        
}
