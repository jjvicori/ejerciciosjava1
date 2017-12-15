
package eejercicio410;

import java.util.Scanner;

public class EEjercicio410 {

    public static void main(String[] args) {
    
    int A,suma=0;
    boolean exito=true;
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce un número para sumar todos los números naturales anteriores a este:");
    A= sc.nextInt();

           
    for (int i= A-1; i>0; i--){    	
        suma+=i;
        
        
    }  
    System.out.println("El resultado es:" +suma );
    
    }
}
        
    
    

