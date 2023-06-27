
package EntidadesExtra1;

import java.util.Date;

public class Motor extends Barco{

    protected int cv;

    public Motor() {
    }

    public Motor(int cv, int matricula, int metrosEslora, Date fabricacion) {
        super(matricula, metrosEslora, fabricacion);
        this.cv = cv;
    }
      
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
        return "Motor: " + "matricula= " + matricula + ", metros de eslora= " + metrosEslora + "cv=" + cv + ", fecha de fabricacion= " + fabricacion;
    }
    
    
    
}
