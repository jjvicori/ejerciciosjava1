
package otro411y412;

import java.util.Scanner;

public class Otro411y412 {

    public static void main(String[] args) {
       
        double factorial = 1;
        double numero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un valor:");
        numero= Double.parseDouble(sc.next());
        while ( numero!=0) {
        factorial=factorial*numero;
        numero--;
        
}
        System.out.println(factorial);
    
    }
    
}
