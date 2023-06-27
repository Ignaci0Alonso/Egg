
package Entidad;

import java.util.*;

public class Alumno {

    private String nombre;
    private long dni;
    private int cantVotos;
    private ArrayList<Alumno> votos = new ArrayList();
    
    public Alumno() {
    }

    public Alumno(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    public ArrayList<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<Alumno> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", cantidad de votos: " + cantVotos;
    }
    
    public void Votos() {
        System.out.println(nombre + " ha votado a: ");
        for (Alumno voto : votos) {
            System.out.println("- " + voto);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.dni ^ (this.dni >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.dni == other.dni;
    }
    
    
    
}
