
package ServiciosExtra2;

import EntidadesExtraEj2.*;

public class OficinasServicio extends EdificioService{

    public Oficinas crearOficinas() {
        Edificio ed = super.crearEdificio();
        System.out.println("Numero de oficinas");
        int oficinas = scan.nextInt();
        System.out.println("Numero de pisos");
        int pisos = scan.nextInt();
        return new Oficinas();
    }
    
    public int cantPersonas(double superficie, int pisos){
        return 
    }
    @Override
    public double calcularSuperficie(Edificio edificio) {
        return edificio.getAncho() * edificio.getAncho();
    }
    @Override
    public double calcularVolumen(Edificio edificio) {
        return edificio.getAlto() * edificio.getAncho() * edificio.getLargo();
    }
}
