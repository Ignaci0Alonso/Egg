
package ServiciosExtra1;

import EntidadesExtra1.*;

public class MotorService extends AlquilerService {

    public Motor creatMotor(int cv) {
        
        Barco bc = super.crearBarco();
//        System.out.println("CV del barco a motor:");
//        int cv = scan.nextInt();
        
        return new Motor(cv, bc.getMatricula(), bc.getMetrosEslora(), bc.getFabricacion());
    }
    
    @Override
    public double precioFinal(Alquiler alquiler) {
        Motor motor = (Motor)alquiler.getBarco();
        return super.precioFinal(alquiler) *  motor.getCv();
    }
}
