
package Entidad;

public class Revolver {

    private int pos;
    private int posAgua;

    public Revolver(int pos, int posAgua) {
        this.pos = pos;
        this.posAgua = posAgua;
    }

    public Revolver() {
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public boolean mojar() {
        return this.posAgua == this.pos;
    }
    
    public void siguiente() {
        if (this.pos<6) {
            setPos(this.pos+1);
        } else {
            setPos(1);
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "pos=" + pos + ", posAgua=" + posAgua + '}';
    }
    
    
}
