package Main;

import EntidadesEjTeoria.*;
import EntidadesEj1.*;
import EntidadesEj2.*;
import EntidadesEj4.*;
import EntidadesExtra1.*;
import Servicios.*;
import ServiciosExtra1.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //---------- EJERCICIO DE TEORIA ----------//
//        AnimalTeoria g1 = new GatoTeoria("Naranjado", "Gato");
//        AnimalTeoria p1 = new PerroTeoria("Beagel", "Perro");
//        
//       
//        System.out.println("-------------");
//        System.out.println(g1.toString());
//        g1.hacerRuido();
//        System.out.println("-------------");
//        System.out.println(p1.toString());
//        p1.hacerRuido();
//
//
        //---------- EJERCICIO 1 ----------//
//        
//        Animal g1 = new Gato("Meme", "Carnivoros", "Naranja", 10);
//        Animal p1 = new Perro("Lolo", "Carnivoros", "Chiuaua", 8);
//        Animal c1 = new Caballo("Tata", "Herbivoros","Pura Sangre", 4);
//        
//        System.out.println("-------------");
//        System.out.println(p1.toString());
//        p1.alimentacion();
//        System.out.println("-------------");
//        System.out.println(g1.toString());
//        g1.alimentacion();
//        System.out.println("-------------");
//        System.out.println(c1.toString());
//        c1.alimentacion();
//
//
        //---------- EJERCICIO 2 ----------//
//        
//        ArrayList<Electrodomesticos> electro = new ArrayList();
//        ElectrodomesticosService es = new ElectrodomesticosService();
//        LavadoraService lvs = new LavadoraService();
//        TelevisorService tvs = new TelevisorService();
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Creando lavadora...");
//            Electrodomesticos lav = lvs.crearLavadora();
//            System.out.println("Creando televisor...");
//            Electrodomesticos tel = tvs.crearTelevisor();
//            electro.add(tel);
//            electro.add(lav);
//        }
//        
//        for (Electrodomesticos electrodomestico : electro) {
//            if (electrodomestico instanceof Lavadora) {
//                lvs.precioFinal(electrodomestico);
//            }
//            if (electrodomestico instanceof Televisor) {
//                tvs.precioFinal(electrodomestico);
//            }
//        }
//        es.precios(electro);
//
//
        //---------- EJERCICIO 4 -------------//
//
//        Circulo circ = new Circulo(5);
//        Rectangulo rect = new Rectangulo(10, 5);
//        
//        System.out.println("Area del circulo: " + circ.calcularArea());
//        System.out.println("Perimetro del circulo: " + circ.calcularPerimetro());
//        System.out.println("------------------------------------");
//        System.out.println("Area del rectangulo: " + rect.calcularArea());
//        System.out.println("Perimetro del rectangulo: " + rect.calcularPerimetro());
//
//
        //---------- EJERCICIO 1 extra ------------//
//
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        YateService ys = new YateService();
        VeleroService vs = new VeleroService();
        MotorService ms = new MotorService();
        Barco yo = ys.crearYate(20, 2);
        Barco vo = vs.crearVelero(2);
        Barco mo = ms.creatMotor(20);
        Barco barco = null;
        int tipo;
        do {
            System.out.println("Que tipo de barco desea alquilar? \n1- A motor\n2- Velero\n3- Yate\n4- Mostrar barcos");
            tipo = scan.nextInt();
            switch (tipo) {
                case 1:
                    System.out.println("Seleccionó a motor");
                    barco = mo;
                    break;
                case 2:
                    System.out.println("Seleccionó velero");
                    barco = vo;
                    break;
                case 3:
                    System.out.println("Seleccionó yate");
                    barco = yo;
                    break;
                case 4:
                    System.out.println("-------------------");
                    System.out.println(mo.toString());
                    System.out.println("-------------------");
                    System.out.println(vo.toString());
                    System.out.println("-------------------");
                    System.out.println(yo.toString());
                    System.out.println("-------------------");
                    break;
            }
            
        } while ((tipo > 3 || tipo < 1));
        
        double precioFinal = 0;
        AlquilerService as = new AlquilerService();
        Alquiler alquiler = as.crearAlquiler(tipo, barco);
        if (alquiler.getBarco() instanceof Velero) {
            precioFinal = vs.precioFinal(alquiler);
        }
        if (alquiler.getBarco() instanceof Motor) {
            precioFinal = ms.precioFinal(alquiler);
        }
        if (alquiler.getBarco() instanceof Yate) {
            precioFinal = ys.precioFinal(alquiler);
        }
        System.out.println("El precio total por el alquiler sera: $" + precioFinal);
            
    }

}
