
package EntidadesEj1;

public class Gato extends Animal{

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Los gatos son " + alimento);
    }

    @Override
    public String toString() {
        return "Gato: " + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad;
    }
    
}
