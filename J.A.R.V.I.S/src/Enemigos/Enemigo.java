
package Enemigos;

public class Enemigo {

    private boolean estado = true;
    private int melee = 2;

    public Enemigo() {
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMelee() {
        return melee;
    }

    public void setMelee(int melee) {
        this.melee = melee;
    }
    
    
    
}
