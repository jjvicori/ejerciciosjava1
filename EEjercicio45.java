
package eejercicio45;

import java.util.Scanner;

public class EEjercicio45 {

    public static void main(String[] args) {
        double numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el numero");
        numero= Double.parseDouble(sc.next());
        
        if (numero%2==0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
                
    }
    
}
