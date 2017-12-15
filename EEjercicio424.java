
package eejercicio424;

import java.util.Scanner;

public class EEjercicio424 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        
        System.out.println("Introduce un número para averiguar el resultado de la nota");
        n = sc.nextInt();
        if(n<0)
            System.out.println("El numero introducido es negativo");
        else if(n<3)
            System.out.println("Muy deficiente");
        else if( n<5)
            System.out.println("Insuficiente");
        else if( n<6)
            System.out.println("Suficiente");
        else if( n<7)
            System.out.println("Bien");
        else if( n<9)
            System.out.println("Notable");
        else if(n<=10)
            System.out.println("Sobresaliente");
        else if(n>10)
            System.out.println("El numero introducido no corresponde a ninguna nota");
        
        }
    }
