
package EntidadesExtra1;

import java.util.Date;

public class Velero extends Barco{

    protected int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, int metros, Date fabricacion) {
        super(matricula, metros, fabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int getMetrosEslora() {
        return metrosEslora;
    }

    @Override
    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    @Override
    public Date getFabricacion() {
        return fabricacion;
    }

    @Override
    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Velero: " + "matricula= " + matricula + ", metros de eslora= " + metrosEslora + "mastiles=" + mastiles + "fecha de fabricacion= " + fabricacion;
    }
    
    
    
}
