
package Programas_Clase;

import java.util.Scanner;
import java.lang.Math;

public class Programa_01 {
    
    public static void main(String[] args){
        
        /*Declarar Variables*/
        int numero1, numero2, maximo, minimo;
        
        Scanner lectura = new Scanner(System.in);
        
        /*Entrada de datos*/
        System.out.print("Ingrese el primer numero: ");
        numero1 = lectura.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2 = lectura.nextInt();
        
        
        maximo = Math.max(numero1, numero2);//solo permite 2 varibles,
        minimo = Math.min(numero1, numero2);//solo permite 2 varibles,
        
        System.out.println("\tResultados");
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        
    }

}
