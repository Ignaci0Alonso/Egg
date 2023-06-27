package Servicio;

import Entidad.Perro_1;
import Entidad.Persona_1;
import java.util.*;

public class Ej1_Servicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona_1 crearPersona() {
        System.out.println("Ingrese los siguientes datos: \n- Nombre:");
        String nombre = scan.next();
        System.out.println("- Apellido:");
        String apellido = scan.next();
        System.out.println("- Edad:");
        int edad = scan.nextInt();
        System.out.println("- DNI:");
        long dni = scan.nextLong();

        return new Persona_1(nombre, dni, apellido, edad);
    }

    public Perro_1 crearPerro() {
        System.out.println("Ahora los datos del perro:");
        System.out.println("- Nombre:");
        String nombrem = scan.next();
        System.out.println("- Raza:");
        String raza = scan.next();
        System.out.println("- Tamaño:");
        String tamaño = scan.next();
        System.out.println("- Edad:");
        int edadm = scan.nextInt();

        return new Perro_1(nombrem, raza, edadm, tamaño);
    }

    public void asignarPerro(ArrayList<Persona_1> p1, ArrayList<Perro_1> ap) {
        String adoptar;
        int cont = 0;
        for (Persona_1 persona : p1) {
            System.out.println("--------------------------");
            System.out.println("Lista de perros:");
            for (Perro_1 perro_1 : ap) {
                System.out.println(perro_1.toString());
            }
            do {
                cont = 0;
                System.out.println(persona.getNombre() + ", ingrese el nombre del perro a adoptar.");
                adoptar = scan.next();
                for (Perro_1 perro : ap) {
                    if (adoptar.equalsIgnoreCase(perro.getNombre())) {
                        if (perro.isAdoptado()) {
                            System.out.println("El perro ya ha sido adoptado por otra persona.");
                            
                        } else {
                            perro.setAdoptado(true);
                            persona.setPerro(perro);
                            cont++;
                        }
                    }
                }
            } while (cont == 0);
        }
    }
}
