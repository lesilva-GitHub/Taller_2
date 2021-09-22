/*
Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)

*/
package EjerciciosTaller_2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
    Scanner recibir = new Scanner(System.in);
    
    float radio, longitud, area;
    
        System.out.print("Digite el valor del radio: ");
        radio = recibir.nextFloat();
        System.out.println("\nEl valor de la longitud es: "+2*Math.PI*radio);
        area = (float) (3.14*(radio*radio));
        System.out.println("El valor de area es: "+area);

  }
}
