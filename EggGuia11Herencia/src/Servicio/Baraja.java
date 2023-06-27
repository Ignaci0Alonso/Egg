
package Servicio;

import java.util.*;
import Entidad.Cartas;
import Enumeradores.Palos;
import static Enumeradores.Palos.*;

public class Baraja {

    private ArrayList<Cartas> cartas = new ArrayList();
    private ArrayList<Cartas> monton = new ArrayList();
    private int pos;

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
    
    public void crearBaraja() {
        Palos palo = null;
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    palo = BASTO;
                    break;
                case 1:
                    palo = ESPADA;
                    break;
                case 2:
                    palo = ORO;
                    break;
                case 3:
                    palo = COPA;
                    break;
            }
            for (int j = 1; j < 11; j++) {
                if (j<8) {
                    cartas.add(new Cartas(j, palo));
                }else{
                    cartas.add(new Cartas(j+2, palo));
                }
                
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    public void cartaSiguiente() {
        monton.add(cartas.get(getPos()));
        System.out.println(cartas.get(getPos()).toString());
        cartas.remove(getPos());
    }
    
    public int cartasDisponibles() {
        return cartas.size();
    }
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void darCartas() {
        int cant;
        String salir;
        do {
            System.out.println("Cuantas cartas desea?");
            cant = scan.nextInt();
            if (cant<=cartasDisponibles()) {
                for (int i = 0; i < cant; i++) {
                    cartaSiguiente();
                    
                }
                
            }else{
                System.out.println("La cantidad solicitada es mayor a la cantidad de cartas disponibles.");
            }
            System.out.println("Desea salir? s/S");
            salir = scan.next();
        } while (!salir.equalsIgnoreCase("s"));
        
    }
    
    public void cartasMonton() {
        if (getPos()>0) {
            for (int i = getPos()-1; i > -1; i--) {
            System.out.println(cartas.get(i).toString());
        }
        }else{
            System.out.println("No hay cartas en el monton.");
        }
        
    }
    
    public void mostrarBaraja() {
        for (int i = getPos(); i < cartas.size(); i++) {
            System.out.println(cartas.get(i).toString());
        }
    }
}
