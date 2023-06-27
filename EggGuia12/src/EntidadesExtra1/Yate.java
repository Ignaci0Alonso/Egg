
package EntidadesExtra1;

import java.util.Date;

public class Yate extends Barco{

    protected int cv;
    protected int camarotes;

    public Yate() {
    }

    public Yate(int cv, int camarotes, int matricula, int metros, Date fabricacion) {
        super(matricula, metros, fabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        return "Yate: " + "matricula= " + matricula + ", metros de eslora= " + metrosEslora + ", cv= " + cv + ", camarotes= " + camarotes + ", fecha de fabricacion= " + fabricacion ;
    }
    
    
    
}
