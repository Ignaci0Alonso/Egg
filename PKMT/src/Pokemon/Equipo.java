
package Pokemon;

import java.util.*;

public class Equipo {
    
    private HashMap<String, Integer> efectividades;
    private ArrayList<Pkm> pokemones;

    public Equipo() {
    }

    public Equipo(HashMap<String, Integer> efectividades, ArrayList<Pkm> pokemones) {
        this.efectividades = efectividades;
        this.pokemones = pokemones;
    }

    public HashMap<String, Integer> getEfectividades() {
        return efectividades;
    }

    public void setEfectividades(HashMap<String, Integer> efectividades) {
        this.efectividades = efectividades;
    }

    public ArrayList<Pkm> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pkm> pokemones) {
        this.pokemones = pokemones;
    }

    @Override
    public String toString() {
        return "Equipo: " + "\n-Pokemones: " + pokemones + " \n-Efectividades:" + efectividades;
    }

   
    
    
}
