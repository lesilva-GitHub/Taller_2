/*
Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
toneladas.

 */
package EjerciciosTaller_2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_10 {
    public static void main(String[] args){
        Scanner recibir =  new Scanner(System.in);
        double kg, gr, lbrs,tns;
        
        System.out.print("Digite el peso del objeto en Kg: ");
        kg = recibir.nextDouble();
        
        gr = kg*1000;
        lbrs = kg*2.20462;
        tns = kg*0.001;
        
        System.out.println("\nSu equivalente en Gramos es: "+gr);
        System.out.println("Su equivalente en Libras es: "+lbrs);
        System.out.println("Su equivalente en Toneladas es: "+tns);
    }
    
    
}
