
package Entidad;

import java.util.HashSet;

public class ClientesVehiculos {
    
    private String nombre;
    private long dni;
    private String mail;
    private String domicilio;
    private HashSet<Vehiculo> vehiculos;
     
    
    public ClientesVehiculos() {
    }

    public ClientesVehiculos(String nombre, long dni, String mail, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public HashSet<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(HashSet<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "\n -Nombre=" + nombre + ", DNI=" + dni + ", Mail=" + mail + ", Domicilio=" + domicilio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.dni ^ (this.dni >>> 32));
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
        final ClientesVehiculos other = (ClientesVehiculos) obj;
        return true;
    }
    
    

}
