
package EntidadesExtraEj2;

public class Polideportivo extends Edificio{

    protected boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(boolean techado, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.techado = techado;
    }
    
    
    
}
