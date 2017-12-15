
package eejercicio419;

import java.util.Scanner;


public class EEjercicio419 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuantos números desea introducir?");
        int n=sc.nextInt();int a, min, max;
        for(int i=0;i<n;i++){
         do{
            System.out.println("Dame un número");
            a=sc.nextInt();
            if(i>0){
                System.out.println("El número es positivo");
            
            }else{
                System.out.println("El número es negativo");
        }while(a!=0);
            System.out.println("Has introducido un 0. El programa ha finalizado");
        }
    
    } 
}
}