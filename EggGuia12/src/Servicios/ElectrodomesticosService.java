package Servicios;

import EntidadesEj2.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectrodomesticosService {

    
    public Electrodomesticos crearElectrodomesticos(){
        Electrodomesticos el = new Electrodomesticos();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Color: (blanco, negro, rojo, azul y gris.");
        el.setColor(scan.next());
        if (comprobarColor(el.getColor())) {
            el.setColor("blanco");
        }
        System.out.println("Consumo: (de la 'A' a la 'F')");
        el.setConsumo(scan.next().toUpperCase().charAt(0));
        if (comprobarConsumoEnergetico(el.getConsumo())) {
            el.setConsumo('F');
        }
        
        el.setPrecio(1000d);
        
        System.out.println("Peso:(en Kg)");
        el.setPeso(scan.nextDouble());
        
        return el;
    }
    
    public boolean comprobarConsumoEnergetico(char letra) {
        return letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F';
    }
    
    public boolean comprobarColor(String color) {
        return !color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("gris");
    }
    
    public void precioFinal(Electrodomesticos el){
        double precioConsumo;
        double precioPeso;
        switch (el.getConsumo()) {
            case 'A':
                precioConsumo = 1000;
                break;
            case 'B':
                precioConsumo = 800;
                break;
            case 'C':
                precioConsumo = 600;
                break;
            case 'D':
                precioConsumo = 500;
                break;
            case 'E':
                precioConsumo = 300;
                break;
            case 'F':
                precioConsumo = 100;
                break;
            default:
                precioConsumo = 0;
                break;
        }
        if (el.getPeso()>=1 && el.getPeso()<20) {
            precioPeso=100;
        }else if (el.getPeso()>=20 && el.getPeso()<50) {
            precioPeso=500;
        }else if (el.getPeso()>=50 && el.getPeso()<80) {
            precioPeso=800;
        }else if (el.getPeso()>=80) {
            precioPeso=1000;
        }else {
            precioPeso=0;
        }
        el.setPrecio(el.getPrecio() + precioPeso + precioConsumo);
    }
    
    public void precios(ArrayList<Electrodomesticos> electro) {
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Lavadoras: ");
        double sumalav = 0;
        for (Electrodomesticos aux : electro) {
            if (aux instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) aux;
                
                System.out.println("$" + lavadora.getPrecio());
                sumalav += lavadora.getPrecio();
            }
            
        }
        System.out.println("Precio total lavadoras: $" + sumalav);
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Televisores:");
        double sumatel = 0;
        for (Electrodomesticos aux : electro) {
            
            if (aux instanceof Televisor) {
                Televisor tele = (Televisor) aux;
                
                System.out.println("$" + tele.getPrecio());
                sumatel += tele.getPrecio();
            }
        }
        System.out.println("Precio total televisores: $" + sumatel);
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Total:");
        System.out.println("Precio total electrodomesticos: $" + (sumatel + sumalav));
        System.out.println("");
        System.out.println("---------------------------------");
    }





}
