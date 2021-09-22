/*
Escriba un programa en java que lea dos datos de tipo entero, los almacene en dos variables num1 y num2, y ejecute
las siguientes instrucciones, analice los resultados:
a) System.out.printf(”x = %d\n", x );
b) System.out.printf(“El valor de %d + %d es %d\n”, x, x, ( x + x ) );
c) System.out.printf(“x=%.2f”, x );
d) System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );

 */
package EjerciciosTaller_2;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.print("Ingrese el primer numero: ");
        num1 = num.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = num.nextInt();

        System.out.println("X = " + num1);
        System.out.println("El valor de X + X es " + (num1 + num1));
        System.out.println((num1 + num2) + " - " + (num2 + num1));
    }

}
