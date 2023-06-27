
package JuegoServicio;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void jugar(){
        int num;
        int cont = 0;
        
        Random aleatorio = new Random();
        int num1 = aleatorio.nextInt(1,20);
        System.out.println("adivinar: " + num1);
        boolean no = true;
        while (no){
            
            cont++;
            System.out.println("Ingrese un numero del 1 al 20");
            
            try {
                
                num = scan.nextInt();
                if (num == num1) {
                System.out.println("Ganaste!");
                    System.out.println("En: " + cont + " intentos.");
                    no = false;
                }else if (num<num1) {
                    System.out.println("El numero a adivinar es mayor.");
                }else {
                    System.out.println("El numero a adivinar es menor.");
                }
                
            }catch (InputMismatchException e){
                
                System.out.println("El juego solo admite numeros.");
                scan.next();
                
            }
            
        } 
    }
    
}
