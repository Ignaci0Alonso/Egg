package Servicio;

import Entidad.Alumno;
import java.util.*;

public class Simulacion {

    Random aleatorio = new Random();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> crearAlumnos() {
        
        ArrayList<Alumno> alumnos = new ArrayList();
        int cant=0;
        do {
            System.out.println("Cuantos alumnos habra?");
            cant = scan.nextInt();
            if (cant<4) {
                System.out.println("Debe haber por lo menos 4 alumnos.");
            }
        } while (cant<4);
        
        for (int i = 0; i < cant; i++) {
            alumnos.add(new Alumno(crearNombre(), aleatorio.nextInt(60000000 - 20000000 + 1) + 20000000));
        }
        
        return alumnos;
    }

    public String crearNombre() {

        String[] nombre = {"PEDRO", "LUIS", "JUAN", "JULIAN", "FERNANDO"};
        String[] apellido = {"MARTINEZ", "MONTEROS", "ROJAS", "FERNANDEZ", "CHIQUITO"};

        int numNombre = aleatorio.nextInt(4 - 0 + 1) + 0;
        int numApellido = aleatorio.nextInt(4 - 0 + 1) + 0;
        String nomCompleto = nombre[numNombre] + " " + apellido[numApellido];

        return nomCompleto;
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        
        for (Alumno alumno : alumnos) {
            System.out.println("------------------------------");
            System.out.println(alumno.toString());
        }
    }
    
    public void votacion(ArrayList<Alumno> alumnos) {
        int voto = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            ArrayList<Integer> listVotos = new ArrayList();
            ArrayList<Alumno> listAlumn = new ArrayList();
            for (int j = 0; j < 3; j++) {
                boolean fin = true;
                while(fin) {
                    voto = aleatorio.nextInt((alumnos.size()-1) - 0 + 1) + 0;
                    fin = false;
                    for (Integer voto1 : listVotos) {
                        if (voto1 == voto) {
                            fin = true;
                            break;
                        }
                    }
                    if (voto == i) {
                        fin = true;
                    }
                }
                alumnos.get(voto).setCantVotos(alumnos.get(voto).getCantVotos()+1);
                listVotos.add(voto);
                listAlumn.add(alumnos.get(voto));
            }
            alumnos.get(i).setVotos(listAlumn);
            System.out.println("------------------------------");
            alumnos.get(i).Votos();
        }
    }

}
