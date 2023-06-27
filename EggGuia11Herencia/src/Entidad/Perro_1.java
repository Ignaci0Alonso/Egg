package Entidad;

public class Perro_1 {
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    private boolean adoptado = false;
    
    public Perro_1() {
    }

    public Perro_1(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    
    @Override
    public String toString() {
        return " \n- Nombre: " + nombre + "\n- Raza: " + raza + "\n- Edad: " + edad + "\n- Tamaño: " + tamaño + "\n- Adoptado: " + adoptado;
    }
    
    
    
}
