
package Entidad;

import Enumeradores.Palos;
import java.util.Objects;

public class Cartas {

    private int numero;
    private Palos palo;

    public Cartas(int numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Cartas() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numero;
        hash = 89 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartas other = (Cartas) obj;
        return true;
    }

    @Override
    public String toString() {
        return """
               __________________________________
                - Numero: """ + numero + ", palo: " + palo;
    }
    
    
}
