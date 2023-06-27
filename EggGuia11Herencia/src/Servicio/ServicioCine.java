package Servicio;

import Entidad.*;
import java.util.*;

public class ServicioCine {
    Random aleatorio = new Random();
    public Cine crearCine() {
        String[][] sala = new String[6][6];
        for (int i = 0; i < sala.length; i++) {
            int cont = 0;
            for (int j = 0; j < sala.length; j++) {

                switch (i) {
                    case 0:
                        cont++;
                        sala[i][j] = "A" + cont;
                        break;
                    case 1:
                        cont++;
                        sala[i][j] = "B" + cont;
                        break;
                    case 2:
                        cont++;
                        sala[i][j] = "C" + cont;
                        break;
                    case 3:
                        cont++;
                        sala[i][j] = "D" + cont;
                        break;
                    case 4:
                        cont++;
                        sala[i][j] = "E" + cont;
                        break;
                    case 5:
                        cont++;
                        sala[i][j] = "F" + cont;
                        break;

                }
            }
        }
        return new Cine(crearPeli(), crearClientes(sala.length), sala, 1000);
    }

    public Pelicula crearPeli() {
        String director = "Pepe";
        String titulo = "De Pepe";
        int duracion = 3;
        int edadmin = 16;

        return new Pelicula(titulo, duracion, edadmin, director);
    }

    public ArrayList<Cliente> crearClientes(int sala) {
        ArrayList<Cliente> clientes = new ArrayList();
        for (Integer i = 0; i < (sala*sala); i++) {
            Cliente cliente = new Cliente();
            cliente.setDinero(aleatorio.nextInt(1001 - 999 + 1) + 999);
            cliente.setEdad(aleatorio.nextInt(18 - 15 + 1) + 15);
            cliente.setNombre(i.toString());
            clientes.add(cliente);
        }
        return clientes;
    }

    public void llenar(Cine cine, String[][] sala) {

        for (Cliente cliente : cine.getCliente()) {
          int cont = 0;
            do {
                int x = aleatorio.nextInt((cine.getSala().length - 1) - 0 + 1) + 0;
                int y = aleatorio.nextInt((cine.getSala().length - 1) - 0 + 1) + 0;
                if (comprobar(x, y, cine.getSala()) && cliente.getEdad() >= cine.getPeli().getEdadmin() && cliente.getDinero() >= cine.getPrecio()) {
                    
                    sala[x][y] += "X";
                    cont = 1;
                    cine.setSala(sala);
                } else {
                    
                    if (cliente.getEdad() < cine.getPeli().getEdadmin()) {
                        System.out.println("Edad minima para ver la pelicula no alcanzada.");
                        cont = 1;
                    }
                    if (cliente.getDinero() < cine.getPrecio()) {
                        System.out.println("Fondos insuficientes.");
                        cont = 1;
                    }
                }
            } while (cont == 0);          
        }
        
        for (String[] sala1 : sala) {
            for (int j = 0; j < sala.length; j++) {
                if (sala1[j].length() < 3) {
                    sala1[j] += " ";
                    cine.setSala(sala);
                }
            }
        }
            
    }
    int cont1 = 0;
    String[][] test = new String[6][6];
    public boolean comprobar(int x, int y, String[][] sala) {
        boolean ocupa = true;
        
        if (cont1 == 0) {
            for (String[] test1 : test) {
                for (int j = 0; j < test.length; j++) {
                    test1[j] = "-";
                }
            }
            cont1++;
        }

        if (!test[x][y].equalsIgnoreCase("*")) {
            test[x][y] = "*";
            System.out.println("Posicion " + x + "/" + y + " no usada.");
        } else {
            System.out.println("Posicion " + x + "/" + y + " usada.");
            ocupa = false;
        }
        return ocupa;
    }

    public void mostrar(Cine cine) {
        System.out.println("------------------");
        System.out.println("Esta seria la sala para ver " + cine.getPeli().getTitulo() + "  por el director " + cine.getPeli().getDirector());

        for (String[] sala : cine.getSala()) {
            for (int j = 0; j < cine.getSala().length; j++) {
                System.out.print(sala[j] + " | ");
            }
            System.out.println("");
        }
    }
    
    public void mostrarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
    
}
