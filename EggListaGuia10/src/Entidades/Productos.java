
package Entidades;

import java.util.Comparator;
import java.util.Objects;

public class Productos {

    private Double precio;
    private String nombre;

    public Productos() {
    }

    public Productos(Double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productos{" + "precio=" + precio + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.precio);
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Productos other = (Productos) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.precio, other.precio);
    }
    
    
    
    public static Comparator<Productos> compararNombres = (Productos p1, Productos p2) -> p1.getNombre().compareTo(p2.getNombre());
    public static Comparator<Productos> compararPreciosDescendente = (Productos p1, Productos p2) -> p2.getPrecio().compareTo(p1.getPrecio());
    public static Comparator<Productos> compararPrecioAscendente = (Productos p1, Productos p2) -> p1.getPrecio().compareTo(p2.getPrecio());
}
