
package Entidad;

import java.util.*;

public class Poliza {
    
    private HashSet<Vehiculo> vehiculo;
    private ClientesVehiculos cliente;
    private int nPoliza;
    private Date fechaI;
    private Date finpol;
    private int numcuotas;
    private ArrayList<Cuotas>cuotas;
    private double monto;
    private boolean granizo;
    private double montoGran;
    private String cobertura;

    public Poliza() {
    }

    public Poliza(HashSet<Vehiculo> vehiculo, ClientesVehiculos cliente, int nPoliza, Date fechaI, Date finpol, int numcuotas, ArrayList<Cuotas> cuotas, double monto, boolean granizo, double montoGran, String cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.nPoliza = nPoliza;
        this.fechaI = fechaI;
        this.finpol = finpol;
        this.numcuotas = numcuotas;
        this.cuotas = cuotas;
        this.monto = monto;
        this.granizo = granizo;
        this.montoGran = montoGran;
        this.cobertura = cobertura;
    }

    public int getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(int nPoliza) {
        this.nPoliza = nPoliza;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFinpol() {
        return finpol;
    }

    public void setFinpol(Date finpol) {
        this.finpol = finpol;
    }

    public ArrayList<Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoGran() {
        return montoGran;
    }

    public void setMontoGran(double montoGran) {
        this.montoGran = montoGran;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public HashSet<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(HashSet<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ClientesVehiculos getCliente() {
        return cliente;
    }

    public void setCliente(ClientesVehiculos cliente) {
        this.cliente = cliente;
    }

    public int getNumcuotas() {
        return numcuotas;
    }

    public void setNumcuotas(int numcuotas) {
        this.numcuotas = numcuotas;
    }

    @Override
    public String toString() {
        return  "\n-Numero de Poliza= " + nPoliza + "\n-Cliente= " + cliente + "\n-Vehiculo= " + vehiculo + "\n-Fecha de Inicio= " + fechaI + "\n-Fin de la Poliza= " + finpol + "\n-Numero de Cuotas=" + numcuotas + "\n-Cuotas= " + cuotas + "\n-Monto= " + monto + "\n-Granizo= " + granizo + "\n-Monto por Granizo= " + montoGran + "\n-Tipo de Cobertura= " + cobertura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.vehiculo);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        hash = 97 * hash + this.nPoliza;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Poliza other = (Poliza) obj;
        return true;
    }
    
    
    
}
