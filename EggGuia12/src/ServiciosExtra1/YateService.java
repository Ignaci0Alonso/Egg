
package ServiciosExtra1;

import EntidadesExtra1.*;

public class YateService extends AlquilerService{

    public Yate crearYate(int cv, int camarotes) {
        
        Barco bc = super.crearBarco();
//        System.out.println("CV del yate:");
//        int cv = scan.nextInt();
//        System.out.println("Numero de camarotes:");
//        int camarotes = scan.nextInt();
        
        return new Yate(cv, camarotes, bc.getMatricula(), bc.getMetrosEslora(), bc.getFabricacion());
    }
    
    @Override
    public double precioFinal(Alquiler alquiler) {
        Yate yate = (Yate)alquiler.getBarco();
        return super.precioFinal(alquiler) *  yate.getCv() * yate.getCamarotes();
    }
    
}
