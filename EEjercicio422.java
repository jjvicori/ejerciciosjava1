    
package eejercicio422;

import java.util.Scanner;


public class EEjercicio422 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p;
        System.out.println("Introduce un número entero: ");
        n = sc.nextInt();
        if(n%2!=0&&n%3!=0&&n%5!=0&&n%7!=0&&n%11!=0)
            System.out.println("El número introducido no es primo");
        else
            System.out.println("El número introducido es primo");
        
        
    }
    
}
