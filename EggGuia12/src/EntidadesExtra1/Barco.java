
package EntidadesExtra1;

import java.util.Date;

public class Barco {

    protected int matricula;
    protected int metrosEslora;
    protected Date fabricacion;

    public Barco() {
    }
    
    public Barco(int matricula, int metrosEslora, Date fabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.fabricacion = fabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    
    
    
}
