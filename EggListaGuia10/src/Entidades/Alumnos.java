
package Entidades;

import java.util.ArrayList;

public class Alumnos {

    private String nombre;
    private ArrayList<Double> notas;

    public Alumnos() {
    }

    public Alumnos(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    
    
}
