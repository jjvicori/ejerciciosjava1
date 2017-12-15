
package eejercicio416;

import java.util.Scanner;

public class EEjercicio416 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuantos números desea introducir?");
        int n=sc.nextInt();int a, min=0, max=0;
        for(int i=0;i<n;i++){
         //   do{
            System.out.println("Dame un numero positivo");
            a=sc.nextInt();
         //   }while(a!=0);
        if(i==0){
            min=a;
            max=a;
            
        }else{
            if (a>max)
            max = a;
            else if (a<min)
            min = a;
            
                }
                } 

        System.out.println("El minimo es:"+min);
        System.out.println("El maximo es:"+max);
        


    }
}
    

