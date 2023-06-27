
package Entidad;

import java.util.Date;

public class Cuotas {

    private int num;
    private double monto;
    private boolean pago;
    private Date fechaVen;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int num, double monto, boolean pago, Date fechaVen, String formaPago) {
        this.num = num;
        this.monto = monto;
        this.pago = pago;
        this.fechaVen = fechaVen;
        this.formaPago = formaPago;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "\n -Cuota numero=" + num + ", monto=" + monto + ", pago=" + pago + ", fechaVen=" + fechaVen + ", formaPago=" + formaPago;
    }
    
    
}
