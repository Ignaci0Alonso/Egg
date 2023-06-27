
package EntidadesEj1;

public class Perro extends Animal{

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Los perros son " + alimento);
    }

    @Override
    public String toString() {
        return "Perro: " + "nombre=" + nombre + ", raza" + raza + ", edad" + edad;
    }

    
    
}
