
package ServiciosExtra1;

import EntidadesExtra1.*;

public class VeleroService extends AlquilerService {

    public Velero crearVelero(int mastiles) {
        
        Barco bc = super.crearBarco();
//        System.out.println("Numero de mastiles del velero:");
//        int mastiles = scan.nextInt();
        
        return new Velero(mastiles, bc.getMatricula(), bc.getMetrosEslora(), bc.getFabricacion());
    }
    
    @Override
    public double precioFinal(Alquiler alquiler) {
        Velero motor = (Velero)alquiler.getBarco();
        return super.precioFinal(alquiler) *  motor.getMastiles();
    }
    
}
