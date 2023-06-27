
package Armadura;

public class Armor {

    protected int resistencia = 0;
    protected double salud = 100;
    protected Botas botas;
    protected Guantes guantes;
    protected String colorP;
    protected String colorS;
    protected int bateria = 1000;

    public Armor() {
    }

    public Armor(Botas botas, Guantes guantes, String colorP, String colorS) {
        
        this.botas = botas;
        this.guantes = guantes;
        this.colorP = colorP;
        this.colorS = colorS;
        
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getColorS() {
        return colorS;
    }

    public void setColorS(String colorS) {
        this.colorS = colorS;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    
    
}
