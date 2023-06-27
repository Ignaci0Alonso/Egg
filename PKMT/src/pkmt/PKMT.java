
package pkmt;

import PokemonServicio.Servicio;
import Pokemon.*;

public class PKMT {

    public static void main(String[] args) {
        System.out.println("EMPEZO");
        Servicio ps = new Servicio();
        String[] tipos = {"NOR","FUE","AGU","ELE","PLA","HIE","LUC","VEN","TIE","ROC","BIC","PSI","BIC","FAN","PLA","VOL","DRG","SIN","HAD"};
        Equipo eq = ps.crearEquipo(tipos);
        System.out.println(eq.toString());
    }

}
