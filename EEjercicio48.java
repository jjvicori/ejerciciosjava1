
package eejercicio48;

import java.util.Scanner;

public class EEjercicio48 {

    public static void main(String[] args) {

    double A,B,C;      
    Scanner sc= new Scanner (System.in);
    System.out.println("Introduce el valor A");
    A= Double.parseDouble(sc.next());
    System.out.println("Introduce el valor B");
    B= Double.parseDouble(sc.next());
    System.out.println("Introduce el valor C");
    C= Double.parseDouble(sc.next());
    if ((A) >= (B)+(C))
        System.out.println("No existe triángulo");
    if ((A*A)==(B*B)+(C*C))
        System.out.println("El triangulo es RECTANGULO");
    else if((A*A)>(B*B)+(C*C))
        System.out.println("El triangulo es OBSTUSANGULO");
    else
        System.out.println("El triangulo es ACUTANGULO");
   
            
        
    }

}
