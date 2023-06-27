
package EntidadesExtraEj2;

public class Oficinas extends Edificio {

   protected int oficinas;
   protected int personas;
   protected int pisos;

    public Oficinas() {
    }

    public Oficinas(int oficinas, int personas, int pisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }
    
   
    
    
}
