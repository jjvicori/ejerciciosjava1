
package eejercicio421;

import java.util.Scanner;

public class EEjercicio421 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n*i);
        
    }
    
}
}