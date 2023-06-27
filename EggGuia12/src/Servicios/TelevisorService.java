package Servicios;

import EntidadesEj2.*;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticosService {

    public Televisor crearTelevisor() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Electrodomesticos el = super.crearElectrodomesticos();

        System.out.println("Ingrese la resolucion del televisor.");
        int resolucion = scan.nextInt();

        String afirmacion;
        do {
            System.out.println("Ingrese si posee TDT.S/N");
            afirmacion = scan.next();
        } while (!afirmacion.equalsIgnoreCase("S") && !afirmacion.equalsIgnoreCase("N"));
        boolean tdt = afirmacion.equalsIgnoreCase("s");

        return new Televisor(resolucion, tdt, el.getPrecio(), el.getColor(), el.getConsumo(), el.getPeso());
    }

    @Override
    public void precioFinal(Electrodomesticos el) {
        super.precioFinal(el);
        Televisor tv = (Televisor) el;
        if (tv.getResolucion() > 40) {
            tv.setPrecio(tv.getPrecio() + (tv.getPrecio() * 0.3));
        }
        if (tv.isTdt()) {
            tv.setPrecio(tv.getPrecio() + 500);
        }
    }

}
