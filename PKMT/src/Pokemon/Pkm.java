
package Pokemon;

import java.util.*;

public class Pkm {

    private HashSet<String> tipos; 
    private HashSet<String> debilidades;

    public Pkm() {
    }

    public Pkm(HashSet<String> tipos, HashSet<String> debilidades) {
        this.tipos = tipos;
        this.debilidades = debilidades;
    }

    public HashSet<String> getTipos() {
        return tipos;
    }

    public void setTipos(HashSet<String> tipos) {
        this.tipos = tipos;
    }

    public HashSet<String> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(HashSet<String> debilidades) {
        this.debilidades = debilidades;
    }

    @Override
    public String toString() {
        return  "\n  -Tipos: " + tipos + ",  debilidades: " + debilidades;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.tipos);
        hash = 23 * hash + Objects.hashCode(this.debilidades);
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
        final Pkm other = (Pkm) obj;
        if (!Objects.equals(this.tipos, other.tipos)) {
            return false;
        }
        return Objects.equals(this.debilidades, other.debilidades);
    }

    
}
