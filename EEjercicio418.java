
package eejercicio418;

import java.util.Scanner;

public class EEjercicio418 {

    public static void main(String[] args) {
        int a,b,num=1,denom=1;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce el PRIMER valor");
        a= sc.nextInt();
        System.out.println("Introduce el SEGUNDO valor");
        b= sc.nextInt();
        for (int i=a;i>=1;i--)
            num=num*i;
        for (int i=b;i>=1;i--)
            denom=denom*i;
        for (int i=a-b;i>=1;i--)
            denom=denom*i;
        System.out.println("El resultado es:"+(num/denom));
        
        

    }
    
}
