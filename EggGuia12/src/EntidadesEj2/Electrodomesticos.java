
package EntidadesEj2;


public class Electrodomesticos {
    
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, char consumo, Double peso) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
}
