
package EntidadesEjTeoria;

public abstract class AnimalTeoria {
    
    protected String tipo;

    public AnimalTeoria(String tipo){
        this.tipo = tipo;
    }
    
    public abstract void hacerRuido();
       
    

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + '}';
    }
    
}
