/*
Se desea un aplicativo en Java que muestre por consola el texto de un menú con cinco opciones. Para ello, se solicita
utilizar solo una instrucción de impresión.
 */
package EjerciciosTaller_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("\n1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");
 
            try {
 
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("\n¡Has seleccionado la opcion 1!");
                        break;
                    case 2:
                        System.out.println("¡Has seleccionado la opcion 2!");
                        break;
                    case 3:
                        System.out.println("¡Has seleccionado la opcion 3!");
                        break;
                    case 4:
                        System.out.println("¡Has seleccionado la opcion 4!");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}
