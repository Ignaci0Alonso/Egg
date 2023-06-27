
package EntidadesExtra1;

import java.util.Date;

public class Alquiler {
    
    protected String nombre;
    protected long dni;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected int posBarco;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, Date fechaAlquiler, Date fechaDevolucion, int posBarco, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posBarco = posBarco;
        this.barco = barco;
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

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosBarco() {
        return posBarco;
    }

    public void setPosBarco(int posBarco) {
        this.posBarco = posBarco;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    

}
