
package Entidad;

import java.util.Objects;

public class Persona_1 {
    
    private Perro_1 perro;
    private String nombre;
    private long dni;
    private String apellido;
    private int edad;

    public Persona_1() {
    }

    public Persona_1(String nombre, long dni, String apellido, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Perro_1 getPerro() {
        return perro;
    }

    public void setPerro(Perro_1 perro) {
        this.perro = perro;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.perro);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (this.dni ^ (this.dni >>> 32));
        hash = 53 * hash + Objects.hashCode(this.apellido);
        hash = 53 * hash + this.edad;
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
        final Persona_1 other = (Persona_1) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Datos del usuario: \n- Nombre: " + nombre + "\n- Apellido: " + apellido + "\n- DNI: " + dni + "\n- Edad: " + edad + "\nDatos del perro de " + nombre + ": " + perro.toString();
    }
    
    
    
}
