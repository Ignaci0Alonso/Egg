package Servicio;

import java.util.*;
import Entidad.Jugador;
import Entidad.Revolver;

public class Juego {

    Random aleatorio = new Random();
    private Revolver revolver;
    private ArrayList<Jugador> jugador = new ArrayList();

    public Revolver getRevolver() {
        return revolver;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {

        System.out.println("Cuantos jugadores habra? 1 a 6");
        int cant = scan.nextInt();
        if (cant > 6) {
            cant = 6;
        }
        for (int i = 0; i < cant; i++) {
            jugador.add(new Jugador(i + 1));
        }
        int posAgua = aleatorio.nextInt(6 - 1 + 1) + 1;
        int pos = aleatorio.nextInt(6 - 1 + 1) + 1;
        revolver = new Revolver(pos, posAgua);
    }

    public void jugarJuego() {
        int num = 0;
        int cont = 0;
        do {
            for (Jugador ronda : jugador) {
                cont++;
                System.out.println("Ronda " + cont);
                System.out.println("Turno del Jugador " + ronda.getId());
                System.out.println(revolver.toString());
                ronda.disparo(revolver);
                if (ronda.isMojado()) {
                    System.out.println("BANG!");
                    num = ronda.getId();
                    break;
                }
            }
        } while (num == 0);
        System.out.println("El Jugador " + num + " perdio.");
    }


}
