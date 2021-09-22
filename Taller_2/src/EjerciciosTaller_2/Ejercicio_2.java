/*
Ejercicio numero 2: Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
suma, producto, diferencia de los números.
*/
package EjerciciosTaller_2;

import java.util.Scanner;

public class Ejercicio_2{

 
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int num1, num2, sum, mult, rest;
       
        System.out.print("Escriba los dos numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        sum = num1+num2;
        mult = num1*num2;
        rest = num1-num2;
        
        System.out.println("La suma es: "+sum);
        System.out.println("El producto: "+mult);
        System.out.println("La diferencia es: "+rest);
        
        
    }
    
}
