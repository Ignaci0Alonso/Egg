
package EntidadesEjTeoria;

public final class PerroTeoria extends AnimalTeoria{

    protected String raza;

    public PerroTeoria(String raza, String tipo) {
        super(tipo);
        this.raza = raza;
    }
    
    @Override
    public void hacerRuido(){
        
        System.out.println("Guau Guau btch");
    }

    @Override
    public String toString() {
        return "Perro{" + "tipo=" + tipo +"raza=" + raza + '}';
    }
    
}
