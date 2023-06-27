
package EntidadesEjTeoria;

public final class GatoTeoria extends AnimalTeoria{

    protected String raza;

    public GatoTeoria(String raza, String tipo) {
        super(tipo);
        this.raza = raza;
    }
    
    @Override
    public void hacerRuido(){
        
        System.out.println("Miau miau mdfkr");
    }    

    @Override
    public String toString() {
        return "Gato{" + "tipo=" + tipo + ", raza=" + raza + '}';
    }
    
}
