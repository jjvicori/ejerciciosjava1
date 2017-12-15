
package eejercicio414;

import java.util.Scanner;

public class EEjercicio414 {

    public static void main(String[] args) {
        int a=0,opcion=1;
        do{
           
            switch(opcion){
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Adiós");
                break;
            default:
                
                }
            if(opcion==1)
                opcion=2;
            else //opcion==2
                opcion=1;
            a++;
        
            } while(a<100);
    }
    
}
