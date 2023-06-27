
package EntidadesEj2;


public final class Lavadora extends Electrodomesticos{

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
