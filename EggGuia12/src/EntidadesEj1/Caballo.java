
package EntidadesEj1;

public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Los caballos son " + alimento);
    }

    @Override
    public String toString() {
        return "Caballo: " + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad;
    }
    
}
