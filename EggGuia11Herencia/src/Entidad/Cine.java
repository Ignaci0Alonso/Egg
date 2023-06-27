
package Entidad;

import java.util.*;

public class Cine {

    private Pelicula peli;
    private ArrayList<Cliente> cliente;
    private String[][] sala;
    private double precio;
    
    public Cine() {
    }

    public Cine(Pelicula peli, ArrayList<Cliente> cliente, String[][] sala, double precio) {
        this.peli = peli;
        this.cliente = cliente;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
