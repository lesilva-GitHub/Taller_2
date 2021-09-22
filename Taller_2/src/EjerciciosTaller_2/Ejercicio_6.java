/*
Desarrolle un programa en java que calcule el índice de masa corporal IMC el cual está dado por la formula (pesoenKg
/ alturaenmetros*alturaenmetros)
 */
package EjerciciosTaller_2;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args){
        Scanner recibir = new Scanner(System.in);
        float  peso, estatura, imc;
        
        System.out.print("Escriba su peso: ");
        peso = recibir.nextFloat();
        System.out.print("Digite su estatura: ");
        estatura = recibir.nextFloat();
        
        imc = peso/(estatura*estatura);
        System.out.println("Su IMC es: "+imc);
        
        if (imc < 18.5) {
            System.out.println("\nUsted esta Bajo de peso ");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("\nUsted tiene un peson Normal");
        } else if (imc  >= 25 && imc <= 29.9){
            System.out.println("\nUsted tiene Sobre peso");
        } else {
            System.out.println("\nUsted tiene Obesidad");
        }
    }
}
