
package ServiciosExtra2;

import EntidadesExtraEj2.*;
import java.util.Scanner;

public abstract class EdificioService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Edificio crearEdificio() {
        
        
        System.out.println("Alto");
        double alto = scan.nextDouble();
        System.out.println("Largo");
        double largo = scan.nextDouble();
        System.out.println("Ancho");
        double ancho = scan.nextDouble();
        
        return new Edificio(ancho, largo, alto); 
    }

    public abstract double calcularSuperficie(Edificio edificio);
    
    public abstract double calcularVolumen(Edificio edificio);
    
    
    
}
