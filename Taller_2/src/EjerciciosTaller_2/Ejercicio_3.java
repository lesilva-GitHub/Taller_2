/*
 Ejercicio 3: Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativa
 */
package EjerciciosTaller_2;

import java.util.Scanner;

public class Ejercicio_3 {    
    public static void main(String[] args) {
    Scanner recibir = new Scanner(System.in);
    
    float valor1, valor2, valor3, sum, produc, coc, mod;
    
        System.out.print("Ingrese los 3 valores: ");
        valor1 = recibir.nextFloat();
        valor2 = recibir.nextFloat();
        valor3 = recibir.nextFloat();
        
        sum = valor1+valor2+valor3;
        produc = valor1*valor2*valor3;
        coc = valor1/valor2/valor3;
        mod = valor1%valor2%valor3;
        
        System.out.println("La suma es: "+sum);
        System.out.println("El producto es: "+produc);
        System.out.println("El cociente es: "+coc);
        System.out.println("El modulo es: "+mod);
    }
}
    
