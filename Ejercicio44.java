/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio44;

import java.util.Scanner;

/**
 *
 * @author josej
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce el número");
        num= Double.parseDouble(sc.next());
        if (num <0 )
            System.out.println("El numero es negativo");
        else 
            System.out.println("El numero es positivo");
        
    }
    
}
