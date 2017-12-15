
package eejercicio47;

import java.util.Scanner;

public class EEjercicio47 {

    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce el PRIMER valor");
        num1= Double.parseDouble(sc.next());
        System.out.println("Introduce el SEGUNDO valor");
        num2= Double.parseDouble(sc.next());
        System.out.println("Introduce el TERCER valor");
        num3= Double.parseDouble(sc.next());
        if(num1>num2)
            if(num1>num3)
            System.out.println("El numero mayor es"+num1);
        else
            System.out.println("El numero mayor es"+num3);
        else if (num2>num3)
            System.out.println("El numero mayor es"+num2);
        else
            System.out.println("El numero mayor es"+num3);
    }
    
}
