
package Servicios;

import EntidadesEj2.Electrodomesticos;
import EntidadesEj2.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticosService{

    
    public Lavadora crearLavadora() {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Electrodomesticos e1 = super.crearElectrodomesticos();
        System.out.println("Ingrese la carga del electrodomestico:");
        int carga = scan.nextInt();
        return new Lavadora(carga, e1.getPrecio(),e1.getColor(),e1.getConsumo(), e1.getPeso());
    }
    
    @Override
    public void precioFinal(Electrodomesticos lv) {
        super.precioFinal(lv);
        Lavadora lav = (Lavadora) lv; 
        if(lav.getCarga()>=30) {
            lv.setPrecio(lv.getPrecio()+500d);
        }
        
    }
    
}
