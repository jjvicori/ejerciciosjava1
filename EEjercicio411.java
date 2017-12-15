
package eejercicio4.pkg11;

import java.util.Scanner;

public class EEjercicio411 {

    public static void main(String[] args) {
        
        double numero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce para factorizar");
        numero= Double.parseDouble(sc.next());
        double factorial = 1;
         while ( numero>0) {
         factorial*=numero;
            numero--;
}
   System.out.println(factorial);

    }
    
    
    
    
    
            
        
    }
    