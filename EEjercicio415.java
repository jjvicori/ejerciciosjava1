
package eejercicio415;

import java.util.Scanner;

public class EEjercicio415 {

    public static void main(String[] args) {
           
        int numero1, numero2, resto,max=0,min=0;
            Scanner sc= new Scanner (System.in);
            do{
                    do{
                        System.out.println("Introduce el valor múltiplo de 3");
                        numero1= sc.nextInt();
                    }while(numero1<=0);
                    do{
                        System.out.println("Introduce un valor para contar los múltiplos de 3 comprendidos entre este y el valor anterior");
                        numero2= sc.nextInt();
                    }while(numero2<=0);

                    if (numero1>numero2){
                        max=numero1;
                        min=numero2;
                    }else if(numero2> numero1){
                        min=numero1;
                        max=numero2;
                    }else
                        System.out.println("Los dos números deben ser distintos y mayores que 0");
            }while(max==0);{
                    for (int i= min; i <max; i++)  	
                if(i%3==0)
                System.out.println("Los múltiplos de 3 son:" +i);
            }
            
    
    }
    
}
