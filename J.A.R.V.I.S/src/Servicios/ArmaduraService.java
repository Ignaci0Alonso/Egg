package Servicios;

import Armadura.Armor;
import Armadura.Botas;
import Armadura.Guantes;
import java.util.Scanner;

public class ArmaduraService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Armor crearArmadura() {

        System.out.println("Iniciando creacion de armadura...");
        System.out.println("Ingrese los siguientes datos:");

        Botas botas = new Botas();
        Guantes guantes = new Guantes();
        
        System.out.println("Color priario:");
        String colorP = scan.next();
        System.out.println("Color secundario:");
        String colorS = scan.next();

        return new Armor(botas, guantes, colorP, colorS);
    }

    public int movilidad(Armor mark) {
        
        System.out.println("Cuantos turnos?");
        int turnos = scan.nextInt();
        
        int energiaGastada;
        
            case 1:
                energiaGastada = turnos * 50;
                if (energiaGastada > mark.getBotas().getEnergia()) {
                System.out.println("Energia insuficiente.");
                } else {
                mark.getBotas().setEnergia(mark.getBotas().getEnergia() - energiaGastada);
                System.out.println("Durante este turno estas caminando.");
                }
                break;
            case 2:
                energiaGastada = turnos * 100;
                if (energiaGastada > mark.getBotas().getEnergia()) {
                System.out.println("Energia insuficiente.");
                } else {
                mark.getBotas().setEnergia(mark.getBotas().getEnergia() - energiaGastada);
                System.out.println("Durante este turno estas corriendo.");
                }
                break;
            case 3:
                energiaGastada = turnos * 150;
                int energiaGuantes = turnos * 100;
                if (energiaGastada > mark.getBotas().getEnergia() || energiaGuantes > mark.getGuantes().getEnergia()) {
                System.out.println("Energia insuficiente.");
            
            } else {
                mark.getBotas().setEnergia(mark.getBotas().getEnergia() - energiaGastada);
                mark.getGuantes().setEnergia(mark.getGuantes().getEnergia() - energiaGuantes);
                System.out.println("Durante este turno estas volando.");
                }
                break;
        
        
        
        return turnos;

    }
    
    public int correr(Armor mark) {
        
    }

    public void disparo(Armor mark) {
        mark.getGuantes().setEnergia(mark.getGuantes().getEnergia()-150);
    }
    
    public void comandos(Armor mark) {
        mark.setBateria(mark.getBateria() - 25);
    }
    
    public void sintetizador(Armor mark) {
        mark.setBateria(mark.getBateria() - 25);
    }
    
    public void danioRecibido() {
        
    }
}
