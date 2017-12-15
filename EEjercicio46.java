
package eejercicio46;

import java.util.Scanner;

public class EEjercicio46 {

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un valor");
        num1= Double.parseDouble(sc.next());
        System.out.println("Introduce el otro valor");
        num2= Double.parseDouble(sc.next());
        if (num1%num2==0|| num2%num1==0)
            System.out.println("Se han podido dividir los dos valores con éxito");
        else
            System.out.println("Los dos valores no se han podido dividir de forma exacta");
    }
    
}
