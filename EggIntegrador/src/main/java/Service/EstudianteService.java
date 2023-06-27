package Service;
import Entities.*;
import java.util.Scanner;
public class EstudianteService {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    public Estudiante crearEstudiante(int num) {
        System.out.println("Ingrese el nombre del estudiante " + num + ".");
        String nombre = consola.nextLine();
        double nota;
        do {
            System.out.println("Ingrese la nota final del estudiante " + num + ".");
            nota = consola.nextDouble();
            if (nota < 1 && nota > 10) {
                System.out.println("Las notas son de 1 a 10. Vuelva a intentar.");
            }
        } while (nota < 1 && nota > 10);
        consola.nextLine();
        return new Estudiante(nombre, nota);
    }
    public double calcularPromedio(Estudiante[] eo) {

        double suma = 0;
        for (Estudiante eo1 : eo) {
            suma += eo1.getNota();
        }
        double promedio = suma / eo.length;

        return promedio;
    }
    public String[] mayoresQuePromedio(Estudiante[] eo) {
        int cont = 0;
        for (Estudiante eo1 : eo) {
            if (eo1.getNota() > calcularPromedio(eo)) {
                cont++;
            }
        }
        String[] mayoresPromedio = new String[cont];
        int cont1 = 0;
        for (Estudiante eo1 : eo) {
            if (eo1.getNota() > calcularPromedio(eo)) {
                mayoresPromedio[cont1] = eo1.getNombre();
                cont1++;
            }
        }
        return mayoresPromedio;
    }

    public double[] mayoresNotasQuePromedio(Estudiante[] eo) {
        int cont = 0;
        for (Estudiante eo1 : eo) {
            if (eo1.getNota() > calcularPromedio(eo)) {
                cont++;
            }
        }
        double[] notas = new double[cont];
        int cant = 0;
        for (Estudiante eo1 : eo) {
            if (eo1.getNota() > calcularPromedio(eo)) {
                notas[cant] = eo1.getNota();
                cant++;
            }
        }
        return notas;
    }
}
