
package Servicios;

import Enemigos.Enemigo;
import java.util.Random;

public class EnemigoService {

    public Enemigo crearEnemigo() {
        return new Enemigo();
    }
    
    public boolean disparoEnemigo(int resistencia) {
        
        boolean hit = false;
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(0,100);
        if (num>resistencia) {
            hit = true;
        }
        
        return hit;
    }
}
