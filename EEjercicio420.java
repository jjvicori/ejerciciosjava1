
package eejercicio420;

import java.util.Scanner;


public class EEjercicio420 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=0,pos=0,suma=0;
       
          System.out.println("Para salir ingresa cero");
         
        do{
          System.out.println("Introduce número:");
              b=sc.nextInt();
             
              suma=suma+b;
              
              if(b!=0)
                pos++;
              
        }while(b!=0);
              System.out.println("El programa ha finalizado, dado que has puesto un cero");              
               System.out.println("El resultado es:"+(double)suma/pos);
 
        
        
    }
    
}
