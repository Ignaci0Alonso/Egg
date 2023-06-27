
package EntidadesEj2;



public final class Televisor extends Electrodomesticos{
    
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", tdt=" + tdt + ", precio=" + precio;
    }

    
    
}
